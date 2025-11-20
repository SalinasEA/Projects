/*
Write a program whose inputs are three integers, and whose output is the smallest of the three values.

Ex: If the input is:

7 15 3
the output is:

3
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      // Declare variables to store three integer inputs
      int input1;
      int input2;
      int input3;

      // Scanner object to read input values from the user
      Scanner scnr = new Scanner(System.in);

      // Read three integers from user input
      input1 = scnr.nextInt();
      input2 = scnr.nextInt();
      input3 = scnr.nextInt();

      // Determine and print the smallest of the three input values
      // If input1 is smallest (or tied for smallest), print input1
      if (input1 <= input2 && input1 <= input3) {
         System.out.println(input1);
      }
      // If input2 is smallest (or tied for smallest), print input2
      else if (input2 <= input1 && input2 <= input3) {
         System.out.println(input2);
      }
      // Otherwise, input3 must be the smallest
      else {
         System.out.println(input3);
      }
   }
}
