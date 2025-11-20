'''
Write a program that first reads in the name of an input file, followed by two strings representing the lower and upper bounds of a search range. The file should be read using the file.readlines() method. The input file contains a list of alphabetical, ten-letter strings, each on a separate line. Your program should output all strings from the list that are within that range (inclusive of the bounds).

Ex: If the input is:

input1.txt
ammoniated
millennium
and the contents of input1.txt are:

aspiration
classified
federation
graduation
millennium
philosophy
quadratics
transcript
wilderness
zoologists
the output is:

aspiration
classified
federation
graduation
millennium
Notes:

There is a newline at the end of the output.
All input files are hosted in the zyLab and file names can be directly referred to. input1.txt is available to download so that the contents of the file can be seen.
In the tests, the first word input always comes alphabetically before the second word input.
'''

# This program takes input for an input file name, lower bounds, and upper bounds.
# It then reads the content of the input file and prints lines that fall within the specified range.
input_file = input()

lower_bounds_input = input()

upper_bounds_input = input()

with open(f"{input_file}", "r") as file:

    file_read = file.readlines()


    for line in file_read:
        i = line.strip("\n")
        if i >= lower_bounds_input and i <= upper_bounds_input:
            print(i)