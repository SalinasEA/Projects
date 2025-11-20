'''
Sites like Zillow get input about house prices from a database and provide nice summaries for readers. Write a program with two inputs, current price and last month's price (both integers). Then, output a summary listing the price, the change since last month, and the estimated monthly mortgage computed as (current_price * 0.051) / 12.

Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
print(f'{your_value:.2f}')
Ex: If the input is:

200000 
210000
the output is:

This house is $200000. The change is $-10000 since last month.
The estimated monthly mortgage is $850.00.
'''

# Current price and last month price inputs, output summary of current price/price change/estimated monthly mortgage
current_price = int(input())
last_months_price = int(input())

print(f"This house is ${current_price}. The change is ${current_price - last_months_price } since last month.")
print(f"The estimated monthly mortgage is ${(current_price * 0.051) / 12:.2f}.")
