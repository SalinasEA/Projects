/*
Given class Triangle (in file Triangle.java), complete main() to read and set the base and height of triangle1 and of triangle2, determine which triangle's area is smaller, and output that triangle's info, making use of Triangle's relevant methods.

Ex: If the input is:

3.0 4.0
4.0 5.0
where 3.0 is triangle1's base, 4.0 is triangle1's height, 4.0 is triangle2's base, and 5.0 is triangle2's height, the output is:

Triangle with smaller area:
Base: 3.00
Height: 4.00
Area: 6.00
*/

import java.util.Scanner;

public class TriangleArea {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      // Create two Triangle objects
      Triangle triangle1 = new Triangle();
      Triangle triangle2 = new Triangle();

      // Read and set base and height values for the first triangle
      triangle1.setBase(scnr.nextDouble());
      triangle1.setHeight(scnr.nextDouble());
      
      // Read and set base and height values for the second triangle
      triangle2.setBase(scnr.nextDouble());
      triangle2.setHeight(scnr.nextDouble());
      
      System.out.println("Triangle with smaller area:");
      
      // Compare the areas of both triangles and print the smaller one's info
      if (triangle1.getArea() < triangle2.getArea()) {
         triangle1.printInfo();
      }
      else {
         triangle2.printInfo();
      }
   }
}

