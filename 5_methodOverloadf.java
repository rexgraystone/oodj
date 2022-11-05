/*
    5. Write a Java program to represent method overloading.
*/

import java.util.Scanner;

class perimeterCalc {
    void perimeter(int x) {
        int p = 4 * x;
        System.out.println("\nThe perimeter of the square with side " + x + " is " + p + ".");
    }   

    void perimeter(int x, int y) {
        int p = 2 * (x + y);
        System.out.println("\nThe perimeter of the rectangle with length " + x + " and breadth " + y + " is " + p + ".");
    }

    void perimeter(int x, int y, int z) {
        int p = (x + y + z);
        System.out.println("\nThe perimeter of the triangle with sides " + x + ", " + y + ", and " + z + " is " + p + ".");
    }
}

class methodOverload {
    public static void main(String[] args) {
        int a, x, y, z;
        perimeterCalc pc = new perimeterCalc();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your option: \n1. Perimeter of square\n2. Perimeter of rectangle\n3. Perimeter of scalar triangle\n");
        a = sc.nextInt();
        if(a == 1) {
            System.out.println("Enter the length of one side of the square: ");
            x = sc.nextInt();
            pc.perimeter(x);
        }

        else if (a == 2) {
            System.out.println("Enter the length of the rectangle: ");
            x = sc.nextInt();
            System.out.println("Enter the breadth of the rectangle: ");
            y = sc.nextInt();
            pc.perimeter(x, y);
        }

        else if (a == 3) {
            System.out.println("Enter the length of side 1 of the triangle: ");
            x = sc.nextInt();
            System.out.println("Enter the length of side 2 of the triangle: ");
            y = sc.nextInt();
            System.out.println("Enter the length of side 3 of the triangle: ");
            z = sc.nextInt();
            pc.perimeter(x, y, z);
        }
        
        else  {
            System.out.println("Invalid option.");
        }
        sc.close();
    }
}