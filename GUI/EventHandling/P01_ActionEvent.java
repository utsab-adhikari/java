package GUI.EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener{
    JLabel l1, l2;
    JButton b1, b2;
    MyFrame() {
        setTitle("Event Handling - Action Event");

        l1 = new JLabel("Click Button 01");
        l2 = new JLabel("Click Button 02");

        b1 = new JButton("Button 01");
        b2 = new JButton("Button 02");

        l1.setBounds(30, 30, 300, 25);
        b1.setBounds(360, 30, 100, 25);
        l2.setBounds(30, 70, 300, 25);
        b2.setBounds(360, 70, 100, 25);

        add(l1);
        add(b1);
        add(l2);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setLayout(null);

        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1) {
            l1.setText("Button 01 Clicked");
        } else if(e.getSource() == b2) {
            l2.setText("Button 02 Clicked");
        }
    }
}

public class P01_ActionEvent {
    public static void main(String arr[]) {
        new MyFrame();
    }
}
