'''
Given the code that reads a list of integers, complete the number_guess() function, which should choose a random number between 1 and 100 by calling random.randint() and then output if the guessed number is too low, too high, or correct.

Import the random module to use the random.seed() and random.randint() functions.

random.seed(seed_value) seeds the random number generator using the given seed_value.
random.randint(a, b) returns a random number between a and b (inclusive).
For testing purposes, use the seed value 900, which will cause the computer to choose the same random number every time the program runs.

Ex: If the input is:

32 45 48 80
the output is:

32 is too low. Random number was 80.
45 is too high. Random number was 30.
48 is correct!
80 is too low. Random number was 97.
'''

# This program generates a random number between 1 and 100 using the random module.
# It compares the user input number with the generated random number and provides feedback.
# If the user input matches the random number, it prints "{num} is correct!".
# If the user input is lower than the random number, it prints "{num} is too low. Random number was {random_number}".
# If the user input is higher than the random number, it prints "{num} is too high. Random number was {random_number}".
import random
def number_guess(num):
    random_number = random.randint(1, 100)
    if num == random_number:
        print(f"{num} is correct!")
    
    elif num < random_number:
        print(f"{num} is too low. Random number was {random_number}.")
    elif num > random_number:
        print(f"{num} is too high. Random number was {random_number}.")
        
if __name__ == "__main__":
    random.seed(900)
    
    user_input = input()
    tokens = user_input.split()
    for token in tokens:
        num = int(token)
        number_guess(num)