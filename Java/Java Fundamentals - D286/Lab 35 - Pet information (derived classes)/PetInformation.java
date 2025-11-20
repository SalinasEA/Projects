/*
The base class Pet has protected fields petName, and petAge. The derived class Cat extends the Pet class and includes a private field for catBreed. Complete main() to:

create a generic pet and print information using printInfo().
create a Cat pet, use printInfo() to print information, and add a statement to print the cat's breed using the getBreed() method.
Ex. If the input is:

Dobby
2
Kreacher
3
Scottish Fold
the output is:

Pet Information: 
   Name: Dobby
   Age: 2
Pet Information: 
   Name: Kreacher
   Age: 3
   Breed: Scottish Fold
*/

import java.util.Scanner;

public class PetInformation {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // Create instances of Pet and Cat
      Pet myPet = new Pet();
      Cat myCat = new Cat();
      
      // Declare variables to store user input
      String petName, catName, catBreed;
      int petAge, catAge;

      // Read input for generic pet's name and age
      petName = scnr.nextLine();
      petAge = scnr.nextInt();
      scnr.nextLine();

      // Read input for cat's name, age, and breed
      catName = scnr.nextLine();
      catAge = scnr.nextInt();
      scnr.nextLine();
      catBreed = scnr.nextLine();
      
      // Set name and age for generic pet and print its info
      myPet.setName(petName);
      myPet.setAge(petAge);
      myPet.printInfo();

      // Set name, age, and breed for the cat and print its info
      myCat.setName(catName);
      myCat.setAge(catAge);
      myCat.setBreed(catBreed);
      myCat.printInfo();

      // Output the breed of the cat
      System.out.println("   Breed: " + myCat.getBreed());
   }
}
