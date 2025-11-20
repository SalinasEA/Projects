/*
Write a program that creates a login name for a user, given the user's first name, last name, and a four-digit integer as input. Output the login name, which is made up of the first six letters of the first name, followed by the first letter of the last name, an underscore (_), and then the last digit of the number (use the % operator). If the first name has less than six letters, then use all letters of the first name.

Ex: If the input is:

Michael Jordan 1991
the output is:

Your login name: MichaeJ_1
Ex: If the input is:

Nicole Smith 2024
the output is:

Your login name: NicoleS_4
*/

import java.util.Scanner;

public class LabProgram {

   public static void main(String[] args) {
      // Scanner object to read full name input from the user
      Scanner scnr = new Scanner(System.in);
      
      // Declare variables for full name, first name, last name initial, four-digit number, and username
      String fullName;
      String firstName;
      String lastName;
      String fourInt;
      String username;
      
      // Read the full name line (assumes format: FirstName LastName ####)
      fullName = scnr.nextLine();
      
      // Extract the first name (substring before the first space)
      firstName = fullName.substring(0, fullName.indexOf(' '));
      
      // If first name is 6 or more characters, shorten it to first 6 characters
      if (firstName.length() >= 6) {
         firstName = fullName.substring(0, 6);
      }
      // Otherwise keep full first name (this else is technically redundant here)
      else {
         firstName = fullName.substring(0, fullName.indexOf(' '));
      }
      
      // Extract the first letter of the last name (character after the first space)
      lastName = fullName.substring(fullName.indexOf(' ') + 1, fullName.indexOf(' ') + 2);
      
      // Extract the 4-digit number from the end of the input string (4 characters after last space)
      fourInt = fullName.substring(fullName.lastIndexOf(' ') + 4);
      
      // Construct the username: firstName + lastName initial + underscore + four-digit number
      username = "" + firstName + lastName + "_" + fourInt;
      
      // Print the generated username
      System.out.printf("Your login name: %s\n", username);
   }
}
