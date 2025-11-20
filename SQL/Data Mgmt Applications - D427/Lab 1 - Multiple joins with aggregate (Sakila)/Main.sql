/*
Refer to the film, actor, and film_actor tables of the Sakila database. The tables in this lab have the same columns and data types but fewer rows.

Write a query that:

Computes the average length of all films that each actor appears in.
Rounds average length to the nearest minute and renames the result column "average".
Displays last name, first name, and average, in that order, for each actor.
Sorts the result in descending order by average, then ascending order by last name.
The query should exclude films with no actors and actors that do not appear in films.
*/

/* Retrieves actors' names and their average film length, sorting by highest average length */
SELECT last_name, first_name, ROUND(AVG(length)) AS average
FROM film_actor
INNER JOIN film
ON film.film_id = film_actor.film_id
INNER JOIN actor
ON actor.actor_id = film_actor.actor_id
GROUP BY last_name, first_name
ORDER BY average DESC, last_name;