/*
Given main(), complete the FoodItem class (in file FoodItem.java) with constructors to initialize each food item. The default constructor should initialize the name to "Water" and all other fields to 0.0. The second constructor should have four parameters (food name, grams of fat, grams of carbohydrates, and grams of protein) and should assign each private field with the appropriate parameter value.

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
Note: The program outputs the number of calories for one serving of a food and for the input number of servings as well. The program only outputs the calories for one serving of water.
*/

public class FoodItem {
   // Private fields for food name and nutrient values (fat, carbs, protein)
   private String name;
   private double fat;
   private double carbs;
   private double protein;
   
   // Default constructor initializes a FoodItem as "Water" with zero nutrients
   public FoodItem() {
      name = "Water";
      fat = 0.00;
      carbs = 0.00;
      protein = 0.00;
   }
   
   // Constructor with parameters to initialize all fields
   public FoodItem(String name, double fat, double carbs, double protein) {
      this.name = name;
      this.fat = fat;
      this.carbs = carbs;
      this.protein = protein;
   }
   
   // Accessor methods to retrieve the name and nutrient values
   public String getName() {
      return name;
   }
   
   public double getFat() {
      return fat;
   }
   
   public double getCarbs() {
      return carbs;
   }
   
   public double getProtein() {
      return protein;
   }
   
   // Calculate total calories based on nutrients and number of servings
   public double getCalories(double numServings) {
      // Each gram of fat = 9 calories, carbs and protein = 4 calories each
      double calories = ((fat * 9) + (carbs * 4) + (protein * 4)) * numServings;
      return calories;
   }
   
   // Print the nutritional information per serving of the food item
   public void printInfo() {
      System.out.println("Nutritional information per serving of " + name + ":");
      System.out.printf("  Fat: %.2f g\n", fat);
      System.out.printf("  Carbohydrates: %.2f g\n", carbs);
      System.out.printf("  Protein: %.2f g\n", protein);
   }
}
