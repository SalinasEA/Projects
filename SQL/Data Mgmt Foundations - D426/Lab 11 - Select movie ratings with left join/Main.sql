/*
The Movie table has the following columns:

ID - integer, primary key
Title - variable-length string
Genre - variable-length string
RatingCode - variable-length string
Year - integer
The Rating table has the following columns:

Code - variable-length string, primary key
Description - variable-length string
Write a SELECT statement to select the Title, Year, and rating Description. Display all movies, whether or not a RatingCode is available.
*/

/* Selects movie ratings with left join */
SELECT Movie.Title, Movie.Year, Rating.Description
FROM Movie
LEFT JOIN Rating
ON RatingCode = Code;