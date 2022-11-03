/*
    3. Write a Java program to find the first non-repeating character in a string.
*/

import java.util.Scanner; 

class NonRepeatingBoolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = sc.next();
        boolean check;
        for(int i = 0; i < input.length(); ++i) {
            check = true;
            for(int j = 0; j < input.length(); ++j) {
                if(i != j) {
                    if (input.charAt(i) == input.charAt(j)) {
                        check = false;
                        break;
                    }
                }
            }
            if(check) {
                System.out.println(input.charAt(i));
                break;
            }
        }
        sc.close();
    }
}