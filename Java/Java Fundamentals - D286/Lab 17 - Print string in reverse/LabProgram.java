/*
Write a program that takes in a line of text as input, and outputs that line of text in reverse. The program repeats, ending when the user enters "Done", "done", or "d" for the line of text.

Ex: If the input is:

Hello there
Hey
done
the output is:

ereht olleH
yeH
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      // Variables to store user input, a temporary copy, and loop index
      String userInput;
      String tempInput;
      int i;
      
      // Scanner object to read input from the user
      Scanner scnr = new Scanner(System.in);
      
      // Read the first line of input
      userInput = scnr.nextLine();
      
      // Loop continues until user enters "Done", "done", or "d"
      while (!userInput.equals("Done") && !userInput.equals("done") && !userInput.equals("d")) {
         // Loop to print the first character of the string (slightly overcomplicated here)
         for (i = (userInput.length() - 1); i >= ((userInput.length() - 1) - (userInput.length() - 1)); --i) {
            tempInput = userInput;  // tempInput is not used functionally here
            System.out.print("" + userInput.charAt(i));
         }

         // Print newline after displaying the character
         System.out.println();

         // Read the next line of input
         userInput = scnr.nextLine();
      }
   }
}
