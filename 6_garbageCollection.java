/*
	6. Write a Java program to demonstrate garbage collection.
*/

import java.util.Scanner;

class employee {
	private int ID;
	private String name;
	private int age;
	private static int nextId = 1;
	public employee(String name, int age) {
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

class garbageCollect {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String e, f, g;
        System.out.println("Enter the name of the 1st employee: ");
        e = sc.next();
        System.out.println("Enter the name of the 2nd employee: ");
        f = sc.next();
        System.out.println("Enter the name of the 3rd employee: ");
        g = sc.next();
        employee E = new employee(e, 10);
		employee F = new employee(f, 11);
		employee G = new employee(g, 12);
		E.eshow();
		E.showNextId();
		F.eshow();
		F.showNextId();
		G.eshow();
		G.showNextId();
        sc.close();
	}
}

