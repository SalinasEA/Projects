/* The Movie table has the following columns:

ID - integer, primary key
Title - variable-length string
Genre - variable-length string
RatingCode - variable-length string
Year - integer
Write a SELECT statement to select the year and the total number of movies for that year.
*/

/* Selects number of movies grouped by year */
SELECT Year, COUNT(*)
FROM Movie
GROUP BY Year