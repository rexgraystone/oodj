/*
    3. Write a Java program to find the first non-repeating character in a string.
*/

import java.util.Scanner; // to take input from the user 

class nonRepeatingChar {  // Class to find the first non-repeating character in a string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object to take input from the user
        System.out.print("Enter a String: "); // Prompt the user to enter a string
        String input = sc.next(); // Take the input from the user
        boolean check; // Boolean variable to check if the character is repeating or not
        for(int i = 0; i < input.length(); ++i) { // Loop to check each character in the string
            check = true; // Initialize the boolean variable to true
            for(int j = 0; j < input.length(); ++j) { // Loop to check if the character is repeating or not
                if(i != j) { // Check if the character is not the same as the character at the current index
                    if (input.charAt(i) == input.charAt(j)) { // Check if the character is repeating
                        check = false; // If the character is repeating, set the boolean variable to false
                        break; // Break the loop
                    }
                }
            }
            if(check) { // Check if the boolean variable is true
                System.out.println(input.charAt(i)); // Print the first non-repeating character
                break; // Break the loop
            }
        }
        sc.close(); // Close the Scanner object
    }
}