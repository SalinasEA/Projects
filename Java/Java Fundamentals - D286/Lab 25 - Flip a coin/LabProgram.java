/*
Define a method named coinFlip that takes a Random object and returns "Heads" or "Tails" according to a random value 1 or 0. Assume the value 1 represents "Heads" and 0 represents "Tails". Then, write a main program that reads the desired number of coin flips as an input, calls method coinFlip() repeatedly according to the number of coin flips, and outputs the results. Assume the input is a value greater than 0.

Ex: If the random object is created with a seed value of 2 and the input is:

3
the output is:

Heads
Tails
Heads
Note: For testing purposes, a Random object is created in the main() method using a pseudo-random number generator with a fixed seed value. The program uses a seed value of 2 during development, but when submitted, a different seed value may be used for each test case.

The program must define and call the following method:
public static String coinFlip(Random rand)
*/

import java.util.Scanner;
import java.util.Random;

public class LabProgram {
   
   // Method to simulate a coin flip returning "Heads" or "Tails"
   public static String coinFlip(Random rand) {
      int intRand = rand.nextInt(2); // Generate random int (0 or 1)
      if (intRand == 0) {
         return "Tails";
      }
      else {
         return "Heads";
      }
   }
   
   public static void main(String[] args) {
      // Scanner to read the number of flips from user input
      Scanner scnr = new Scanner(System.in);

      // Random object with fixed seed for predictable results
      Random rand = new Random(2);

      // Variable to store user input (number of coin flips)
      int userInput = scnr.nextInt();

      // Loop index variable
      int i;
      
      // Perform coin flips userInput times and print results
      for (i = 0; i < userInput; ++i) {
         System.out.println(coinFlip(rand));
      }
   }
}
