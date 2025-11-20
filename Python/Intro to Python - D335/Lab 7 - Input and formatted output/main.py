'''
A half-life is the amount of time it takes for a substance or entity to fall to half its original value. Caffeine has a half-life of about 6 hours in humans. Given caffeine amount (in mg) as input, output the caffeine level after 6, 12, and 24 hours. Use a string formatting expression with conversion specifiers to output the caffeine amount as floating-point numbers.

Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
print(f'{your_value:.2f}')
Ex: If the input is:

100
the output is:

After 6 hours: 50.00 mg
After 12 hours: 25.00 mg
After 24 hours: 6.25 mg
'''

# Caffeine in mg input, output caffeine mg levels after 6, 12, 24 hours.
caffeine_mg = float(input())

print(f"After 6 hours: {caffeine_mg / 2 :.2f} mg")
caffeine_mg = caffeine_mg / 2
print(f"After 12 hours: {caffeine_mg / 2 :.2f} mg")
caffeine_mg = caffeine_mg / 4
print(f"After 24 hours: {caffeine_mg / 2 :.2f} mg")