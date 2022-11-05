/*
    7. Write a Java program to demonstrate polymorphism.
*/

import java.util.Scanner;

class employeeDetails { // Class to store the details of an employee
    public int age; // Variable to store the age of the employee
    public String employeeName; // Variable to store the name of the employee
    void Employee(int a, String s) { // Method to store the details of the employee
        age = a; // Store the age of the employee
        employeeName = s; // Store the name of the employee
    }
    void display() { // Method to display the details of the employee
        System.out.println("Name of employee: " + employeeName + "\nAge of employee: " + age); // Print the details of the employee
    }
}

class managerDetails extends employeeDetails { // Class to store the details of a manager
    public boolean managerStatus; // Variable to store the manager status of the employee
    void employee(int a, String s, boolean m) { // Method to store the details of the employee
        age = a;
        employeeName = s;
        managerStatus = m;
    }
    void display() {
        System.out.println("Name of employee: " + employeeName + "\nAge of employee: " + age + "\nManager: " + managerStatus);
    }
}

class polymorphismFunction { // Class to demonstrate polymorphism
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { // Scanner object to take input from the user
            int x1, x2; // Variables to store the age of the employees
            String s1, s2; // Variables to store the name of the employees
            boolean b1, b2; // Variables to store the manager status of the employees
            System.out.println("Enter the details of Employee 1:"); // Prompt the user to enter the details of the first employee
            System.out.println("Name: "); // Prompt the user to enter the name of the first employee
            s1 = sc.next(); // Take the name of the first employee from the user
            System.out.println("Age: "); // Prompt the user to enter the age of the first employee
            x1 = sc.nextInt(); // Take the age of the first employee from the user
            System.out.println("Manager?: "); // Prompt the user to enter the manager status of the first employee
            b1 = sc.nextBoolean(); // Take the manager status of the first employee from the user
            managerDetails m1 = new managerDetails(); // Object to store the details of the first employee
            System.out.println("Enter the details of Employee 2:"); // Prompt the user to enter the details of the second employee
            System.out.println("Name: "); // Prompt the user to enter the name of the second employee
            s2 = sc.next(); // Take the name of the second employee from the user
            System.out.println("Age: "); // Prompt the user to enter the age of the second employee
            x2 = sc.nextInt(); // Take the age of the second employee from the user
            System.out.println("Manager?: "); // Prompt the user to enter the manager status of the second employee
            b2 = sc.nextBoolean(); // Take the manager status of the second employee from the user
            managerDetails m2 = new managerDetails(); // Object to store the details of the second employee
            m1.employee(x1, s1, b1); // Store the details of the first employee
            m2.employee(x2, s2, b2); // Store the details of the second employee
            m1.display(); // Display the details of the first employee
            m2.display(); // Display the details of the second employee
        }
    }
}