/*
The database has three tables for tracking horse-riding lessons:

Horse with columns:

ID - primary key
RegisteredName
Breed
Height
BirthDate
Student with columns:

ID - primary key
FirstName
LastName
Street
City
State
Zip
Phone
EmailAddress
LessonSchedule with columns:

HorseID - partial primary key, foreign key references Horse(ID)
StudentID - foreign key references Student(ID)
LessonDateTime - partial primary key
Write a SELECT statement to create a lesson schedule for Feb 1, 2020 with the lesson date/time, student's first and last names, and the horse's registered name. Order the results in ascending order by lesson date/time, then by the horse's registered name. Make sure unassigned lesson times (student ID is NULL) appear in the results.
*/

/* Selects lesson schedule with multiple joins */
SELECT LessonSchedule.LessonDateTime, Student.FirstName, Student.LastName, Horse.RegisteredName
FROM LessonSchedule
LEFT JOIN Student
ON LessonSchedule.StudentID = Student.ID
INNER JOIN Horse
ON LessonSchedule.HorseID = Horse.ID
WHERE DATE(LessonSchedule.LessonDateTime) = '2020-02-01'
ORDER BY LessonSchedule.LessonDateTime ASC, Horse.RegisteredName;