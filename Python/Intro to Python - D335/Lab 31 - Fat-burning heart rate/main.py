'''
Write a program that calculates an adult's fat-burning heart rate, which is 70% of the difference between 220 and the person's age respectively. Complete fat_burning_heart_rate() to calculate the fat burning heart rate.

The adult's age must be between the ages of 18 and 75 inclusive. If the age entered is not in this range, raise a ValueError exception in get_age() with the message "Invalid age." Handle the exception in __main__ and print the ValueError message along with "Could not calculate heart rate info."

Ex: If the input is:

35
the output is:

Fat burning heart rate for a 35 year-old: 129.5 bpm
If the input is:

17
the output is:

Invalid age.
Could not calculate heart rate info.
'''

# This program calculates the fat burning heart rate for a person based on their age.
def get_age():
    age = int(input())
    if 18 <= age <= 75:
        return age
    
    else:
        raise ValueError("Invalid age.")

def fat_burning_heart_rate(age):
    return 0.7 * (220 - age)

if __name__ == "__main__":

    
    try:
        age = get_age()
        print(f"Fat burning heart rate for a {age} year-old: {fat_burning_heart_rate(age):.1f} bpm")
        
    except ValueError as excpt:
        print(excpt)
        print("Could not calculate heart rate info.")