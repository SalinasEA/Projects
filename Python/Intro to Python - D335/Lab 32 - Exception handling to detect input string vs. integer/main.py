'''
The given program reads a list of single-word first names and ages (ending with -1), and outputs that list with the age incremented. The program fails and throws an exception if the second input on a line is a string rather than an integer. At FIXME in the code, add try and except blocks to catch the ValueError exception and output 0 for the age.

Ex: If the input is:

Lee 18
Lua 21
Mary Beth 19
Stu 33
-1
then the output is:

Lee 19
Lua 22
Mary 0
Stu 34
'''

# This program takes input consisting of name-age pairs separated by spaces. It increments the age by 1 for each pair
# and prints the updated information. If the age is not a valid integer, it prints the name followed by 0. 
# The loop continues until the name input is '-1'.
parts = input().split()
name = parts[0]
while name != '-1':

    try:
        age = int(parts[1]) + 1
        print(f'{name} {age}')
    
    except ValueError as excpt:
        print(f"{name} 0")

    parts = input().split()
    name = parts[0]