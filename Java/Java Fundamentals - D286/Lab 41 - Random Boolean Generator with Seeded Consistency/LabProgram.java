/*
Define a method named "showResults" with one parameter. The parameter should reference a random object rand. The showResults() method should generate a random integer of 0 or 1 using the random object reference rand. If the random number generated is equal to 1, return "true". If the random number generated is equal to 0, return "false".

In the main() method template, the rand variable has already been assigned a random object with a seed value of 2. Write a program that collects one integer value as input, assumed to be greater than 0. Use a loop to call the showResults() method a number of times equal to the integer input. e.g., If 3 is entered as input, then showResults() will be called 3 times, each time returning "true" or "false".

Output the returned Boolean values on separate lines, ending with a newline.

If the input is:

3
the output with a random object seed value of 2 is:

true
false
true
*/

import java.util.Scanner;
import java.util.Random;

public class LabProgram {   
   // Method returns true or false based on a random number (0 or 1)
   public static Boolean showResults(Random rand) {
      int randInt = rand.nextInt(2); // Generates 0 or 1
      
      // Return true if random number is 1, else return false
      if (randInt == 1) {
         return true;
      }
      else {
         return false;
      }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random rand = new Random(2); // Seed used in develop mode to ensure consistent results
      
      int i;
      int userInput = scnr.nextInt(); // Read number of results to show
      
      // Call showResults() userInput times and print the result each time
      for (i = 0; i < userInput; ++i) {
         System.out.println(showResults(rand));
      }
   }
}
