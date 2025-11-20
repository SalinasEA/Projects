/*
Given main(), define a Course base class with methods to set and get private fields of the following types:

String to store the course number
String to store the course title
Define Course's printInfo() method that outputs the course number and title.

Then, define a derived class OfferedCourse with methods to set and get private fields of the following types:

String to store the instructor's name
String to store the location
String to store the class time
Ex. If the input is:

ECE287
Digital Systems Design
ECE387
Embedded Systems Design
Mark Patterson
Wilson Hall 231
WF: 2-3:30 pm
the output is:

Course Information:
   Course Number: ECE287
   Course Title: Digital Systems Design
Course Information:
   Course Number: ECE387
   Course Title: Embedded Systems Design
   Instructor Name: Mark Patterson
   Location: Wilson Hall 231
   Class Time: WF: 2-3:30 pm
*/

public class Course {
   
   // Declare private fields
   private String courseNumber;
   private String courseTitle;
   
   // Define mutator method to set the course number
   public void setCourseNumber(String courseNumber) {
      this.courseNumber = courseNumber;
   }

   // Define mutator method to set the course title
   public void setCourseTitle(String courseTitle) {
      this.courseTitle = courseTitle;
   }

   // Define accessor method to get the course number
   public String getCourseNumber() {
      return courseNumber;
   }

   // Define accessor method to get the course title
   public String getCourseTitle() {
      return courseTitle;
   }

   // Define method to print course information
   public void printInfo() {
      System.out.println("Course Information:");
      System.out.println("   Course Number: " + courseNumber);
      System.out.println("   Course Title: " + courseTitle);
   }
}
