/*
Write a program that first gets a list of integers from input. The input begins with an integer indicating the number of integers that follow. Then, get the last value from the input, which indicates a threshold. Output all integers less than or equal to that last threshold value. Assume that the list will always contain fewer than 20 integers.

Ex: If the input is:

5 50 60 140 200 75 100
the output is:

50,60,75,
The 5 indicates that there are five integers in the list, namely 50, 60, 140, 200, and 75. The 100 indicates that the program should output all integers less than or equal to 100, so the program outputs 50, 60, and 75.

For coding simplicity, follow every output value by a comma, including the last one.

Such functionality is common on sites like Amazon, where a user can filter results.
*/

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      // Scanner object to read input from the user
      Scanner scnr = new Scanner(System.in);

      // Array to store up to 20 integer values
      int[] userValues = new int[20];

      // Loop index variable
      int i;

      // Variable to store the threshold value
      int numThreshold = 0;

      // Read the number of elements (not counting the threshold)
      int numElements = scnr.nextInt();
      
      // Read the list of numbers and the threshold
      for (i = 0; i <= numElements; ++i) {
         userValues[i] = scnr.nextInt();

         // If on the last iteration, set the threshold value
         if (i == numElements) {
            numThreshold = userValues[i];
         }
      }
      
      // Loop through all elements before the threshold and print values less than or equal to it
      for (i = 0; i < numElements; ++i) {
         if (userValues[i] <= numThreshold) {
            System.out.printf("%d,", userValues[i]);
         }
      }

      // Print a newline after the filtered output
      System.out.println();
   }
}
