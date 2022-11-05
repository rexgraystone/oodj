/*
    10. Write a Java program to create a JTable.
*/

import javax.swing.JFrame; // Importing the JFrame class
import javax.swing.JScrollPane; // Importing the JScrollPane class
import javax.swing.JTable; // Importing the JTable class
 
class JTableP { // Class to create a JTable
    JFrame f; // Frame to hold the JTable
    JTable j; // JTable to display the data
    JTableP() { // Constructor to create the JTable
        f = new JFrame(); // Creating a new JFrame
        f.setTitle("JTable Program"); // Setting the title of the JFrame
        String[][] data = { 
            { "Kundan Kumar Jha", "4031", "CSE" },
            { "Anand Jha", "6014", "IT" } 
        }; // 2D array to store the data
        String[] columnNames = { "Name", "Roll Number", "Department" }; // Array to store the column names
        j = new JTable(data, columnNames); // Creating a new JTable
        j.setBounds(30, 40, 200, 300); // Setting the bounds of the JTable
        JScrollPane sp = new JScrollPane(j); // Creating a new JScrollPane to hold the JTable
        f.add(sp); // Adding the JScrollPane to the JFrame
        f.setSize(500, 200); // Setting the size of the JFrame
        f.setVisible(true); // Setting the JFrame to be visible
    }
    public static void main(String[] args) { 
        new JTableP(); // Creating a new JTableP object
    }
} 
