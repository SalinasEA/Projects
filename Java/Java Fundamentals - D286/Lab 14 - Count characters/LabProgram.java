/*
Write a program whose input is a character and a string, and whose output indicates the number of times the character appears in the string. The output should include the input character and use the plural form, n's, if the number of times the characters appears is not exactly 1.

Ex: If the input is:

n Monday
the output is:

1 n
Ex: If the input is:

z Today is Monday
the output is:

0 z's
Ex: If the input is:

n It's a sunny day
the output is:

2 n's
Case matters.

Ex: If the input is:

n Nobody
the output is:

0 n's
n is different than N.
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      // Variables to store the target character, input string, counter, and loop index
      char inputChar;
      String inputString;
      int numOfAppearance = 0;
      int i;
      
      // Scanner object to read input from the user
      Scanner scnr = new Scanner(System.in);
      
      // Read the full input line (format: character followed by a space and then the string)
      inputString = scnr.nextLine();

      // Extract the character to search for (first character of input)
      inputChar = inputString.charAt(0);
      // Extract the remaining string (skipping the space after the character)
      inputString = inputString.substring(2);
      
      // Loop through the string to count how many times the character appears
      for (i = 0; i < inputString.length(); ++i) {
         if (inputChar == inputString.charAt(i)) {
            numOfAppearance += 1;
         }
      }
      
      // Output the result, handling singular and plural cases for correct grammar
      if (numOfAppearance == 1) {
         System.out.printf("%d %s\n", numOfAppearance, inputChar);
      }
      else {
         System.out.printf("%d %s\'s\n", numOfAppearance, inputChar);
      }
   }
}
