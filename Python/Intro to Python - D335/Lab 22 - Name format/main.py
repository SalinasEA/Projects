'''
Many documents use a specific format for a person's name. Write a program whose input is:

firstName middleName lastName

and whose output is:

lastName, firstInitial.middleInitial.

Ex: If the input is:

Pat Silly Doe
the output is:

Doe, P.S.
If the input has the form:

firstName lastName

the output is:

lastName, firstInitial.

Ex: If the input is:

Julia Clark
the output is:

Clark, J.
'''

# First, middle (optional), last name inputs, output last, first intial.middle initial. 
fullName = input()

splitted_name = fullName.split()

if len(splitted_name) == 3:
    firstName = splitted_name[0]
    middleName = splitted_name[1]
    lastName = splitted_name[2]
    
    firstInitial = firstName[0]
    middleInitial = middleName[0]
    
    print(f"{lastName}, {firstInitial}.{middleInitial}.")
    
elif len(splitted_name) == 2:
    firstName = splitted_name[0]
    lastName = splitted_name[1]
    
    firstInitial = firstName[0]
    
    print(f"{lastName}, {firstInitial}.")
