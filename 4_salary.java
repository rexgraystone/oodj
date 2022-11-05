/*
    4. Declare a class employee having emp_ID and empname as members. 
    Extend class employee (inheritance) to have a subclass called salary having designation and monthlySalary as members. 
    Define the following:
        – Required constructors.
        – A method to find and display all details of employee drawing salary more than 20000/-.
        – Method main for creating an array for storing these details given as command line argument and showing usage of above methods.
*/

import java.util.Scanner; // to take input from the user

class employee { // Class to store the details of the employee
    String[] employeeID; // Array to store the employee ID
    String[] employeeName; // Array to store the employee name
}

class salary extends employee { // Class to store the details of the salary
    String[] designation; // Array to store the designation
    double[] monthlySalary; // Array to store the monthly salary
    salary(int j) { // Constructor to initialize the arrays
        employeeName = new String[j]; // Initialize the array 'employeeName' with the size 'j'
        employeeID = new String[j]; // Initialize the array 'employeeID' with the size 'j'
        designation = new String[j]; // Initialize the array 'designation' with the size 'j'
        monthlySalary = new double[j]; // Initialize the array 'monthlySalary' with the size 'j'
    }
 
    void display(int j) { 
        System.out.println("---------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------"); 
        System.out.println("\t Details of employees who have salary above 20000"); 
        System.out.println("---------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------\n \n");
        System.out.format("%-15s %-15s %-25s %-10s %n","Employee ID", "Employee name", "Employee Designation", "Monthly Salary");
        System.out.println("----------------------------------------------------------------------------");
        for(int i = 0; i < j; i++) { 
            if(monthlySalary[i] >= 20000) { 
                System.out.format("%-15s %-15s %-25s %-10s %n", employeeID[i], employeeName[i], designation[i], monthlySalary[i]); // Print the details of the employee
            }
        }
    }
    public static void main(String [] args) {
        try (Scanner sc = new Scanner(System.in)) { // Scanner object to take input from the user
            int length = Integer.parseInt(args[0]); // Take the length of the array from the user
            salary obj = new salary(length); // Create an object of the class 'salary'
            if(length == 0) { // If the length of the array is 0
                System.out.println("Please enter employee ID"); // Print the message
                System.exit(0); // Exit the program
            } 
            for(int i = 0; i < length; i++) { // Loop to take the details of the employee
                System.out.println("\n\n Enter the " + (i + 1) + " employee ID"); // Print the message
                obj.employeeID[i] = sc.next(); // Take the employee ID from the user
                System.out.print("\n Name of employee -->"); // Print the message
                obj.employeeName[i] = sc.next(); // Take the employee name from the user
                System.out.print("\n Designation of employee -->"); // Print the message
                obj.designation[i] = sc.next(); // Take the designation of the employee from the user
                System.out.print("\n Monthly salary of employee -->"); // Print the message
                obj.monthlySalary[i] = sc.nextDouble(); // Take the monthly salary of the employee from the user
            }
            obj.display(length); // Call the method 'display' to display the details of the employee
        } 
        catch (NumberFormatException e) { // Catch the exception if the user enters a string instead of an integer
            System.out.println("Please enter a valid number"); // Print the message
            e.printStackTrace(); // Print the stack trace
        }
    }
}