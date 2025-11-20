'''
Primary U.S. interstate highways are numbered 1-99. Odd numbers (like the 5 or 95) go north/south, and evens (like the 10 or 90) go east/west. Auxiliary highways are numbered 100-999, and service the primary highway indicated by the rightmost two digits. Thus, I-405 services I-5, and I-290 services I-90. Note: 200 is not a valid auxiliary highway because 00 is not a valid primary highway number.

Given a highway number, indicate whether it is a primary or auxiliary highway. If auxiliary, indicate what primary highway it serves. Also indicate if the (primary) highway runs north/south or east/west.

Ex: If the input is:

90
the output is:

I-90 is primary, going east/west.
Ex: If the input is:

290
the output is:

I-290 is auxiliary, serving I-90, going east/west.
Ex: If the input is:

0
the output is:

0 is not a valid interstate highway number. 
Ex: If the input is:

200
the output is:

200 is not a valid interstate highway number.
'''

# Highway number input, output indicates either primary or auxiliary highway and its direction
highway_number = int(input())
highway_number_str = str(highway_number)

if 0 < highway_number < 100:
    if highway_number % 2 == 0:
        print(f"I-{highway_number} is primary, going east/west.")
    else:
        print(f"I-{highway_number} is primary, going north/south.")

elif 100 <= highway_number <= 999 and not highway_number_str[-2:] == "00":
    if highway_number_str[-2] == "0":
        if highway_number % 2 == 0:
            print(f"I-{highway_number} is auxiliary, serving I-{highway_number_str[-1]}, going east/west.")
        else:
            print(f"I-{highway_number} is auxiliary, serving I-{highway_number_str[-1]}, going north/south.")
    else:
        if highway_number % 2 == 0:
            print(f"I-{highway_number} is auxiliary, serving I-{highway_number_str[-2:]}, going east/west.")
        else:
            print(f"I-{highway_number} is auxiliary, serving I-{highway_number_str[-2:]}, going north/south.")
else:
    print(f"{highway_number} is not a valid interstate highway number.")