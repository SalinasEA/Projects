'''
Given a list of 10 names, complete the program that outputs the name specified by the list index entered by the user. Use a try block to output the name and an except block to catch any IndexError. Output the message from the exception object if an IndexError is caught. Output the first element in the list if the invalid index is negative or the last element if the invalid index is positive.

Note: Python allows using a negative index to access a list, as long as the magnitude of the index is smaller than the size of the list.

Ex: If the input of the program is:

5
the program outputs:

Name: Jane
Ex: If the input of the program is:

12
the program outputs:

Exception! list index out of range
The closest name is: Johnny
Ex: If the input of the program is:

-2
the program outputs:

Name: Tyrese
Ex: If the input of the program is:

-15
the program outputs:

Exception! list index out of range
The closest name is: Ryley
'''

# This program attempts to retrieve a name from a list based on user input index.
# It handles IndexError exceptions by providing the closest available name if the index is out of range.
names = ['Ryley', 'Edan', 'Reagan', 'Henry', 'Caius', 'Jane', 'Guto', 'Sonya', 'Tyrese', 'Johnny']

try:
    index_input = int(input())
    names_user_input = names[index_input]
    print(f"Name: {names_user_input}")


except IndexError as ie_error:
    print(f"Exception! {ie_error}")
    if index_input < 0:
        print(f"The closest name is: {names[0]}")

    elif index_input > 0:
        print(f"The closest name is: {names[-1]}")