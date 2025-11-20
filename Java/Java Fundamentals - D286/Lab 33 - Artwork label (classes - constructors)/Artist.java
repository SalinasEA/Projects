/*
Given main(), define the Artist class (in file Artist.java) with constructors to initialize an artist's information, get methods, and a printInfo() method. The default constructor should initialize the artist's name to "unknown" and the years of birth and death to -1. printInfo() displays "Artist:", then a space, then the artist's name, then another space, then the birth and death dates in one of three formats:

(XXXX to YYYY) if both the birth and death years are nonnegative
(XXXX to present) if the birth year is nonnegative and the death year is negative
(unknown) otherwise
Define the Artwork class (in file Artwork.java) with constructors to initialize an artwork's information, get methods, and a printInfo() method. The default constructor should initialize the title to "unknown", the year created to -1. printInfo() displays an artist's information by calling the printInfo() method in Artist.java, followed by the artwork's title and the year created. Declare a private field of type Artist in the Artwork class.

Ex: If the input is:

Pablo Picasso
1881
1973
Three Musicians
1921
the output is:

Artist: Pablo Picasso (1881 to 1973)
Title: Three Musicians, 1921
Ex: If the input is:

Brice Marden
1938
-1
Distant Muses 
2000
the output is:

Artist: Brice Marden (1938 to present)
Title: Distant Muses, 2000
Ex: If the input is:

Banksy
-1
-1
Balloon Girl
2002
the output is:

Artist: Banksy (unknown)
Title: Balloon Girl, 2002
*/

public class Artist {
   // Private fields for artist name and birth/death years
   private String artistName;
   private int birthYear;
   private int deathYear;

   // Default constructor initializes fields to unknown or -1
   public Artist() {
      artistName = "unknown";
      birthYear = -1;
      deathYear = -1;
   }

   // Constructor to initialize all private fields
   public Artist(String artistName, int birthYear, int deathYear) {
      this.artistName = artistName;
      this.birthYear = birthYear;
      this.deathYear = deathYear;
   }

   // Accessor methods for artist name and years
   public String getName() {
      return artistName;
   }

   public int getBirthYear() {
      return birthYear;
   }

   public int getDeathYear() {
      return deathYear;
   }

   // Print artist info: if deathYear is -1, print "to present"
   public void printInfo() {
      if (birthYear >= 0 && deathYear >= 0) {
         System.out.printf("Artist: %s (%d to %d)\n", artistName, birthYear, deathYear);
      }
      else if (birthYear >= 0 && deathYear == -1) {
         System.out.printf("Artist: %s (%d to present)\n", artistName, birthYear);
      }
      else {
         System.out.printf("Artist: %s (unknown)\n", artistName);
      }
   }
}
