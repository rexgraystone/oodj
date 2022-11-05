/*
    11. Write a Java program to create a graphical user interface for a division calculator using swing.
*/

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
    
class buildGUI extends JFrame implements ActionListener { // Class to build the GUI
    JFrame actualWindow; // JFrame to hold the GUI
    JPanel container; // JPanel to hold the components
    JTextField txtNum1, txtNum2, txtResult; // TextFields to take input from the user
    JButton btnDiv; // Button to perform the division
    JLabel l1 = new JLabel("Enter Number 1: "); // Label to prompt the user to enter the first number
    JLabel l2 = new JLabel("Enter Number 2: "); // Label to prompt the user to enter the second number
    
    buildGUI() { // Constructor to build the GUI
        actualWindow = new JFrame("Division Calculator"); // Create the JFrame
        container = new JPanel(); // Create the JPanel
        container.setLayout(new FlowLayout()); // Set the layout of the JPanel
        txtNum1 = new JTextField(20); // Create the first JTextField
        txtNum2 = new JTextField(20); // Create the second JTextField
        txtResult = new JTextField(20); // Create the third JTextField
    
        btnDiv = new JButton("Divide"); // Create the button
        btnDiv.addActionListener(this); // Add the action listener to the button
            
        container.add(l1); // Add the first label to the JPanel
        container.add(txtNum1); // Add the first JTextField to the JPanel
        container.add(l2); // Add the second label to the JPanel
        container.add(txtNum2); // Add the second JTextField to the JPanel
        container.add(btnDiv); // Add the button to the JPanel
        container.add(txtResult); // Add the third JTextField to the JPanel
            
        actualWindow.add(container);
        actualWindow.setSize(300, 300);
        actualWindow.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int Num1, Num2;
        try {
            Num1 = Integer.parseInt(txtNum1.getText());
            Num2 = Integer.parseInt(txtNum2.getText());
            txtResult.setText(Num1 / Num2+"");
        }
        catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(actualWindow, "Please enter only integers.");  
        }
        catch(ArithmeticException ae) {
            JOptionPane.showMessageDialog(actualWindow, "Divisor cannot be zero.");  
        }
    }
    public static void main(String[] args) {
        new buildGUI();
    }
}