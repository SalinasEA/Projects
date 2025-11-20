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
Write a SELECT statement to create a lesson schedule with the lesson date/time, horse ID, and the student's first and last names. Order the results in ascending order by lesson date/time, then by horse ID. Unassigned lesson times (student ID is NULL) should not appear in the schedule.
*/

/* Selects lesson schedule with inner join */
SELECT LessonSchedule.LessonDateTime, LessonSchedule.HorseID, Student.FirstName, Student.LastName
FROM LessonSchedule
INNER JOIN Student
ON LessonSchedule.StudentID = Student.ID
ORDER BY LessonDateTime ASC, HorseID