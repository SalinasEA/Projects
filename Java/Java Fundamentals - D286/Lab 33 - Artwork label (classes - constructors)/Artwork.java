public class Artwork {
   // Private fields for artwork title and year created
   private String title;
   private int yearCreated;
   
   // Private field for artist object of type Artist
   private Artist artist;
   
   // Default constructor initializes title and yearCreated
   public Artwork() {
      title = "unknown";
      yearCreated = -1;
   }
   
   // Constructor to initialize all private fields including artist
   public Artwork(String title, int yearCreated, Artist artist) {
      this.title = title;
      this.yearCreated = yearCreated;
      this.artist = artist;
   }
   
   // Accessor methods for title and yearCreated
   public String getTitle() {
      return title;
   }
   
   public int getYearCreated() {
      return yearCreated;
   }
   
   // Print artwork info including calling artist's printInfo() method
   public void printInfo() {
      artist.printInfo();
      System.out.printf("Title: %s, %d\n", title, yearCreated);
   }
}
