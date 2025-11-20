'''
Mad Libs are activities that have a person provide various words, which are then used to complete a short story in unexpected (and hopefully funny) ways.

Write a program that takes a string and an integer as input, and outputs a sentence using the input values as shown in the example below. The program repeats until the input string is quit and disregards the integer input that follows.

Ex: If the input is:

apples 5
shoes 2
quit 0
the output is:

Eating 5 apples a day keeps the doctor away.
Eating 2 shoes a day keeps the doctor away.
'''

# String and integer inputs, outputs sentence using the input until quit input occurs
item = "blank"
number = 0

while True:
    user_input = input()
    split_input = user_input.split()
    
    if split_input[0] != "quit":
        item = split_input[0]
        number = split_input[1]
        print(f"Eating {number} {item} a day keeps the doctor away.")
    
    else:
        break