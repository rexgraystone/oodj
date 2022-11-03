/*
	6. Write a Java program to demonstrate garbage collection.
*/

import java.util.Scanner;

class Employee {
	private int ID;
	private String name;
	private int age;
	private static int nextId = 1;
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
		this.ID = nextId++;
	}
	public void eshow() {
		System.out.println("ID=" + ID + "\nName=" + name + "\nAge=" + age);
	}
	public void showNextId() {
		System.out.println("Next employee ID will be=" + nextId);
	}
}

class GarbageCollect {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String e, f, g;
        System.out.println("Enter the name of the 1st employee: ");
        e = sc.next();
        System.out.println("Enter the name of the 2nd employee: ");
        f = sc.next();
        System.out.println("Enter the name of the 3rd employee: ");
        g = sc.next();
        Employee E = new Employee(e, 10);
		Employee F = new Employee(f, 11);
		Employee G = new Employee(g, 12);
		E.eshow();
		E.showNextId();
		F.eshow();
		F.showNextId();
		G.eshow();
		G.showNextId();
        sc.close();
	}
}

