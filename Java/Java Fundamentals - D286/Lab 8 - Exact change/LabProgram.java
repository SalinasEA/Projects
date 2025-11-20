/*
Write a program with total change amount in pennies as an integer input, and output the change using the fewest coins, one coin type per line. The coin types are Dollars, Quarters, Dimes, Nickels, and Pennies. Use singular and plural coin names as appropriate, like 1 Penny vs. 2 Pennies.

Ex: If the input is:

0
the output is:

No change
Ex: If the input is:

45
the output is:

1 Quarter
2 Dimes 
*/

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {

      // Declare variable to store total change in cents
      int change;
      
      // Scanner object to read input from the user
      Scanner scnr = new Scanner(System.in);
      
      // Read the amount of change in cents
      change = scnr.nextInt();
      
      // If no change is given, print a special message and skip the rest
      if (change == 0) {
         System.out.println("No change");
      }

      // Calculate the number of dollars and update remaining change
      int dollars = change / 100;
      change %= 100;

      // Calculate the number of quarters and update remaining change
      int quarters = change / 25;
      change %= 25;

      // Calculate the number of dimes and update remaining change
      int dimes = change / 10;
      change %= 10;

      // Calculate the number of nickels and update remaining change
      int nickels = change / 5;
      change %= 5;

      // Remaining change is in pennies
      int pennies = change / 1;
      change %= 1;

      // Output the number of dollars, if any (with correct singular/plural form)
      if (dollars > 0) {
         if (dollars == 1) {
            System.out.println("1 Dollar");
         }
         else {
            System.out.println("" + dollars + " Dollars");
         }
      }

      // Output the number of quarters, if any
      if (quarters > 0) {
         if (quarters == 1) {
            System.out.println("1 Quarter");
         }
         else {
            System.out.println("" + quarters + " Quarters");
         }
      }

      // Output the number of dimes, if any
      if (dimes > 0) {
         if (dimes == 1) {
            System.out.println("1 Dime");
         }
         else {
            System.out.println("" + dimes + " Dimes");
         }
      }

      // Output the number of nickels, if any
      if (nickels > 0) {
         if (nickels == 1) {
            System.out.println("1 Nickel");
         }
         else {
            System.out.println("" + nickels + " Nickels");
         }
      }

      // Output the number of pennies, if any
      if (pennies > 0) {
         if (pennies == 1) {
            System.out.println("1 Penny");
         }
         else {
            System.out.println("" + pennies + " Pennies");
         }
      }
   }
}
