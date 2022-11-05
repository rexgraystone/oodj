/*
    8. Write a Java program to represent exception handling.
*/

import java.util.Scanner;

class customException extends Exception { // Custom exception class
    public customException(String m) { // Constructor to initialize the message
        super(m); // Call the constructor of the parent class
    }
}

class exceptionHandlingFunc {
    public static void main(String[] args) throws customException { 
        try (Scanner sc = new Scanner(System.in)) { // Try block to handle the exception
            int n, a1, a2; // Declare variables
            int[] arr; // Declare array
            System.out.println("Enter the number of elements you would like to enter: "); // Prompt user
            n = sc.nextInt(); // Take input
            arr = new int[n]; // Initialize array
            for(int i = 0; i < n; i++) { // Loop to take input from the user
                System.out.println("Enter element " + (i + 1)); // Prompt user
                arr[i] = sc.nextInt(); // Take input
            }
            System.out.println("Enter any 2 numbers"); // Prompt user
            a1 = sc.nextInt(); // Take input from the user for the first number
            a2 = sc.nextInt(); // Take input from the user for the second number
            if(arr[a2] > arr[a1]) { // Check if the second number is greater than the first number
                throw new customException("2nd element must be lesser than 1st element.");
            }
            try { // Try block to handle the exception
                int a3 = arr[a1] / arr[a2]; // Divide the first number by the second number
                System.out.println("The quotient of element at position " + a1 + " and element at position " + a2 + " is: " + a3); // Print the quotient
            }
            catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { // Catch block to handle the exception
                System.out.println(e.getMessage()); // Print the message of the exception
            } 
            finally { // Finally block to execute the code
                System.out.println("Thank You."); // Print a message
            }
        }
    }
}
