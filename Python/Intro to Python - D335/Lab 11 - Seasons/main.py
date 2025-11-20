'''
Write a program that takes a date as input and outputs the date's season in the northern hemisphere. The input is a string to represent the month and an int to represent the day.

Ex: If the input is:

April
11
the output is:

Spring
In addition, check if the string and int are valid (an actual month and day).

Ex: If the input is:

Blue
65
the output is:

Invalid 
The dates for each season in the northern hemisphere are:
Spring: March 20 - June 20
Summer: June 21 - September 21
Autumn: September 22 - December 20
Winter: December 21 - March 19
'''

# Month and day input, outputs season in northern hemisphere
input_month = input()
input_day = int(input())

season = {
    "Spring": ["March", "April", "May", "June"],
    "Summer": ["June", "July", "August", "September"],
    "Autumn": ["September", "October", "November", "December"],
    "Winter": ["December", "January", "February", "March"],
    }


if (input_month == "March" and 20 <= input_day <= 31 or
    input_month == "April" and 0 < input_day <= 30 or
    input_month == "May" and 0 < input_day <= 31 or
    input_month == "June" and 0 < input_day <= 20):
    print("Spring")

elif (input_month == "June" and 21 <= input_day <= 30 or
    input_month == "July" and 0 < input_day <= 31 or
    input_month == "August" and 0 < input_day <= 31 or
    input_month == "September" and 0 < input_day <= 21):
    print("Summer")
    
elif (input_month == "September" and 22 <= input_day <= 30 or
    input_month == "October" and 0 < input_day <= 31 or
    input_month == "November" and 0 < input_day <= 30 or
    input_month == "December" and 0 < input_day <= 20):
    print("Autumn")
    
elif (input_month == "December" and 21 <= input_day <= 31 or
    input_month == "January" and 0 < input_day <= 31 or
    input_month == "February" and 0 < input_day <= 29 or
    input_month == "March" and 0 < input_day <= 19):
    print("Winter")

else:
    print("Invalid")