'''
A contact list is a place where you can store a specific contact with other associated information such as a phone number, email address, birthday, etc. Write a program that first takes in word pairs that consist of a name and a phone number (both strings), separated by a comma. That list is followed by a name, and your program should output the phone number associated with that name. Assume the search name is always in the list.

Ex: If the input is:

Joe,123-5432 Linda,983-4123 Frank,867-5309
Frank
the output is:

867-5309
'''

# Takes input from the user, splits it into a list called input_list.
# Initializes an empty dictionary named contacts to store contact information.

# Iterates through each contact pair in input_list.
# Splits each contact pair by comma to separate the name and number.
# Adds each contact to the contacts dictionary where the name is the key and the number is the value.

# Takes input for a contact name to retrieve.
# Checks if the contact name exists in the contacts dictionary.
# If found, prints the corresponding number.
input_list = [i for i in input().split()]

contacts = {}

for contact_pair in input_list:
    contact_split = contact_pair.split(",")
    contacts[contact_split[0]] = contact_split[1]

contact_get = input()

if contact_get in contacts:
    print(contacts[contact_get])