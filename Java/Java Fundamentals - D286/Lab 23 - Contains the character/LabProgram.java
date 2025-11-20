/*
Write a program that reads an integer, a list of words, and a character. The integer signifies how many words are in the list. The output of the program is every word in the list that contains the character at least once. For coding simplicity, follow each output word by a comma, even the last one. Add a newline to the end of the last output. Assume at least one word in the list will contain the given character. Assume that the list of words will always contain fewer than 20 words.

Ex: If the input is:

4 hello zoo sleep drizzle z
then the output is:

zoo,drizzle,
To achieve the above, first read the list into an array. Keep in mind that the character 'a' is not equal to the character 'A'.
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      // Scanner object to read input from the user
      Scanner scnr = new Scanner(System.in);

      // Array to store up to 20 words entered by the user
      String[] wordList = new String[20];

      // Loop index variables
      int i;
      int j;

      // Variable to store the target character to search for
      char lastChar;

      // Temporary variable to hold user input strings
      String userInput;

      // Number of words to be entered
      int numElements = scnr.nextInt();
      
      // Read the list of words from the user
      for (i = 0; i < numElements; ++i) {
         userInput = scnr.next();
         wordList[i] = userInput;
      }
      
      // Read a single string input to get the character to search for
      userInput = scnr.next(); 
      
      // Extract the first character of this input for matching
      lastChar = userInput.charAt(0);
      
      // Loop through each word in the list
      for (i = 0; i < numElements; ++i) {
         // Loop through each character of the current word
         for (j = 0; j < wordList[i].length(); ++j) {
            // Check if current character matches the target character
            if (wordList[i].charAt(j) == lastChar) {
               // Print the word followed by a comma and stop checking this word
               System.out.print("" + wordList[i] + ",");
               break;
            }
         }
      }

      // Print a newline after all matching words are printed
      System.out.println();
   }
}
