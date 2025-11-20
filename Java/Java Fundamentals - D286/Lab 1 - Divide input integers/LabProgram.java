/*
Write a program using integers userNum and divNum as input, and output userNum divided by divNum three times. Note: End with a newline.

Ex: If the input is:

2000 2
the output is:

1000 500 250
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      // Declare variables to store user input and the results of divisions
      int userNum;
      int divNum;
      int outputDivOne;
      int outputDivTwo;
      int outputDivThree;
      
      // Scanner object for taking input from the user
      Scanner scnr = new Scanner(System.in);
      
      // Read two integers from the user:
      // 1. The number to be divided
      // 2. The number to divide by
      userNum = scnr.nextInt();
      divNum = scnr.nextInt();

      // First division: userNum divided by divNum
      outputDivOne = userNum / divNum;
      
      // Second division: divide the result of the first division again by divNum
      outputDivTwo = (userNum / divNum) / divNum;

      // Third division: divide the result of the second division again by divNum
      outputDivThree = (((userNum / divNum) / divNum) / divNum);
      
      // Print the three division results separated by spaces
      System.out.println("" + outputDivOne + " " + outputDivTwo + " " + outputDivThree);
   }
}