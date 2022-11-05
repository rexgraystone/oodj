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
        try (Scanner sc = new Scanner(System.in)) {
            int length = Integer.parseInt(args[0]);
            salary obj = new salary(length);
            if(length == 0) {
                System.out.println("Please enter employee ID");
                System.exit(0);
            }
            for(int i = 0;i < length; i++) {  
                System.out.println("\n\n Enter the " + (i + 1) + " employee ID");
                obj.employeeID[i] = sc.next();
                System.out.print("\n Name of employee -->");
                obj.employeeName[i] = sc.next();    
                System.out.print("\n Designation of employee -->");
                obj.designation[i] = sc.next();    
                System.out.print("\n Monthly salary of employee -->");
                obj.monthlySalary[i] = sc.nextDouble();
            }
            obj.display(length);
        } 
        catch (NumberFormatException e) {
            System.out.println("Please enter a valid number");
            e.printStackTrace();
        }
    }
}