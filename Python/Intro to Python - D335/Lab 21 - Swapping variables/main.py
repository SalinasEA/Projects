'''
Define a function named swap_values that takes four integers as parameters and swaps the first with the second, and the third with the fourth values. Then write a main program that reads four integers from input, calls function swap_values() to swap the values, and prints the swapped values on a single line separated with spaces.

Ex: If the input is:

3
8
2
4
function swap_values() returns and the main program outputs:

8 3 4 2
The program must define and call the following function.
def swap_values(user_val1, user_val2, user_val3, user_val4)
'''

# swap_values function with 4 integer parameters, return 2nd, 1st, 4th, 3rd parameters.
# 4 integer inputs and calls swap_values function to output swapped values with spaces between each value
def swap_values(user_val1, user_val2, user_val3, user_val4):
    return user_val2, user_val1, user_val4, user_val3


if __name__ == '__main__': 
    # Type your code here. Your code must call the function.
    user_input1 = input()
    user_input2 = input()
    user_input3 = input()
    user_input4 = input()
    swapped_value1, swapped_value2, swapped_value3, swapped_value4 = swap_values(user_input1, user_input2, user_input3, user_input4)
    
    print(swapped_value1, swapped_value2, swapped_value3, swapped_value4)