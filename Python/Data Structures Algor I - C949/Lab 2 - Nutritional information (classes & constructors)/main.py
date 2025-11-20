"""
Complete the FoodItem class by adding a constructor to initialize a food item. The constructor should initialize the name (a string) to "Water" and all other instance attributes to 0.0 by default. If the constructor is called with a food name, grams of fat, grams of carbohydrates, and grams of protein, the constructor should assign each instance attribute with the appropriate parameter value.

The given program accepts as input a food item name, amount of fat, carbs, and protein, and the number of servings. The program creates a food item using the constructor parameters' default values and a food item using the input values. The program outputs the nutritional information and calories per serving for a food item.

Ex: If the input is:

Water
the output is:

Nutritional information per serving of Water:
  Fat: 0.00 g
  Carbohydrates: 0.00 g
  Protein: 0.00 g
Number of calories for 1.00 serving(s): 0.00
Ex: If the input is:

M&M's
10.0
34.0
2.0
3.0
where M&M's is the food name, 10.0 is the grams of fat, 34.0 is the grams of carbohydrates, 2.0 is the grams of protein, and 3.0 is the number of servings, the output is:

Nutritional information per serving of M&M's:
  Fat: 10.00 g
  Carbohydrates: 34.00 g
  Protein: 2.00 g
Number of calories for 1.00 serving(s): 234.00
Number of calories for 3.00 serving(s): 702.00
"""

# Class representing a food item with nutritional values for fat, carbs, and protein
class FoodItem:
    # Constructor to initialize the food item with default values
    def __init__(self, name="Water", fat=0, carbs=0, protein=0):
        self.name = name
        self.fat = fat
        self.carbs = carbs
        self.protein = protein

    # Method to calculate the total calories for a given number of servings
    def get_calories(self, num_servings):
        calories = ((self.fat * 9) + (self.carbs * 4) + (self.protein * 4)) * num_servings
        return calories

    # Method to print nutritional information of the food item
    def print_info(self):
        print(f'Nutritional information per serving of {self.name}:')
        print(f'  Fat: {self.fat:.2f} g')
        print(f'  Carbohydrates: {self.carbs:.2f} g')
        print(f'  Protein: {self.protein:.2f} g')

if __name__ == "__main__":
    item_name = input()
    if item_name == 'Water' or item_name == 'water':
        food_item = FoodItem()
        food_item.print_info()
        print(f'Number of calories for {1.0:.2f} serving(s): {food_item.get_calories(1.0):.2f}')                       
    
    else:
        amount_fat = float(input())
        amount_carbs = float(input())
        amount_protein = float(input())
        num_servings = float(input())
        
        food_item = FoodItem(item_name, amount_fat, amount_carbs, amount_protein)
        food_item.print_info()
        print(f'Number of calories for {1.0:.2f} serving(s): {food_item.get_calories(1.0):.2f}')
        print(f'Number of calories for {num_servings:.2f} serving(s): {food_item.get_calories(num_servings):.2f}')