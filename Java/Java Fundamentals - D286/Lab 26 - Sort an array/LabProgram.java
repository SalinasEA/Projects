/*
Define a method named sortArray that takes an array of integers and the number of elements in the array as parameters. Method sortArray() modifies the array parameter by sorting the elements in descending order (highest to lowest). Then write a main program that reads a list of integers from input, stores the integers in an array, calls sortArray(), and outputs the sorted array. The first input integer indicates how many numbers are in the list. Assume that the list will always contain less than 20 integers.

Ex: If the input is:

5 10 4 39 12 2
the output is:

39,12,10,4,2,
For coding simplicity, follow every output value by a comma, including the last one.

Your program must define and call the following method:
public static void sortArray(int[] myArr, int arrSize)
*/

import java.util.Scanner;

public class LabProgram {

   // Method to sort the array in descending order by swapping adjacent elements
   public static void sortArray(int[] myArr, int arrSize) {
      int largerValue;
      int i;
      int j;
      
      // Outer loop to repeat the sorting process enough times
      for (j = 0; j < arrSize; ++j) {
         
         // Inner loop to compare and swap adjacent elements as needed
         for (i = 0; i < arrSize; ++i) {
            
            // If array size is less than 2, no sorting needed
            if (arrSize < 2) {
               break;
            }
            
            // Handle comparison and swap when at the first element
            else if (i == 0 && myArr[i] < myArr[i + 1]) {
               largerValue = myArr[i + 1];
               myArr[i + 1] = myArr[i];
               myArr[i] = largerValue;
            }
            
            // No swap if first element is already larger
            else if (i == 0 && myArr[i] > myArr[i + 1]) {
               continue;
            }
            
            // Swap when current element is less than next element (for indices > 0)
            else if (i < (arrSize - 1) && myArr[i] < myArr[i + 1]) {
               largerValue = myArr[i + 1];
               myArr[i + 1] = myArr[i];
               myArr[i] = largerValue;
            }
            
            // Swap when current element is greater than previous element
            else if (i < arrSize && myArr[i] > myArr[i - 1]) {
               largerValue = myArr[i - 1];
               myArr[i - 1] = myArr[i];
               myArr[i] = largerValue;
            }
         }
      }
      
      // Print the sorted array values separated by commas
      for (i = 0; i < arrSize; ++i) {
         System.out.print(myArr[i] + ",");
         if (i == arrSize - 1) {
            System.out.println();
         }
      }
   }

   public static void main(String[] args) {
      // Scanner to read array size and elements from user input
      Scanner scnr = new Scanner(System.in);

      // Read size of the array
      final int arrSize = scnr.nextInt();

      // Create array to store the integers
      int[] myArr = new int[arrSize];

      int i;
      
      // Read array elements from input
      for (i = 0; i < arrSize; ++i) {
         myArr[i] = scnr.nextInt();
      }
      
      // Call method to sort the array and print the result
      sortArray(myArr, arrSize);
   }
}
