'''
A pedometer treats walking 1 step as walking 2.5 feet. Define a function named feet_to_steps that takes a float as a parameter, representing the number of feet walked, and returns an integer that represents the number of steps walked. Then, write a main program that reads the number of feet walked as an input, calls function feet_to_steps() with the input as an argument, and outputs the number of steps as an integer.

Use floating-point arithmetic to perform the conversion.

Ex: If the input is:

150.5
the output is:

60
The program must define and call the following function:
def feet_to_steps(user_feet)
'''

# Function with float number of feet walked parameter and returns number of steps walked. Outputs number of steps as an integer.
def feet_to_steps(num_feet_walked):
    num_feet_walked = float(num_feet_walked)
    
    return int(num_feet_walked / 2.5)

if __name__ == '__main__':
    # Type your code here.
    num_feet_walked_input = input()
    print(f"{feet_to_steps(num_feet_walked_input)}")