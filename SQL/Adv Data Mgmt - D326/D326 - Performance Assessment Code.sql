	CREATE OR REPLACE FUNCTION calculate_retention_days(cust_id INT)
	RETURNS INT LANGUAGE plpgsql AS $$
	DECLARE
		first_rental DATE;
		second_rental DATE;
	BEGIN
		-- Get the first rental date
		SELECT MIN(rental_date)::date INTO first_rental
		FROM rental
		WHERE customer_id = cust_id;

		-- Get the second rental date
		SELECT MIN(rental_date)::date INTO second_rental
		FROM rental
		WHERE customer_id = cust_id
		AND rental_date::date > first_rental;

		-- Calculates the difference in days via CASE expression if second_rental is not NULL
		RETURN CASE 
            WHEN second_rental IS NOT NULL THEN second_rental - first_rental
            ELSE NULL
        END;
	END;
	$$;




	-- Creates summary table
	CREATE TABLE customer_retention_summary (
		store_id INT PRIMARY KEY,
		new_customers_retained INT
	);


	-- Creates detailed table
	CREATE TABLE customer_retention_details (
		store_id INT PRIMARY KEY,
		avg_retention_days NUMERIC
	);




	SELECT
		i.store_id,
		AVG(calculate_retention_days(c.customer_id)) AS avg_retention_days
	FROM customer c
    INNER JOIN rental r ON c.customer_id = r.customer_id
    INNER JOIN inventory i ON r.inventory_id = i.inventory_id
    GROUP BY i.store_id;




    CREATE OR REPLACE FUNCTION update_summary_table()
    RETURNS TRIGGER LANGUAGE plpgsql AS $$
    BEGIN
        -- Deletes existing summary for this store
        DELETE FROM customer_retention_summary WHERE store_id = NEW.store_id;
    
        -- Inserts updated summary
        INSERT INTO customer_retention_summary (store_id, new_customers_retained)
        SELECT 
            NEW.store_id,
            COUNT(*) FILTER (WHERE calculate_retention_days(c.customer_id) <= 90)
        FROM customer c
        INNER JOIN rental r ON c.customer_id = r.customer_id
        INNER JOIN inventory i ON r.inventory_id = i.inventory_id
        WHERE i.store_id = NEW.store_id;

        RETURN NEW;
    END;
    $$;

    CREATE TRIGGER update_summary_after_detail_change
    AFTER INSERT OR UPDATE ON customer_retention_details
    FOR EACH ROW
    EXECUTE FUNCTION update_summary_table();




    CREATE OR REPLACE PROCEDURE refresh_retention_tables()
    LANGUAGE plpgsql AS $$
    BEGIN
        -- Truncates both tables
        TRUNCATE TABLE customer_retention_details, customer_retention_summary;

        -- Renews detailed table
        INSERT INTO customer_retention_details (store_id, avg_retention_days)
        SELECT
            i.store_id,
            AVG(calculate_retention_days(c.customer_id)) AS avg_retention_days
        FROM customer c
        INNER JOIN rental r ON c.customer_id = r.customer_id
        INNER JOIN inventory i ON r.inventory_id = i.inventory_id
        GROUP BY i.store_id;

        COMMIT;
    END;
    $$;

    -- Calls the procedure to refresh data
    CALL refresh_retention_tables();