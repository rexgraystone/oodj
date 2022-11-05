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
    public boolean manager; // Variable to store the manager status of the employee
    void employee(int a, String s, boolean m) { // Method to store the details of the employee
        age = a;
        employeeName = s;
        manager = m;
    }
    void display() {
        System.out.println("Name of employee: " + employeeName + "\nAge of employee: " + age + "\nManager: " + manager);
    }
}

class polymorphismFunction {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x1, x2;
            String s1, s2;
            boolean b1, b2;
            System.out.println("Enter the details of Employee 1:");
            System.out.println("Name: ");
            s1 = sc.next();
            System.out.println("Age: ");
            x1 = sc.nextInt();
            System.out.println("Manager?: ");
            b1 = sc.nextBoolean();
            managerDetails m1 = new managerDetails();
            System.out.println("Enter the details of Employee 2:");
            System.out.println("Name: ");
            s2 = sc.next();
            System.out.println("Age: ");
            x2 = sc.nextInt();
            System.out.println("Manager?: ");
            b2 = sc.nextBoolean();
            managerDetails m2 = new managerDetails();
            m1.employee(x1, s1, b1);
            m2.employee(x2, s2, b2);
            m1.display();
            m2.display();
        }
    }
}