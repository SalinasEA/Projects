/*
Write a program that reads a list of integers and outputs those integers in reverse. The input begins with an integer indicating the number of integers that follow. For coding simplicity, follow each output integer by a comma, including the last one. Assume that the list will always contain fewer than 20 integers.

Ex: If the input is:

5 2 4 6 8 10
the output is:

10,8,6,4,2,
To achieve the above, first read the integers into an array. Then output the array in reverse.
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      // Scanner object to read user input
      Scanner scnr = new Scanner(System.in);

      // Array to store up to 20 integers from the user
      int[] userList = new int[20];
      
      // Variable to track how many elements the user will input
      int numElements;
      // Loop index variable
      int i;

      // Read the number of elements the user will enter
      numElements = scnr.nextInt();
      
      // Read each integer input and store it in the array
      for (i = 0; i < numElements; ++i) {
         userList[i] = scnr.nextInt();
      }
      
      // Print the elements in reverse order, separated by commas
      for (i = numElements - 1; i >= 0; --i) {
         System.out.printf("%d,", userList[i]);
      }

      // Print a newline after the output
      System.out.println();
   }
}
