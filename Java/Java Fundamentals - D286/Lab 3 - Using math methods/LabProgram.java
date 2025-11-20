/*
Given three floating-point numbers x, y, and z, output x to the power of z, x to the power of (y to the power of z), the absolute value of y, and the square root of (xy to the power of z).

Ex: If the input is:

3.6 4.5 2.0
the output is:

12.96 1.841304610218211E11 4.5 16.2
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      // Scanner object to read input values from the user
      Scanner scnr = new Scanner(System.in);

      // Declare variables to hold three double values entered by the user
      double x;
      double y;
      double z;
      
      // Read three double values from input: x, y, and z
      x = scnr.nextDouble();
      y = scnr.nextDouble();
      z = scnr.nextDouble();
      
      // Perform and print the results of the following calculations:
      // 1. x raised to the power of z
      // 2. x raised to the power of (y raised to the power of z)
      // 3. Absolute value of y
      // 4. Square root of (x * y) raised to the power of z
      System.out.println("" + Math.pow(x, z) + " " + Math.pow(x, Math.pow(y, z)) + " " + Math.abs(y) + " " + Math.sqrt(Math.pow((x * y), z)));
   }
}
