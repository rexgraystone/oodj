/*
    7. Write a Java program to demonstrate polymorphism.
*/

import java.util.Scanner;

class EDetails {
    public int age;
    public String ename;
    void Employee(int a, String s) {
        age = a;
        ename = s;
    }
    void display() {
        System.out.println("Name of employee: " + ename + "\nAge of employee: " + age);
    }
}

class MDetails extends EDetails {
    public boolean manager;
    void Employee(int a, String s, boolean m) {
        age = a;
        ename = s;
        manager = m;
    }
    void display() {
        System.out.println("Name of employee: " + ename + "\nAge of employee: " + age + "\nManager: " + manager);
    }
}

class Polymorphism {
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
            MDetails m1 = new MDetails();
            System.out.println("Enter the details of Employee 2:");
            System.out.println("Name: ");
            s2 = sc.next();
            System.out.println("Age: ");
            x2 = sc.nextInt();
            System.out.println("Manager?: ");
            b2 = sc.nextBoolean();
            MDetails m2 = new MDetails();
            m1.Employee(x1, s1, b1);
            m2.Employee(x2, s2, b2);
            m1.display();
            m2.display();
        }
    }
}