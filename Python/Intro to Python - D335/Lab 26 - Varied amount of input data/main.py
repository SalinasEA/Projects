'''
Statistics are often calculated with varying amounts of input data. Write a program that takes any number of integers as input, and outputs the average and max.

Ex: If the input is:

15 20 0 5
the output is:

10 20
Note: For output, round the average to the nearest integer.
'''

# Takes input from the user, splits it into a list of integers.
# Calculates the average and maximum value of the input list.
# Prints the average and maximum value.
input_list = [int(i) for i in input().split()]

avg_list = int((sum(input_list)) / (len(input_list)))

max_list = max(input_list)

print(avg_list, max_list)