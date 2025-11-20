/*
Calories = ( (Age x 0.2757) + (Weight x 0.03295) + (Heart Rate x 1.0781) — 75.4991 ) x Time / 8.368

Write a program using inputs age (years), weight (pounds), heart rate (beats per minute), and time (minutes), respectively. Output the average calories burned for a person.

Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
System.out.printf("%.2f", yourValue);

Ex: If the input is:

49 155 148 60
the output is:

Calories: 736.21 calories
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      
      // Declare variables for user input and calculated calories
      int years;
      double pounds;
      int beatsPerMinute;
      int minutes;
      double AVG_CALORIES_BURNED_EXERCISE;
      
      // Scanner object to read input values from the user
      Scanner scnr = new Scanner(System.in);
      
      // Read user input in order:
      // 1. Age in years
      // 2. Weight in pounds
      // 3. Heart rate in beats per minute
      // 4. Duration of exercise in minutes
      years = scnr.nextInt();
      pounds = scnr.nextDouble();
      beatsPerMinute = scnr.nextInt();
      minutes = scnr.nextInt();
      
      // Calculate average calories burned during exercise
      // This formula uses age, weight, heart rate, and time to estimate energy use
      AVG_CALORIES_BURNED_EXERCISE = ((years * 0.2757) + (pounds * 0.03295) + (beatsPerMinute * 1.0781) - 75.4991) * minutes / 8.368;
      
      // Print the final calories burned with 2 decimal places
      System.out.printf("Calories: %.2f calories\n", AVG_CALORIES_BURNED_EXERCISE);
   }
}
