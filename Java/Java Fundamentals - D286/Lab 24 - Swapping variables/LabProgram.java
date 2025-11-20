/*
Define a method named swapValues that takes an array of four integers as a parameter, swaps array elements at indices 0 and 1, and swaps array elements at indices 2 and 3. Then write a main program that reads four integers from input and stores the integers in an array in positions 0 to 3. The main program should call function swapValues() to swap array's values and print the swapped values on a single line separated with spaces.

Ex: If the input is:

3 8 2 4
function swapValues() returns and the main program outputs:

8 3 4 2
The program must define and call a method:
public static void swapValues(int[] values)
*/

import java.util.Scanner;

public class LabProgram {
   
   // Method to swap pairs of values in the array:
   // swaps values[0] with values[1] and values[2] with values[3]
   public static void swapValues(int[] values) {
      int temp = values[0];
      values[0] = values[1];
      values[1] = temp;
      
      temp = values[2];
      values[2] = values[3];
      values[3] = temp;
   }
   
   public static void main(String[] args) {
      // Scanner object to read integers from the user
      Scanner scnr = new Scanner(System.in);

      // Number of values expected
      final int NUM_VALUES = 4;

      // Array to store the four integer values
      int[] values = new int[NUM_VALUES];

      // Loop index variable
      int i;
      
      // Read four integer values from user input
      for (i = 0; i < values.length; ++i) {
         values[i] = scnr.nextInt();
      }
      
      // Call method to swap values in the array
      swapValues(values);
      
      // Print all values after swapping, separated by spaces
      for (i = 0; i < values.length; ++i) {
         if (i != (values.length - 1)) {
            System.out.print("" + values[i] + " ");
         }
         else {
            System.out.println("" + values[i]);
         }
      }
   }
}
