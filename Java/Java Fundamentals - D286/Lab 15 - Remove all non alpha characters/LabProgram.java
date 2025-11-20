/*
Write a program that removes all non alpha characters from the given input.

Ex: If the input is:

-Hello, 1 world$!
the output is:

Helloworld
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      // Variable to store the user's input string and loop index
      String userString;
      int i;
      
      // Scanner object to read input from the user
      Scanner scnr = new Scanner(System.in);
      
      // Read the entire line of input from the user
      userString = scnr.nextLine();
      
      // Loop through each character in the string
      for (i = 0; i < userString.length(); ++i) {
         // If the character is a letter, print it (skip digits, punctuation, spaces, etc.)
         if (Character.isLetter(userString.charAt(i))) {
            System.out.print(userString.charAt(i));
         }
      }

      // Print a newline after outputting all letters
      System.out.println();
   }
}
