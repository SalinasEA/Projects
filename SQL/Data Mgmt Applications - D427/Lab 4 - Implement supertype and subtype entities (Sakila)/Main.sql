/*
In the Sakila database, the customer and staff tables have several common columns.
Convert these tables into subtypes of person.
Specifically, write CREATE TABLE statements for person, customer, and staff that implement this ER diagram:

Follow Sakila conventions for table and column names:

All lower case
Underscore separator between root and suffix
Foreign keys have the same name as referenced primary key
Implement attributes as columns:

All columns are NOT NULL.
The primary key of all three tables is person_id with data type SMALLINT UNSIGNED.
The last_update and create_date columns have data type TIMESTAMP.
The picture column has data type BLOB.
All other columns have data type VARCHAR(20).
Implement the belongs_to and works_at relationships as foreign keys:

belongs_to becomes an address_id foreign key in person with data type SMALLINT UNSIGNED.
works_at becomes a store_id foreign key in staff with data type TINYINT UNSIGNED.
Specify RESTRICT actions for both foreign keys.
Subtype entities have an IsA relationship to the supertype. Implement these relationships as foreign keys:

The person_id columns of customer and staff become foreign keys referring to person.
Specify CASCADE actions for both foreign keys.

*/



/* Creates a person table to store general personal details */
CREATE TABLE person (
  person_id SMALLINT UNSIGNED NOT NULL UNIQUE,
  first_name VARCHAR(20) NOT NULL,
  last_name VARCHAR(20) NOT NULL,
  email VARCHAR(20) NOT NULL,
  address_id SMALLINT UNSIGNED NOT NULL,
  active VARCHAR(20) NOT NULL,
  last_update TIMESTAMP NOT NULL,
  FOREIGN KEY (address_id) REFERENCES address(address_id)
  ON DELETE RESTRICT
  ON UPDATE RESTRICT,
  PRIMARY KEY (person_id)
);

/* Creates a customer table linking to person, with a creation date */
CREATE TABLE customer (
  person_id SMALLINT UNSIGNED NOT NULL UNIQUE,
  create_date TIMESTAMP NOT NULL,
  PRIMARY KEY (person_id),
  FOREIGN KEY (person_id) REFERENCES person(person_id)
  ON DELETE CASCADE
  ON UPDATE CASCADE
);

/* Creates a staff table linking to person and stores additional staff-specific details */
CREATE TABLE staff (
  person_id SMALLINT UNSIGNED NOT NULL UNIQUE,
  picture BLOB NOT NULL,
  username VARCHAR(20) NOT NULL,
  password VARCHAR(20) NOT NULL,
  store_id TINYINT UNSIGNED NOT NULL,
  PRIMARY KEY (person_id),
  FOREIGN KEY (store_id) REFERENCES store(store_id)
  ON DELETE RESTRICT
  ON UPDATE RESTRICT,
  FOREIGN KEY (person_id) REFERENCES person(person_id)
  ON DELETE CASCADE
  ON UPDATE CASCADE
);