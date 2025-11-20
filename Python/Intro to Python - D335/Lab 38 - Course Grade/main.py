'''
Write a program that reads the student information from a tab separated values (tsv) file. The program then creates a text file that records the course grades of the students. Each row of the tsv file contains the Last Name, First Name, Midterm1 score, Midterm2 score, and the Final score of a student. A sample of the student information is provided in StudentInfo.tsv. Assume the number of students is at least 1 and at most 20. Assume also the last names and first names do not contain whitespaces.

The program performs the following tasks:

Read the file name of the tsv file from the user.
Open the tsv file and read the student information.
Compute the average exam score of each student.
Assign a letter grade to each student based on the average exam score in the following scale:
A: 90 =< x
B: 80 =< x < 90
C: 70 =< x < 80
D: 60 =< x < 70
F: x < 60
Compute the average of each exam.
Output the last names, first names, exam scores, and letter grades of the students into a text file named report.txt. Output one student per row and separate the values with a tab character.
Output the average of each exam, with two digits after the decimal point, at the end of report.txt. Hint: Use the format specification to set the precision of the output.
Ex: If the input of the program is:

StudentInfo.tsv
and the contents of StudentInfo.tsv are:

Barrett    Edan    70  45  59
Bradshaw    Reagan  96  97  88
Charlton    Caius   73  94  80
Mayo    Tyrese  88  61  36
Stern    Brenda  90  86  45
the file report.txt should contain:

Barrett    Edan    70  45  59  F
Bradshaw    Reagan  96  97  88  A
Charlton    Caius   73  94  80  B
Mayo    Tyrese  88  61  36  D
Stern    Brenda  90  86  45  C

Averages: midterm1 83.40, midterm2 76.60, final 61.60
'''

# This program reads data from a CSV file containing student information and calculates grades.
# It computes the average scores for each student and assigns letter grades based on the averages.
# It then calculates the average scores for each exam.
# Finally, it writes the student information along with grades to a new text file named "report.txt".
import csv

midterm1 = []
midterm2 = []
final = []
last_names = []
first_names = []
grades = []

# Open the input CSV file and read its contents
with open(input(), "r") as opened_input_file:
    contents = csv.reader(opened_input_file, delimiter="\t")
    
    # Iterate through each row in the CSV file
    for row in contents:
        last_name, first_name, midterm1_score, midterm2_score, final_score = row
        last_names.append(last_name)
        first_names.append(first_name)
        
        # Convert scores to float and append to respective lists
        midterm1_score = float(midterm1_score)
        midterm2_score = float(midterm2_score)
        final_score = float(final_score)
        
        midterm1.append(midterm1_score)
        midterm2.append(midterm2_score)
        final.append(final_score)
        
        # Calculate the average score and assign letter grade
        average_score = (midterm1_score + midterm2_score + final_score) / 3
        if average_score >= 90:
            letter_grade = 'A'
        elif 80 <= average_score < 90:
            letter_grade = 'B'
        elif 70 <= average_score < 80:
            letter_grade = 'C'
        elif 60 <= average_score < 70:
            letter_grade = 'D'
        else:
            letter_grade = 'F'
        grades.append(letter_grade)

# Calculate the average scores for each exam
midterm1_avg = (sum(midterm1)) / (len(midterm1))
midterm2_avg = (sum(midterm2)) / (len(midterm2))
final_avg = (sum(final)) / (len(final))

# Write the student information along with grades to a new text file
with open("report.txt", "w") as output_file:
    for i in range(len(last_names)):
        output_file.write(f"{last_names[i]}\t{first_names[i]}\t{midterm1[i]:.0f}\t{midterm2[i]:.0f}\t{final[i]:.0f}\t{grades[i]}\n")

    output_file.write(f"\nAverages: midterm1 {midterm1_avg:.2f}, midterm2 {midterm2_avg:.2f}, final {final_avg:.2f}\n")
