'''
Write a program that removes all non-alpha characters from the given input.

Ex: If the input is:

-Hello, 1 world$!
the output is:

Helloworld
'''

# Iterates through each character in the user input.
# Replaces non-alphanumeric characters and digits with string_replacer.
# Outputs the modified user input.
user_input = input()

string_replacer = ""

for x in user_input:
    # Replaces non-case with string_replacer
    if x.isalnum() != True:
        user_input = user_input.replace(x, string_replacer)
    
    # Replaces digit with string_replacer
    elif x.isdigit() == True:
        user_input = user_input.replace(x, string_replacer)
    
print(user_input)