'''
On a piano, a key has a frequency, say f0. Each higher key (black or white) has a frequency of f0 * rn, where n is the distance (number of keys) from that key, and r is 2(1/12). Given an initial key frequency, output that frequency and the next 3 higher key frequencies.

Output each floating-point value with two digits after the decimal point, then the units ("Hz"), then a newline, using the following statement:
print(f'{your_value:.2f} Hz')

Ex: If the input is:

440
(which is the A key near the middle of a piano keyboard), the output is:

440.00 Hz
466.16 Hz
493.88 Hz
523.25 Hz
'''

# Input for piano key frequency, output next three higher key frequencies
import math

your_value = float(input())
r = math.pow(2, 1/12)

x0 = your_value
x1 = your_value * math.pow(r, 1)
x2 = your_value * math.pow(r, 2)
x3 = your_value * math.pow(r, 3)





print(f"{x0:.2f} Hz")
print(f"{x1:.2f} Hz")
print(f"{x2:.2f} Hz")
print(f"{x3:.2f} Hz")