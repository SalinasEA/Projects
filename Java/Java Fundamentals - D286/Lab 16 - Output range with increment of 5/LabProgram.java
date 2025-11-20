/*
Write a program whose input is two integers, and whose output is the first integer and subsequent increments of 5 as long as the value is less than or equal to the second integer. End with a newline.

Ex: If the input is:

-15 10
the output is:

-15 -10 -5 0 5 10
Ex: If the second integer is less than the first as in:

20 5
the output is:

Second integer can't be less than the first.
For coding simplicity, output a space after every integer, including the last.
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      // Variables to store user input and calculation result
      int userInput1;
      int userInput2;
      int calcOutput;
      
      // Scanner object to read input from the user
      Scanner scnr = new Scanner(System.in);
      userInput1 = scnr.nextInt();
      userInput2 = scnr.nextInt();
      
      // Check if the first number is less than or equal to the second number
      if (userInput1 <= userInput2) {
         // Start from the first number and print values in steps of 5 until reaching the second number
         calcOutput = userInput1;
         while (calcOutput <= userInput2) {
            System.out.print("" + calcOutput + " ");
            calcOutput += 5;
         }
         // Print a newline after the sequence
         System.out.println();
      }
      // If the second number is less than the first, display an error message
      else {
         System.out.println("Second integer can't be less than the first.");
      }
   }
}
