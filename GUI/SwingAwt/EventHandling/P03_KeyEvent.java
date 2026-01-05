package GUI.EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class MyFrame extends JFrame implements KeyListener {
    JLabel l1, l2, l3, l4;
    JTextField t1;
    MyFrame() {
        setTitle("Event Handling - KeyEvent");

        l1 = new JLabel("Enter Text:");
        l1.setBounds(30, 30, 100, 25);

        t1 = new JTextField(10);
        t1.setBounds(140, 30, 200, 25);

        l2 = new JLabel("Changes Will be Shown");
        l2.setBounds(30, 70, 300, 25);

        l3 = new JLabel("Changes Will be Shown");
        l3.setBounds(30, 110, 300, 25);

        l4 = new JLabel("Changes Will be Shown");
        l4.setBounds(30, 150, 300, 25);

        add(l1);
        add(t1);
        add(l2);
        add(l3);
        add(l4);

        t1.addKeyListener(this);

        setLayout(null);
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void keyPressed(KeyEvent e) {
        l2.setText("Key Pressed");
    }
    public void keyReleased(KeyEvent e) {
        l3.setText("Key Released");
    }
    public void keyTyped(KeyEvent e) {
        l4.setText("Key Typed");
    }
}

public class P03_KeyEvent {
    public static void main(String arr[]) {
        new MyFrame();
    }
}
