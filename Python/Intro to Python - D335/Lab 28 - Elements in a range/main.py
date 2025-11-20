'''
Write a program that first gets a list of integers from input. That list is followed by two more integers representing lower and upper bounds of a range. Your program should output all integers from the list that are within that range (inclusive of the bounds).

Ex: If the input is:

25 51 0 200 33
0 50
the output is:

25 0 33 
The bounds are 0-50, so 51 and 200 are out of range and thus not output.
'''

# Takes two inputs from the user: 
# 1. A list of integers, splits it into a list called input_list.
# 2. Another list representing lower and upper bounds, splits it into low_up_bnd_input.

# Creates a range object named low_up_bnd spanning from the lower bound (inclusive) to the upper bound (exclusive).

# Iterates through the input_list and checks if each element falls within the range defined by low_up_bnd.
# Prints the elements that fall within the specified range, separated by a space.
input_list = [int(i) for i in input().split()]


low_up_bnd_input = [int(i) for i in input().split()]


low_up_bnd = range(low_up_bnd_input[0], low_up_bnd_input[1])

for i in input_list:
    if i in range(low_up_bnd_input[0], (low_up_bnd_input[1] + 1)):
        print(i, end=" ")
        
        
