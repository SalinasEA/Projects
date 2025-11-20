/*
Write a program that reads a list of words. Then, the program outputs those words and their frequencies. The input begins with an integer indicating the number of words that follow. Assume that the list will always contain fewer than 20 words.

Ex: If the input is:

5 hey hi Mark hi mark
the output is:

hey - 1
hi - 2
Mark - 1
hi - 2
mark - 1
Hint: Use two arrays, one array for the strings and one array for the frequencies.
*/

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      // Scanner object to read user input
      Scanner scnr = new Scanner(System.in);

      // Array to store up to 20 words entered by the user
      String[] userWords = new String[20];

      // Loop index variables
      int i;
      int j;

      // Variable to count occurrences of each word
      int count;

      // Read number of words the user will enter
      int numElements = scnr.nextInt();

      // Array to store frequency count for each word
      int[] valueFreq = new int[numElements];
      
      // Read the input words and store them in the array
      for (i = 0; i < numElements; ++i) {
         userWords[i] = scnr.next();
      }
      
      // Loop through each word to calculate its frequency
      for (i = 0; i < numElements; ++i) {
         count = 0;

         // Compare the current word with all other words
         for (j = 0; j < numElements; ++j) {
            if (userWords[i].equals(userWords[j])) {
               count++;
            }

            // Store the count in the frequency array
            valueFreq[i] = count;
         }
      }

      // Print each word and its corresponding frequency
      for (i = 0; i < numElements; ++i) {
         System.out.printf("%s - %d\n", userWords[i], valueFreq[i]);
      }
   }
}
