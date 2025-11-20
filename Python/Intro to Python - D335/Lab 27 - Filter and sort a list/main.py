'''
Write a program that gets a list of integers from input, and outputs non-negative integers in ascending order (lowest to highest).

Ex: If the input is:

10 -7 4 39 -6 12 2
the output is:

2 4 10 12 39 
For coding simplicity, follow every output value by a space. Do not end with newline.
'''

# Takes input from the user, splits it into a list of integers.
# Sorts the input list in ascending order using both sorted() function and sort() method.
# Prints non-negative integers from the sorted input list.
input_list = [int(i) for i in input().split()]

sorted_list = sorted(input_list)

input_list.sort()


for i in input_list:
    if i >= 0:
        print(i, end=" ")