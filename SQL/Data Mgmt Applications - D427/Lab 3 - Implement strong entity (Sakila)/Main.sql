/*
The diagram uses Sakila naming conventions. Follow the Sakila conventions for your table and column names:

All lower case
Underscore separator between root and suffix
Foreign keys have the same name as referenced primary key
Write CREATE TABLE and ALTER TABLE statements that:

Implement the entity as a new phone table.
Implement the has relationships as foreign keys in the Sakila customer, staff, and store tables.
Remove the existing phone column from the Sakila address table.
Step 2 requires adding a foreign key constraint to an existing table. Ex:

ALTER TABLE customer 
  ADD FOREIGN KEY (phone_id) REFERENCES phone(phone_id)
  ON DELETE SET NULL
  ON UPDATE CASCADE;
Specify data types as follows:

phone_id, phone_number, and country_code have data type INT.
phone_type has data type VARCHAR(12) and contains strings like 'Home', 'Mobile', and 'Other'.
Apply these constraints:

NOT NULL and UNIQUE constraints correspond to cardinalities on the diagram above.
Foreign key actions are SET NULL for delete rules and CASCADE for update rules.
Specify a suitable column as the phone table primary key.
*/


/* Creates a phone table to store phone numbers with a type constraint */
CREATE TABLE phone (
  phone_id INT NOT NULL,
  country_code INT NOT NULL,
  phone_number INT NOT NULL,
  phone_type VARCHAR(12) CHECK (phone_type = "Home" OR "Mobile" OR "Other"),
  PRIMARY KEY (phone_id)
);

/* Adds a unique phone_id column to the customer table and sets up a foreign key reference */
ALTER TABLE customer
ADD phone_id INT UNIQUE,
ADD FOREIGN KEY (phone_id) REFERENCES phone(phone_id)
ON DELETE SET NULL
ON UPDATE CASCADE;

/* Adds a unique phone_id column to the staff table and sets up a foreign key reference */
ALTER TABLE staff
ADD phone_id INT UNIQUE,
ADD FOREIGN KEY (phone_id) REFERENCES phone(phone_id)
ON DELETE SET NULL
ON UPDATE CASCADE;

/* Adds a unique phone_id column to the store table and sets up a foreign key reference */
ALTER TABLE store
ADD phone_id INT UNIQUE,
ADD FOREIGN KEY (phone_id) REFERENCES phone(phone_id)
ON DELETE SET NULL
ON UPDATE CASCADE;

/* Removes the existing phone column from the address table */
ALTER TABLE address
DROP phone;