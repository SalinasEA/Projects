"""
Define the Artist class with a constructor to initialize an artist's information and a print_info() method. The constructor should by default initialize the artist's name to "unknown" and the years of birth and death to -1. print_info() displays "Artist:", then a space, then the artist's name, then another space, then the birth and death dates in one of three formats:

(XXXX to YYYY) if both the birth and death years are nonnegative
(XXXX to present) if the birth year is nonnegative and the death year is negative
(unknown) otherwise
Define the Artwork class with a constructor to initialize an artwork's information and a print_info() method. The constructor should by default initialize the title to "unknown", the year created to -1, and the artist to use the Artist default constructor parameter values.
"""
# Class representing an artist with a name, birth year, and death year
class Artist:
    # Constructor to initialize the artist with default values
    def __init__(self, name="unknown", birth_year=-1, death_year=-1):
        self.name = name
        self.birth_year = birth_year
        self.death_year = death_year

    # Method to print the artist's information in a formatted way
    def print_info(self):
        if self.birth_year > 0 and self.death_year > 0:
            print(f"Artist: {self.name} ({self.birth_year} to {self.death_year})")
        elif self.birth_year > 0 and self.death_year < 0:
            print(f"Artist: {self.name} ({self.birth_year} to present)")
        else:
            print(f"Artist: {self.name} (unknown)")

# Class representing an artwork with a title, year of creation, and artist
class Artwork:
    # Constructor to initialize the artwork with default values
    def __init__(self, title="unknown", year_created=-1, artist=Artist()):
        self.title = title  # Title of the artwork
        self.year_created = year_created  # Year the artwork was created
        self.artist = artist  # Artist who created the artwork

    # Method to print the artwork's and artist's information
    def print_info(self):
        self.artist.print_info()  # Print artist information
        print(f"Title: {self.title}, {self.year_created}")  # Print artwork title and creation year

if __name__ == "__main__":
    user_artist_name = input()
    user_birth_year = int(input())
    user_death_year = int(input())
    user_title = input()
    user_year_created = int(input())

    user_artist = Artist(user_artist_name, user_birth_year, user_death_year)

    new_artwork = Artwork(user_title, user_year_created, user_artist)
  
    new_artwork.print_info()
