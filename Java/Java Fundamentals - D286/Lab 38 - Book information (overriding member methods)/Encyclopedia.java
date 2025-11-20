/*
Given main() and a base Book class, define a derived class called Encyclopedia with member methods to get and set private fields of the following types:

String to store the edition
int to store the number of pages
Within the derived Encyclopedia class, define a printInfo() method that overrides the Book class' printInfo() method by printing the title, author, publisher, publication date, edition, and number of pages.

Ex. If the input is:

The Hobbit
J. R. R. Tolkien
George Allen & Unwin
21 September 1937
The Illustrated Encyclopedia of the Universe
Ian Ridpath
Watson-Guptill
2001
2nd
384
the output is:

Book Information: 
   Book Title: The Hobbit
   Author: J. R. R. Tolkien
   Publisher: George Allen & Unwin
   Publication Date: 21 September 1937
Book Information: 
   Book Title: The Illustrated Encyclopedia of the Universe
   Author: Ian Ridpath
   Publisher: Watson-Guptill
   Publication Date: 2001
   Edition: 2nd
   Number of Pages: 384
*/
public class Encyclopedia extends Book {

   // Declare private fields
   private String edition;
   private int numPages;

   // Define mutator method to set the edition
   public void setEdition(String edition) {
      this.edition = edition;
   }

   // Define mutator method to set the number of pages
   public void setNumPages(int numPages) {
      this.numPages = numPages;
   }

   // Define accessor method to get the edition
   public String getEdition() {
      return edition;
   }

   // Define accessor method to get the number of pages
   public int getNumPages() {
      return numPages;
   }

   // Override printInfo() to display extended book info
   @Override
   public void printInfo() {
      System.out.println("Book Information: ");
      System.out.println("   Book Title: " + title);
      System.out.println("   Author: " + author);
      System.out.println("   Publisher: " + publisher);
      System.out.println("   Publication Date: " + publicationDate);
      System.out.println("   Edition: " + edition);
      System.out.println("   Number of Pages: " + numPages);
   }
}
