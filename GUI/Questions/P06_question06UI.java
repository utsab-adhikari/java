/*
6. Write a program to create a GUI application in java that identifies the smaller and greater
number between two input numbers taken through two text fields and displays the result in a
label. If the user presses the mouse, it should display the smaller number and if the user releases
the mouse, it should display the greater number.
*/
package GUI.Questions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MyFrame extends JFrame implements MouseListener {
    JTextField t1, t2;
    JLabel l1, l2, result;

    MyFrame() {
        setTitle("Question - UI 06");

        l1 = new JLabel("First Number: ");
        l2 = new JLabel("Second Number: ");
        t1 = new JTextField(10);
        t2 = new JTextField(10);

        result = new JLabel("Result will be Shown here.");

        l1.setBounds(30, 30, 150, 25);
        t1.setBounds(160, 30, 100, 25);
        l2.setBounds(30, 70, 150, 25); 
        t2.setBounds(160, 70, 100, 25);
        result.setBounds(30, 110, 300, 25);

        add(l1); 
        add(t1); 
        add(l2); 
        add(t2);
        add(result); 

    
        addMouseListener(this);

        setLayout(null);

        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mousePressed(MouseEvent e) {
        int num1, num2, min;

        num1 = Integer.parseInt(t1.getText());
        num2 = Integer.parseInt(t2.getText());
        min = num1<num2?num1:num2;
        result.setText("Minimum is "+min);
    }
    public void mouseReleased(MouseEvent e) {
         int num1, num2, max;

        num1 = Integer.parseInt(t1.getText());
        num2 = Integer.parseInt(t2.getText());
        max = num1>num2?num1:num2;
        result.setText("Maximum is "+max);
    }
    public void mouseExited(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}
}


public class P06_question06UI {
    public static void main(String arr[]) {
        new MyFrame();
    }
}
