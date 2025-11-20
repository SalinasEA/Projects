"""
Given three integers as user inputs that represent the number of bottles of drinks to purchase, to restock, and to purchase afterward, create a VendingMachine object that performs the following operations:

Purchase the first input number of bottles of drinks
Restock the second input number of bottles of drinks
Purchase the last input number of bottles of drinks
Report inventory
"""

# Class representing a vending machine with inventory of bottles and methods to purchase, restock, and report inventory
class VendingMachine:
    # Constructor to initialize the vending machine with a starting inventory of 20 bottles
    def __init__(self):
        self.bottles = 20  # Initial inventory of bottles
        
    # Method to purchase a specified amount of bottles, decreasing the inventory
    def purchase(self, amount):
        self.bottles = self.bottles - amount
      
    # Method to restock a specified amount of bottles, increasing the inventory
    def restock(self, amount):
        self.bottles = self.bottles + amount
    
    # Method to get the current inventory of bottles
    def get_inventory(self):
        return self.bottles
        
    # Method to report the current inventory of bottles
    def report(self):
        print(f'Inventory: {self.bottles} bottles')

# Main block to simulate purchases, restocks, and report the vending machine's inventory
if __name__ == "__main__":
    vendingmachine1 = VendingMachine()
    vendingmachine1.purchase(int(input()))
    vendingmachine1.restock(int(input()))
    vendingmachine1.purchase(int(input()))
    vendingmachine1.report()