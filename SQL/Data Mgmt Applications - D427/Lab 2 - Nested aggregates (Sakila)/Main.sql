/*
Refer to the film and inventory tables of the Sakila database. The tables in this lab have the same columns and data types but fewer rows.

Write a query that lists the titles of films with the fewest rows in the inventory table.
*/

/* Selects film titles that have the lowest number of copies in inventory */
SELECT title
FROM film
INNER JOIN inventory
ON film.film_id = inventory.film_id
GROUP BY title
HAVING COUNT(inventory.film_id) =
  ( SELECT MIN(count_film_id) FROM 
      ( SELECT COUNT(film_id) AS count_film_id
        FROM inventory
        GROUP BY film_id ) 
    AS temp_table );