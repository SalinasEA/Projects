"""
Complete the Team class implementation. For the instance method get_win_percentage(), the formula is:
wins / (wins + losses). Note: Use floating-point division.

For instance method print_standing(), output the win percentage of the team with two digits after the decimal point and whether the team has a winning or losing average. A team has a winning average if the win percentage is 0.5 or greater.
"""

# Class representing a sports team with a name, number of wins, and losses
class Team:
    # Constructor to initialize the team's name, wins, and losses
    def __init__(self):
        self.name = 'none'  # Name of the team
        self.wins = 0  # Number of wins
        self.losses = 0  # Number of losses

    # Method to calculate the team's win percentage
    def get_win_percentage(self):
        percentage = float(self.wins) / float((self.wins + self.losses))
        return percentage

    # Method to print the team's standing based on its win percentage
    def print_standing(self):
        print(f"Win percentage: {self.get_win_percentage():.2f}")
        # Check if the team has a winning average (50% or higher)
        if self.get_win_percentage() >= 0.5:
            print(f"Congratulations, Team {self.name} has a winning average!")
        else:
            print(f"Team {self.name} has a losing average.")

# Main block to create a team and calculate its standing based on user input
if __name__ == "__main__":
    team = Team()  # Create a team object
   
    # Take user input for the team's name, number of wins, and number of losses
    user_name = input()
    user_wins = int(input())
    user_losses = int(input())
    
    # Set the team's attributes based on user input
    team.name = user_name
    team.wins = user_wins
    team.losses = user_losses
    
    # Print the team's standing
    team.print_standing()