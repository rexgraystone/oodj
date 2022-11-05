/*
    5. Write a Java program to represent method overloading.
*/

import java.util.Scanner;

class perimeterCalc {
    void perimeter(int x) { // To calculate perimeter of a square
        int p = 4 * x; 
        System.out.println("\nThe perimeter of the square with side " + x + " is " + p + ".");
    }   
    void perimeter(int x, int y) { // To calculate perimeter of a rectangle
        int p = 2 * (x + y); 
        System.out.println("\nThe perimeter of the rectangle with length " + x + " and breadth " + y + " is " + p + ".");
    }
    void perimeter(int x, int y, int z) { // To calculate perimeter of a triangle
        int p = (x + y + z);
        System.out.println("\nThe perimeter of the triangle with sides " + x + ", " + y + ", and " + z + " is " + p + ".");
    }
}

class methodOverload {
    public static void main(String[] args) {
        int opt, x, y, z; // Variables to store the user input
        perimeterCalc pc = new perimeterCalc(); // Object of the class perimeterCalc
        Scanner sc = new Scanner(System.in); // Scanner object to take user input
        System.out.println("Enter your option: \n1. Perimeter of square\n2. Perimeter of rectangle\n3. Perimeter of scalar triangle\n"); // Prompt the user to enter their option
        opt = sc.nextInt(); // Take the user input
        if(opt == 1) { // Check if the user wants to calculate the perimeter of a square
            System.out.println("Enter the length of one side of the square: "); // Prompt the user to enter the length of one side of the square
            x = sc.nextInt(); // Take the user input
            pc.perimeter(x); // Call the method perimeter with one parameter
        }
        else if (opt == 2) { // Check if the user wants to calculate the perimeter of a rectangle
            System.out.println("Enter the length of the rectangle: ");  // Prompt the user to enter the length of the rectangle
            x = sc.nextInt(); // Take the user input for the length of the rectangle
            System.out.println("Enter the breadth of the rectangle: "); // Prompt the user to enter the breadth of the rectangle
            y = sc.nextInt(); // Take the user input for the breadth of the rectangle
            pc.perimeter(x, y); // Call the method perimeter with two parameters
        }
        else if (opt == 3) { // Check if the user wants to calculate the perimeter of a triangle
            System.out.println("Enter the length of side 1 of the triangle: "); // Prompt the user to enter the length of side 1 of the triangle
            x = sc.nextInt(); // Take the user input for side 1
            System.out.println("Enter the length of side 2 of the triangle: "); // Prompt the user to enter the length of side 2 of the triangle
            y = sc.nextInt(); // Take the user input for side 2
            System.out.println("Enter the length of side 3 of the triangle: "); // Prompt the user to enter the length of side 3 of the triangle
            z = sc.nextInt(); // Take the user input for side 3
            pc.perimeter(x, y, z); // Call the method perimeter with three parameters
        }
        else  { // If the user enters an invalid option
            System.out.println("Invalid option."); // Print an error message
        }
        sc.close(); // Close the scanner object
    }
}