/*
When analyzing data sets, such as data for human heights or for human weights, a common step is to adjust the data. This adjustment can be done by normalizing to values between 0 and 1, or throwing away outliers.

For this program, adjust the values by dividing all values by the largest value. The input begins with an integer indicating the number of floating-point values that follow. Assume that the list will always contain fewer than 20 floating-point values.

Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
System.out.printf("%.2f", yourValue);

Ex: If the input is:

5 30.0 50.0 10.0 100.0 65.0
the output is:

0.30 0.50 0.10 1.00 0.65 
The 5 indicates that there are five floating-point values in the list, namely 30.0, 50.0, 10.0, 100.0, and 65.0. 100.0 is the largest value in the list, so each value is divided by 100.0.

For coding simplicity, follow every output value by a space, including the last one.
*/

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      // Scanner object to read input from the user
      Scanner scnr = new Scanner(System.in);

      // Array to store up to 20 double values entered by the user
      double[] userValues = new double[20];

      // Loop index variable
      int i;

      // Variable to store the largest value found
      double largestValue;

      // Read the number of elements the user will enter
      int numElements = scnr.nextInt();
      
      // Read each double value and store it in the array
      for (i = 0; i < numElements; ++i) {
         userValues[i] = scnr.nextDouble();
      }
      
      // Initialize largestValue to the first value in the array
      largestValue = userValues[0];

      // Loop through the array to find the largest value
      for (i = 0; i < numElements; ++i) {
         if (userValues[i] > largestValue) {
            largestValue = userValues[i];
         }
      }
      
      // Loop through the array and print each value normalized by dividing by the largest value
      for (i = 0; i < numElements; ++i) {
         System.out.printf("%.2f ", userValues[i] / largestValue);
      }

      // Print a newline after the output
      System.out.println();
   }
}
