/*
    11. Write a Java program to create a user interface for a division calculator using swing.
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
    
class BuildGUI extends JFrame implements ActionListener {
    JFrame actualWindow;
    JPanel container;
    JTextField txt_num1, txt_num2, txt_result;
    JButton btn_div;
    JLabel l1 = new JLabel("Enter Number 1: ");
    JLabel l2 = new JLabel("Enter Number 2: ");
    
    BuildGUI() {
        actualWindow = new JFrame("Division Calculator");
        container = new JPanel();
        container.setLayout(new FlowLayout());
        txt_num1 = new JTextField(20);
        txt_num2 = new JTextField(20);
        txt_result = new JTextField(20);
    
        btn_div = new JButton("Divide");
        btn_div.addActionListener(this);
            
        container.add(l1);
        container.add(txt_num1);
        container.add(l2);
        container.add(txt_num2);
        container.add(btn_div);
        container.add(txt_result);
            
        actualWindow.add(container);
        actualWindow.setSize(300, 300);
        actualWindow.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int Num1, Num2;
        try {
            Num1 = Integer.parseInt(txt_num1.getText());
            Num2 = Integer.parseInt(txt_num2.getText());
            txt_result.setText(Num1/Num2+"");
        }
        catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(actualWindow,"Please enter only integers.");  
        }
        catch(ArithmeticException ae) {
            JOptionPane.showMessageDialog(actualWindow,"Divisor cannot be zero.");  
        }
    }
    public static void main(String[] args) {
        new BuildGUI();
    }
}