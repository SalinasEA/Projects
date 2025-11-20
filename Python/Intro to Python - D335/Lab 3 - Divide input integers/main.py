# Write a program that reads integers user_num and div_num as input, and outputs user_num divided by div_num three times using floor divisions.
# Ex: If the input is:
# 2000
# 2
# the output is:
# 1000 500 250

# Input for dividend and input for divsor. Outputs division three times, using results
user_num = int(input())

div_num = int(input())

output_num1 = user_num // div_num

output_num2 = output_num1 // div_num

output_num3 = output_num2 // div_num

print(output_num1, output_num2, output_num3)