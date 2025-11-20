/*
Write a program that takes in a positive integer as input, and outputs a string of 1's and 0's representing the integer in reverse binary. Print a newline after the string of 1's and 0's. For an integer x, the algorithm is:

As long as x is greater than 0
   Output x % 2 (remainder is either 0 or 1)
   x = x / 2
Note: The above algorithm outputs the 0's and 1's in reverse order.

Ex: If the input is:

6
the output is:

011
6 in binary is 110; the algorithm outputs the bits in reverse.
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      // Variable to store the user input integer
      int userInput;
      
      // Scanner object to read input from the user
      Scanner scnr = new Scanner(System.in);
      
      // Read an integer from user input
      userInput = scnr.nextInt();
      
      // Convert the number to binary by repeatedly dividing by 2
      // and printing the remainder (least significant bit first)
      while (userInput > 0) {
         System.out.print("" + (userInput % 2));
         userInput /= 2;
      }
      
      // Print a newline after the binary digits
      System.out.println();
   }
}
