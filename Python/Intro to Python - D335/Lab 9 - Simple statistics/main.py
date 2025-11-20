'''
Given 4 floating-point numbers. Use a string formatting expression with conversion specifiers to output their product and their average as integers (rounded), then as floating-point numbers.

Output each rounded integer using the following:
print(f'{your_value:.0f}')
Output each floating-point value with three digits after the decimal point, which can be achieved as follows:
print(f'{your_value:.3f}')
Ex: If the input is:

8.3
10.4
5.0
4.8
the output is:

2072 7
2071.680 7.125
'''

# 4 Float number inputs, output product, rounded average, and float.
num1 = float(input())
num2 = float(input())
num3 = float(input())
num4 = float(input())

your_value1 = (num1 * num2 * num3 * num4)
your_value2 = (num1 + num2 + num3 + num4) / 4

print(f"{your_value1:.0f} {your_value2:.0f}")
print(f"{your_value1:.3f} {your_value2:.3f}")
