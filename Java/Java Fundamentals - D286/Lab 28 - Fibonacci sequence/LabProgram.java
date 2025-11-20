/*
The Fibonacci sequence begins with 0 and then 1 follows. All subsequent values are the sum of the previous two, for example: 0, 1, 1, 2, 3, 5, 8, 13. Complete the fibonacci() method, which has an index, n (starting at 0), as a parameter and returns the nth value in the sequence. Any negative index values should return -1.

Ex: If the input is:

7
the output is:

fibonacci(7) is 13
Note: Use a for loop and DO NOT use recursion.
*/

import java.util.Scanner;

public class LabProgram {
   
   // Method to calculate the nth Fibonacci number
   public static int fibonacci(int n) {
      // Calculate Fibonacci for positive n using iteration
      if (n >= 1) {
         int i;
         int firstVal = 0;
         int secondVal = 1;
         int newVal = 0;
         
         // Loop from 1 to n-1 to compute Fibonacci
         for (i = 1; i < n; ++i) {
            newVal = secondVal + firstVal;
            firstVal = secondVal;
            secondVal = newVal;
         }
         
         return newVal;
      }
      // Return -1 for invalid negative input
      else if (n < 0) {
         return -1;
      }
      // Return 0 when n is zero
      else {
         return 0;
      }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      // Read the Fibonacci sequence position from user
      int startNum = scnr.nextInt();
      
      // Output the calculated Fibonacci value
      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
   }
}
