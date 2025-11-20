/*
Many documents use a specific format for a person's name. Write a program whose input is:

firstName middleName lastName

and whose output is:

lastName, firstInitial.middleInitial.

Ex: If the input is:

Pat Silly Doe
the output is:

Doe, P.S.
If the input has the form:

firstName lastName

the output is:

lastName, firstInitial.

Ex: If the input is:

Julia Clark
the output is:

Clark, J.
*/

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      // Scanner object to read a full name input from the user
      Scanner scnr = new Scanner(System.in);
      
      // Declare variables to hold parts of the name
      String remainingName;
      String firstName;
      String middleName = null;  // Initialized to null to check if middle name exists later
      String lastName;
      
      // Read the full name as a single line input
      remainingName = scnr.nextLine();
      
      // Extract the first name by taking substring before the first space
      firstName = remainingName.substring(0, remainingName.indexOf(' '));
      // Update remainingName by removing the extracted first name and the following space
      remainingName = remainingName.substring(remainingName.indexOf(' ') + 1);
      
      // Check if there is a middle name by looking for another space
      if (remainingName.indexOf(' ') != -1) {
         // Extract middle name (substring before next space)
         middleName = remainingName.substring(0, remainingName.indexOf(' '));
         // Update remainingName by removing the extracted middle name and the following space
         remainingName = remainingName.substring(remainingName.indexOf(' ') + 1);
      }
      
      // Whatever remains is the last name
      lastName = remainingName;
      
      // Print the name formatted as: Lastname, F.M. if middle name exists
      // Otherwise print Lastname, F.
      if (middleName != null) {
         System.out.printf("%s, %s.%s.\n", lastName, firstName.charAt(0), middleName.charAt(0));
      }
      else {
         System.out.printf("%s, %s.\n", lastName, firstName.charAt(0));
      }
   }
}
