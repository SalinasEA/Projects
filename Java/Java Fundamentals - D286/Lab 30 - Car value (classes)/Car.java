/*
Given main(), complete the Car class (in file Car.java) with methods to set and get the purchase price of a car (setPurchasePrice(), getPurchasePrice()), and to output the car's information (printInfo()).

Ex: If the input is:

2011
18000
2018
where 2011 is the car's model year, 18000 is the purchase price, and 2018 is the current year, the output is:

Car's information:
  Model year: 2011
  Purchase price: $18000
  Current value: $5770
Note: printInfo() should use two spaces for indentation.
*/

public class Car {
   // Model year of the car
   private int modelYear; 
   
   // Purchase price of the car
   private int purchasePrice;
   
   // Current value of the car after depreciation
   private int currentValue;
   
   // Setter for model year
   public void setModelYear(int userYear){
      modelYear = userYear;
   }
   
   // Getter for model year
   public int getModelYear() {
      return modelYear;
   }
   
   // Setter for purchase price
   public void setPurchasePrice(int purchasePrice) {
      this.purchasePrice = purchasePrice;
   }
   
   // Getter for purchase price
   public int getPurchasePrice() {
      return purchasePrice;
   }
   
   // Calculate the current value of the car based on depreciation rate and age
   public void calcCurrentValue(int currentYear) {
      double depreciationRate = 0.15;
      int carAge = currentYear - modelYear;
      
      // Apply depreciation formula
      currentValue = (int) 
         Math.round(purchasePrice * Math.pow((1 - depreciationRate), carAge));
   }
   
   // Print car details: model year, purchase price, and current value
   public void printInfo() {
      System.out.println("Car's information:");
      System.out.printf("  Model year: %d\n", modelYear);
      System.out.printf("  Purchase price: $%d\n", purchasePrice);
      System.out.printf("  Current value: $%d\n", currentValue);
   }
}
