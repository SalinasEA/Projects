public class OfferedCourse extends Course {

   // Declare private fields
   private String instructorName;
   private String location;
   private String classTime;

   // Define mutator method to set the instructor name
   public void setInstructorName(String instructorName) {
      this.instructorName = instructorName;
   }

   // Define mutator method to set the location
   public void setLocation(String location) {
      this.location = location;
   }

   // Define mutator method to set the class time
   public void setClassTime(String classTime) {
      this.classTime = classTime;
   }

   // Define accessor method to get the instructor name
   public String getInstructorName() {
      return instructorName;
   }

   // Define accessor method to get the location
   public String getLocation() {
      return location;
   }

   // Define accessor method to get the class time
   public String getClassTime() {
      return classTime;
   }
}
