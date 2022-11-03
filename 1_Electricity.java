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

import java.util.Scanner;

class Electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Consumer no: ");
        int no = sc.nextInt();
        System.out.print("Enter Your Name: ");
        String name = sc.next();
        System.out.print("Enter the Prev Month Reading: ");
        int prev_month = sc.nextInt();
        System.out.print("Enter the Current Month Reading: ");
        int curr_month = sc.nextInt();
        System.out.print("Choose your Connection Type:\nDomestic\nCommercial: \n");
        String EB = sc.next();
        consumer cons = new consumer(no, name, prev_month, curr_month, EB);
        if(EB.equals("Domestic") || EB.equals("domestic") || EB.equals("D") || EB.equals("d")) {
            cons.domestic();
        }
        else if(EB.equals("Commercial") || EB.equals("commercial")|| EB.equals("C") || EB.equals("c")) {
            cons.commercial();
        }
        else {
            System.out.println("Please enter a valid option.");
        }
        System.out.println("\n");
        cons.details();
        sc.close();
    }
}

class consumer {
    private int no;
    private String name;
    private int prev_month;
    private int curr_month;
    private String EB;
    double bill = 0;
    public consumer(int no, String name, int prev_month, int curr_month, String EB) {
        this.no = no;
        this.name = name;
        this.prev_month = prev_month;
        this.curr_month = curr_month;
        this.EB = EB;
    }

    public void domestic() {
        int total = this.curr_month - this.prev_month;
            if(total <= 100) {
                bill = total * 1;
            }
            else if(total > 100 && total<=200) {
                bill = total * 2.50;
            }
            else if(total > 200 && total <= 500) {
                bill = total * 4;
            }
            else {
                bill = total * 6;
            }
    }

    public void commercial() {
        int total = this.curr_month - this.prev_month;
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

    public void details() {
        System.out.println("Consumer no. : " + this.no);
        System.out.println("Name: " + this.name);
        System.out.println("Previous month Reading: " + this.prev_month);
        System.out.println("Current month Reading: " + this.curr_month);
        System.out.println("Type of Connection: " + this.EB);
        System.out.println("BILL AMOUNT TO BE PAID: " + bill);
        System.out.println();
    }
}