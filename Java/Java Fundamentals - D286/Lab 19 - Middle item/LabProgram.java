/*
Given a sorted list of integers, output the middle integer. A negative number indicates the end of the input (the negative number is not a part of the sorted list). Assume the number of integers is always odd.

Ex: If the input is:

2 3 4 8 11 -1 
the output is:

Middle item: 4
The maximum number of list values for any test case should not exceed 9. If exceeded, output "Too many numbers".

Hint: First read the data into an array. Then, based on the array's size, find the middle item.
*/

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      // Scanner object to read input from the user
      Scanner scnr = new Scanner(System.in);
      
      // Array to store up to 9 integers entered by the user
      int[] userValues = new int[9];
      
      // Variable to hold the user's current input
      int userInput;
      
      // Counter to track how many values have been entered
      int numElements = 0;

      // Read the first number
      userInput = scnr.nextInt();

      // Loop continues while the input is non-negative
      while (userInput >= 0) {
         // Store the current input in the array
         userValues[numElements] = userInput;
         numElements += 1;

         // Read the next number
         userInput = scnr.nextInt();

         // If input is negative, print the middle value and exit
         if (userInput < 0) {
            System.out.printf("Middle item: %d\n", userValues[numElements / 2]);
            break;
         }

         // If too many numbers are entered, print an error and exit
         else if (numElements > 8) {
            System.out.println("Too many numbers");
            break;
         }
      }
   }
}
