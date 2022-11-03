/*
    10. Write a Java program to create a JTable.
*/

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
 
class JTableP {
    JFrame f;
    JTable j;
    JTableP() {
        f = new JFrame();
        f.setTitle("JTable Program");
        String[][] data = {
            { "Kundan Kumar Jha", "4031", "CSE" },
            { "Anand Jha", "6014", "IT" }
        };
        String[] columnNames = { "Name", "Roll Number", "Department" };
        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        f.setSize(500, 200);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new JTableP();
    }
} 
