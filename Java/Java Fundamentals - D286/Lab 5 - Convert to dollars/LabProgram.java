/*
Given four values representing counts of quarters, dimes, nickels and pennies, output the total amount as dollars and cents.

Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
System.out.printf("Amount: $%.2f\n", dollars);

Ex: If the input is:

4 3 2 1
where 4 is the number of quarters, 3 is the number of dimes, 2 is the number of nickels, and 1 is the number of pennies, the output is:

Amount: $1.41
For simplicity, assume input is non-negative.
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      // Scanner object to read coin counts from user input
      Scanner scnr = new Scanner(System.in);

      // Declare variables to store the count of each type of coin
      int quarters;
      int dimes;
      int nickels;
      int pennies;

      // Read the number of quarters, dimes, nickels, and pennies from input
      quarters = scnr.nextInt();
      dimes = scnr.nextInt();
      nickels = scnr.nextInt();
      pennies = scnr.nextInt();

      // Calculate the total amount in dollars
      // Each coin value is converted to its dollar amount and added together
      double dollars = (quarters * 0.25) + (dimes * 0.10) + (nickels * 0.05) + (pennies * 0.01);

      // Print the total amount formatted to two decimal places
      System.out.printf("Amount: $%.2f\n", dollars);
   }
}
