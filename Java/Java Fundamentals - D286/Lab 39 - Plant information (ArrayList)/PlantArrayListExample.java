/*
Given a base Plant class and a derived Flower class, complete main() to create an ArrayList called myGarden. The ArrayList should be able to store objects that belong to the Plant class or the Flower class. Create a method called printArrayList(), that uses the printInfo() methods defined in the respective classes and prints each element in myGarden. The program should read plants or flowers from input (ending with -1), add each Plant or Flower to the myGarden ArrayList, and output each element in myGarden using the printInfo() method.

Ex. If the input is:

plant Spirea 10 
flower Hydrangea 30 false lilac 
flower Rose 6 false white
plant Mint 4
-1
the output is:

Plant 1 Information: 
   Plant name: Spirea
   Cost: 10

Plant 2 Information: 
   Plant name: Hydrangea
   Cost: 30
   Annual: false
   Color of flowers: lilac

Plant 3 Information: 
   Plant name: Rose
   Cost: 6
   Annual: false
   Color of flowers: white

Plant 4 Information: 
   Plant name: Mint
   Cost: 4
*/

import java.util.Scanner;
import java.util.ArrayList;

public class PlantArrayListExample {

   // Define method to print all plant or flower objects in the ArrayList
   public static void printArrayList(ArrayList<Plant> gardenList) {
      int i;
      for (i = 0; i < gardenList.size(); ++i) {
         System.out.printf("Plant %d Information: \n", i + 1);
         gardenList.get(i).printInfo();
         System.out.println();
      }
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // Declare an ArrayList to store Plant or Flower objects
      ArrayList<Plant> myGarden = new ArrayList<Plant>();

      // Declare input variables for both Plant and Flower types
      String plantName;
      String plantCost;
      String flowerName;
      String flowerCost;
      String colorOfFlowers;
      boolean isAnnual;

      String input = scnr.next();

      // Read and process input until "-1" is entered
      while (!input.equals("-1")) {
         
         // Check for 'plant' input and add to ArrayList
         if (input.equalsIgnoreCase("plant")) {
            plantName = scnr.next();
            plantCost = scnr.next();
            Plant newPlant = new Plant();
            newPlant.setPlantName(plantName);
            newPlant.setPlantCost(plantCost);
            myGarden.add(newPlant);
         }

         // Check for 'flower' input and add to ArrayList
         else if (input.equalsIgnoreCase("flower")) {
            flowerName = scnr.next();
            flowerCost = scnr.next();
            isAnnual = scnr.nextBoolean();
            colorOfFlowers = scnr.next();
            Flower newFlower = new Flower();
            newFlower.setPlantName(flowerName);
            newFlower.setPlantCost(flowerCost);
            newFlower.setPlantType(isAnnual);
            newFlower.setColorOfFlowers(colorOfFlowers);
            myGarden.add(newFlower);
         }

         input = scnr.next(); // Read next input
      }

      // Print all plant and flower information
      printArrayList(myGarden);
   }
}
