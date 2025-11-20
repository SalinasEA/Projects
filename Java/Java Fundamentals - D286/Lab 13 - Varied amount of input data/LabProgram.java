/*
Statistics are often calculated with varying amounts of input data. Write a program that takes any number of non-negative integers as input, and outputs the max and average. A negative integer ends the input and is not included in the statistics. Assume the input contains at least one non-negative integer.

Output the average with two digits after the decimal point followed by a newline, which can be achieved as follows:
System.out.printf("%.2f\n", average);

Ex: When the input is:

15 20 0 3 -1
the output is:

20 9.50
*/

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      // Declare variables for input data, tracking max value, count, and average
      int data;
      int userInput;
      int max;
      int numOfUserInput;
      double avg;
      
      // Scanner object to read input values from the user
      Scanner scnr = new Scanner(System.in);
      
      // Initialize variables before reading inputs
      userInput = scnr.nextInt();
      max = 0;
      data = 0;
      numOfUserInput = 0;
      
      // Continue reading input while the entered number is non-negative
      while (userInput >= 0) {
         // Add the current input to the total sum
         data += userInput;

         // Update max if the current input is greater than the current max
         if (userInput > max) {
            max = userInput;
         }

         // Increment the number of inputs entered
         numOfUserInput += 1;

         // Read the next input
         userInput = scnr.nextInt();
      }

      // Calculate the average as a floating-point value
      avg = (double) data / numOfUserInput;
      
      // Output the maximum value and the average, formatted to two decimal places
      System.out.printf("%d %.2f\n", max, avg);
   }
}
