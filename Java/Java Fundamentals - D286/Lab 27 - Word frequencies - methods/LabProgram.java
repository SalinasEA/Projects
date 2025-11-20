/*
Define a method named getWordFrequency that takes an array of strings, the size of the array, and a search word as parameters. Method getWordFrequency() then returns the number of occurrences of the search word in the array parameter (case insensitive).

Then, write a main program that reads a list of words into an array, calls method getWordFrequency() repeatedly, and outputs the words in the arrays with their frequencies. The input begins with an integer indicating the number of words that follow. Assume that the list will always contain less than 20 words.

Ex: If the input is:

5 hey Hi Mark hi mark
the output is:

hey 1
Hi 2
Mark 2
hi 2
mark 2
Hint: Use the equalsIgnoreCase() method for comparing strings, ignoring case.

The program must define and call a method:
public static int getWordFrequency(String[] wordsList, int listSize, String currWord)
*/

import java.util.Scanner;

public class LabProgram {

   // Method to count how many times currWord appears (case-insensitive) in wordsList
   public static int getWordFrequency(String[] wordsList, int listSize, String currWord) {
      int i;
      int count = 0;
      
      // Loop through wordsList and increment count for each match
      for (i = 0; i < listSize; ++i) {
         if (wordsList[i].equalsIgnoreCase(currWord)) {
            count++;
         }
      }
      
      return count;
   }

   public static void main(String[] args) {
      // Scanner for input reading
      Scanner scnr = new Scanner(System.in);

      // Read number of words to input
      final int listSize = scnr.nextInt();

      // Array to hold the input words
      String[] wordsList = new String[listSize];

      int i;
      
      // Read each word from input into the array
      for (i = 0; i < listSize; ++i) {
         wordsList[i] = scnr.next();
      }
      
      // For each word, print the word and its frequency count in the list
      for (i = 0; i < listSize; ++i) {
         System.out.printf("%s %d\n", wordsList[i], getWordFrequency(wordsList, listSize, wordsList[i]));
      }
   }
}
