/*
Given two integers as user inputs that represent the number of drinks to buy and the number of bottles to restock, create a VendingMachine object that performs the following operations:

Purchases input number of drinks
Restocks input number of bottles
Reports inventory
The VendingMachine is found in VendingMachine.java. A VendingMachine's initial inventory is 20 drinks.

Ex: If the input is:

5 2
the output is:

Inventory: 17 bottles
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // Read input values for bottles to purchase and amount to restock
      int bottles = scnr.nextInt();
      int amount = scnr.nextInt();

      // Create an instance of VendingMachine
      VendingMachine vendingMachine = new VendingMachine();

      // Perform purchase and restock operations
      vendingMachine.purchase(bottles);
      vendingMachine.restock(amount);

      // Output current inventory report
      vendingMachine.report();
   }
}
