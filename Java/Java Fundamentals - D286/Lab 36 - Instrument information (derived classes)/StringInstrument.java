/*
Given main() and the Instrument class, define a derived class, StringInstrument, with methods to set and get private fields of the following types:

int to store the number of strings
int to store the number of frets
boolean to store whether the instrument is bowed
Ex. If the input is:

Drums
Zildjian
2015
2500
Guitar
Gibson
2002
1200
6
19
false
the output is:

Instrument Information: 
   Name: Drums
   Manufacturer: Zildjian
   Year built: 2015
   Cost: 2500
Instrument Information: 
   Name: Guitar
   Manufacturer: Gibson
   Year built: 2002
   Cost: 1200
   Number of strings: 6
   Number of frets: 19
   Is bowed: false
*/

// Define a class: StringInstrument that is derived from the Instrument class
public class StringInstrument extends Instrument {
   
   // Declare private fields for string instrument properties
   private int numOfStrings;
   private int numOfFrets;
   private boolean isBowed;
   
   // Define mutator method to set number of strings
   public void setNumOfStrings(int numOfStrings) {
      this.numOfStrings = numOfStrings;
   }

   // Define mutator method to set number of frets
   public void setNumOfFrets(int numOfFrets) {
      this.numOfFrets = numOfFrets;
   }

   // Define mutator method to set whether the instrument is bowed
   public void setIsBowed(boolean isBowed) {
      this.isBowed = isBowed;
   }

   // Define accessor method to get number of strings
   public int getNumOfStrings() {
      return numOfStrings;
   }

   // Define accessor method to get number of frets
   public int getNumOfFrets() {
      return numOfFrets;
   }

   // Define accessor method to get whether the instrument is bowed
   public boolean getIsBowed() {
      return isBowed;
   }
}
