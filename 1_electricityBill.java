/*
    1. Develop a Java application to generate Electricity bills. 
        Create a class with the following members: 
        Consumer no., consumer name, previous month reading, current month reading, type of EB connection (i.e domestic or commercial). 
        Compute the bill amount using the following tariff.
        If the type of the EB connection is domestic, calculate the amount to be paid as follows:
            · First 100 units - Rs. 1 per unit
            · 101-200 units - Rs. 2.50 per unit
            · 201-500 units - Rs. 4 per unit
            · >501 units - Rs. 6 per unit
        If the type of the EB connection is commercial, calculate the amount to be paid as follows:
            · First 100 units - Rs. 2 per unit
            · 101-200 units - Rs. 4.50 per unit
            · 201-500 units - Rs. 6 per unit
            · >501 units - Rs. 7 per unit
 */

import java.util.Scanner; // to take input from the user

class electricityBill { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); // Scanner object to take input from the user
        System.out.print("Enter Your Consumer no: "); // Prompt the user to enter the consumer number
        int no = sc.nextInt(); // Store the consumer number in the variable 'no'
        System.out.print("Enter Your Name: "); // Prompt the user to enter the name
        String name = sc.next(); // Store the name in the variable 'name'
        System.out.print("Enter the Previous Month Reading: "); // Prompt the user to enter the previous month reading
        int previousMonth = sc.nextInt(); // Store the previous month reading in the variable 'previousMonth'
        System.out.print("Enter the Current Month Reading: "); // Prompt the user to enter the current month reading
        int currentMonth = sc.nextInt(); // Store the current month reading in the variable 'currentMonth'
        System.out.print("Choose your Connection Type:\nDomestic\nCommercial: \n"); // Prompt the user to choose the connection type
        String EB = sc.next(); // Store the connection type in the variable 'EB'
        consumer cons = new consumer(no, name, previousMonth, currentMonth, EB); // Create an object of the class 'consumer' and pass the values to the constructor
        if(EB.equals("Domestic") 
            || EB.equals("domestic") 
            || EB.equals("D") 
            || EB.equals("d")) { // Check if the connection type is domestic
            cons.domestic(); // Call the method 'domestic' of the class 'consumer'
        }
        else if(EB.equals("Commercial") 
                || EB.equals("commercial")
                || EB.equals("C") 
                || EB.equals("c")) { // Check if the connection type is commercial
            cons.commercial(); // Call the method 'commercial' of the class 'consumer'
        }
        else { // If the connection type is neither domestic nor commercial
            System.out.println("Please enter a valid option."); // Print an error message
        }
        System.out.println("\n");
        cons.details();
        sc.close();
    }
}
class consumer { 
    private int no;
    private String name;
    private int previousMonth;
    private int currentMonth;
    private String EB;
    double bill = 0;
    public consumer(int no, String name, int previousMonth, int currentMonth, String EB) { // Constructor to initialize the variables
        this.no = no;
        this.name = name;
        this.previousMonth = previousMonth;
        this.currentMonth = currentMonth;
        this.EB = EB;
    }

    public void domestic() { // Method to calculate the bill amount for domestic connection
        int total = this.currentMonth - this.previousMonth; // Calculate the total units consumed
            if(total <= 100) {
                bill = total * 1;
            }
            else if(total > 100 && total <= 200) {
                bill = total * 2.50;
            }
            else if(total > 200 && total <= 500) {
                bill = total * 4;
            }
            else {
                bill = total * 6;
            }
    }

    public void commercial() { // Method to calculate the bill amount for commercial connection
        int total = this.currentMonth - this.previousMonth;
        if(total <= 100) {
            bill = total * 2;
        }
        else if(total > 100 && total <= 200) {
            bill = total * 4.50;
        }
        else if(total > 200 && total <= 500) {
            bill = total * 6;
        }
        else {
            bill = total * 7;
        }
    }

    public void details() { // Method to print the details of the consumer
        System.out.println("Consumer no. : " + this.no);
        System.out.println("Name: " + this.name);
        System.out.println("Previous month Reading: " + this.previousMonth);
        System.out.println("Current month Reading: " + this.currentMonth);
        System.out.println("Type of Connection: " + this.EB);
        System.out.println("BILL AMOUNT TO BE PAID: " + bill);
        System.out.println();
    }
}