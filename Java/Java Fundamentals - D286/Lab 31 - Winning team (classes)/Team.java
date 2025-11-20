/*
Given main(), define the Team class (in file Team.java). For class method getWinPercentage(), the formula is:
wins / (wins + losses). Note: Use casting to prevent integer division.

For class method printStanding(), output the win percentage of the team with two digits after the decimal point and whether the team has a winning or losing average. A team has a winning average if the win percentage is 0.5 or greater.

Ex: If the input is:

Ravens
13
3 
where Ravens is the team's name, 13 is the number of team wins, and 3 is the number of team losses, the output is:

Win percentage: 0.81
Congratulations, Team Ravens has a winning average!
Ex: If the input is:

Angels
80
82
the output is:

Win percentage: 0.49
Team Angels has a losing average.
*/

public class Team {
   // Team's name, number of wins, and number of losses
   private String name;
   private int wins;
   private int losses;
   
   // Mutator methods to set name, wins, and losses
   public void setName(String name) {
      this.name = name;
   }
   public void setWins(int wins) {
      this.wins = wins;
   }
   public void setLosses(int losses) {
      this.losses = losses;
   }
   
   // Accessor methods to get name, wins, and losses
   public String getName() {
      return name;
   }
   public int getWins() {
      return wins;
   }
   public int getLosses() {
      return losses;
   }
   
   // Calculate win percentage as wins divided by total games played
   public double getWinPercentage() {
      return (double) wins / ((double) (wins + losses));
   }
   
   // Print the team's win percentage and whether it is a winning or losing average
   public void printStanding() {
      System.out.printf("Win percentage: %.2f\n", getWinPercentage());
      
      if (getWinPercentage() >= 0.5) {
         System.out.printf("Congratulations, Team %s has a winning average!\n", name);
      }
      else {
         System.out.printf("Team %s has a losing average.\n", name);
      }
   }
}
