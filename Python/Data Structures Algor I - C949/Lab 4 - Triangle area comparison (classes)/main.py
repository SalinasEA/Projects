# Class representing a triangle with base, height, and methods to calculate its area
class Triangle:   
    # Constructor to initialize the base and height of the triangle
    def __init__(self):
        self.base = 0  # Base of the triangle
        self.height = 0  # Height of the triangle

    # Method to set the base of the triangle
    def set_base(self, user_base):
        self.base = user_base

    # Method to set the height of the triangle
    def set_height(self, user_height):
        self.height = user_height

    # Method to calculate the area of the triangle using the formula: 0.5 * base * height
    def get_area(self):
        area = 0.5 * self.base * self.height
        return area

    # Method to print the triangle's base, height, and area
    def print_info(self):
        print(f'Base: {self.base:.2f}')
        print(f'Height: {self.height:.2f}')
        print(f'Area: {self.get_area():.2f}')

# Main block to create and compare two triangle objects
if __name__ == "__main__":
    triangle1 = Triangle()  # Create the first triangle
    triangle2 = Triangle()  # Create the second triangle

    # Take user input for the base and height of the first triangle
    triangle1.set_base(float(input()))
    triangle1.set_height(float(input()))

    # Take user input for the base and height of the second triangle
    triangle2.set_base(float(input()))
    triangle2.set_height(float(input()))
    
    # Print the triangle with the smaller area
    print('Triangle with smaller area:')  
    
    # Compare areas and print the triangle with the smaller area
    if triangle1.get_area() > triangle2.get_area():
        triangle2.print_info()
    else:
        triangle1.print_info()