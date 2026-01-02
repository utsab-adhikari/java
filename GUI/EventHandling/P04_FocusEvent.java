package GUI.EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class MyFrame extends JFrame implements FocusListener {
    JTextField t1, t2, t3;
    JLabel l1, l2, l3;
    JButton b1;
    MyFrame() {
        setTitle("Event Handling - Focus Event");

        l1 = new JLabel("First Number: ");
        l1.setBounds(30, 30, 100, 25);

        t1 = new JTextField(10);
        t1.setBounds(140, 30, 200, 25);

        l2 = new JLabel("Second Number: ");
        l2.setBounds(30, 70, 100, 25);

        t2 = new JTextField(10);
        t2.setBounds(140, 70, 200, 25);

        l3 = new JLabel("Result: ");
        l3.setBounds(30, 110, 100, 25);

        t3 = new JTextField(10);
        t3.setBounds(140, 110, 200, 25);
        t3.setEditable(false);

        b1 = new JButton("Result");
        b1.setBounds(110, 150, 100, 25);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);

        t1.addFocusListener(this);
        t2.addFocusListener(this);
        b1.addFocusListener(this);

        setLayout(null);
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void focusGained(FocusEvent e) {
        int num1, num2, result;
        num1 = Integer.parseInt(t1.getText());
        num2 = Integer.parseInt(t2.getText());

        result = num1 * num2;
        t3.setText("Multiplection is : "+result);
    }
    public void focusLost(FocusEvent e) {
        if(e.getSource() == t1 && t1.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter first number to continue");
            t1.requestFocus();
        }
        if(e.getSource() == t2 && t2.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter second number to continue");
            t2.requestFocus();
        }
    }
}


public class P04_FocusEvent {
    public static void main(String arr[]) {
        new MyFrame();
    }
}
