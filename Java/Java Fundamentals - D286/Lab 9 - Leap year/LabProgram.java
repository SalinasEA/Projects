/*
A year in the modern Gregorian Calendar consists of 365 days. In reality, the earth takes longer to rotate around the sun. To account for the difference in time, every 4 years, a leap year takes place. A leap year is when a year has 366 days: An extra day, February 29th. The requirements for a given year to be a leap year are:

1) The year must be divisible by 4

2) If the year is a century year (1700, 1800, etc.), the year must be evenly divisible by 400; therefore, both 1700 and 1800 are not leap years

Some example leap years are 1600, 1712, and 2016.

Write a program that takes in a year and determines whether that year is a leap year.

Ex: If the input is:

1712
the output is:

1712 - leap year
Ex: If the input is:

1913
the output is:

1913 - not a leap year
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      // Scanner object to read the input year from the user
      Scanner scnr = new Scanner(System.in);
      
      // Variable to store the year input by the user
      int inputYear;
      // Boolean to track if the year is a leap year (initialized but not used explicitly here)
      boolean isLeapYear;
      
      // Initialize isLeapYear to false (not used further in this code)
      isLeapYear = false;
      
      // Read the year value from input
      inputYear = scnr.nextInt();
      
      // Determine if the year is a leap year based on the following conditions:
      // 1. Year is divisible by 4 but NOT divisible by 100, OR
      // 2. Year is divisible by 400
      if (inputYear % 100 != 0 && inputYear % 4 == 0 || inputYear % 400 == 0) {
         System.out.println("" + inputYear + " - leap year");
      }
      else {
         System.out.println("" + inputYear + " - not a leap year");
      }
   }
}
