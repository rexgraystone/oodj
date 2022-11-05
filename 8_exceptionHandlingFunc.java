/*
    8. Write a Java program to represent exception handling.
*/

import java.util.Scanner;

class customException extends Exception {
    public customException(String m) {
        super(m);
    }
}

class ExceptionHandling {
    public static void main(String[] args) throws customException {
        try (Scanner sc = new Scanner(System.in)) {
            int n, a1, a2;
            int[] arr;
            System.out.println("Enter the number of elements you would like to enter: ");
            n = sc.nextInt();
            arr = new int[n];
            for(int i=0; i<n; i++) {
                System.out.println("Enter element " + (i+1));
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter any 2 numbers");
            a1 = sc.nextInt();
            a2 = sc.nextInt();
            if(arr[a2]>arr[a1]) {
                throw new customException("2nd element must be lesser than 1st element.");
            }
            try {
                int a3 = arr[a1]/arr[a2];
                System.out.println("The quotient of element at position " + a1 + " and element at position " + a2 + " is: " + a3);
            }
            catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("Thank You.");
            }
        }
    }
}
