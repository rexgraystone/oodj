/*
    4. Declare a class employee having emp_id and empname as members. 
    Extend class employee (inheritance) to have a subclass called salary having designation and monthly_salary as members. 
    Define the following:
        – Required constructors.
        – A method to find and display all details of employee drawing salary more than 20000/-.
        – Method main for creating an array for storing these details given as command line argument and showing usage of above methods.
*/

import java.util.Scanner;

class Employee {
    String[] employee_id;
    String[] employee_name;
}

class Salary extends Employee {
    String[] Designation;
    double[] monthly_salary;
    Salary(int j) {
        employee_name=new String[j];
        employee_id=new String[j];
        Designation=new String[j];
        monthly_salary= new double[j];  
    }
 
    void display(int j) { 
        System.out.println("---------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------"); 
        System.out.println("\t Details of employee who have salary above 20000");
        System.out.println("---------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------\n \n");
        System.out.format("%-15s %-15s %-25s %-10s %n","employee id","employee name","employee Designation","Monthly Salary");
        System.out.println("----------------------------------------------------------------------------");
        for(int i=0;i<j;i++) { 
            if(monthly_salary[i]>=20000) { 
              System.out.format("%-15s %-15s %-25s %-10s %n", employee_id[i], employee_name[i], Designation[i], monthly_salary[i]); 
            }
        }
    }
    public static void main(String [] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int length=Integer.parseInt(args[0]);
            Salary obj = new Salary(length);
            if(length==0) {
                System.out.println("please enter employee id");
                System.exit(0);
            }
            for(int i=0;i<length;i++) {  
                System.out.println("\n\n enter the "+(i+1)+" employee id");
                obj.employee_id[i]=sc.next();
                System.out.print("\n name of employee -->");
                obj.employee_name[i]=sc.next();    
                System.out.print("\n Designation of employee -->");
                obj.Designation[i]=sc.next();    
                System.out.print("\nMonthly salary of employee -->");
                obj.monthly_salary[i]=sc.nextDouble();
            }
            obj.display(length);
        } 
        catch (NumberFormatException e) {
            System.out.println("Please enter a valid number");
            e.printStackTrace();
        }
    }
}