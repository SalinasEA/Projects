import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      
      // Read full name input from user
      String fullName = scnr.nextLine();
      
      char middleInitial;
      char lastInitial;
      
      // Extract first name from start to first space
      String firstName = fullName.substring(0, fullName.indexOf(" "));
      
      // Extract last initial: first character after the last space
      lastInitial = fullName.charAt(fullName.lastIndexOf(" ") + 1);
      
      // Check if there is a middle name by comparing first and last space indexes
      if (fullName.indexOf(" ") != fullName.lastIndexOf(" ")) {
         // Extract middle initial: first character after first space
         middleInitial = fullName.charAt(fullName.indexOf(" ") + 1);
         
         // Output last initial, first name, and middle initial in specified format
         System.out.printf("%s., %s %s.\n", lastInitial, firstName, middleInitial);
      }
      
      else {
         // If no middle name, output only last initial and first name
         System.out.printf("%s., %s\n", lastInitial, firstName);
      }
   }
}
