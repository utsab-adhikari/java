package GUI.EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyFrame extends JFrame implements ItemListener {
    JRadioButton rb1, rb2;
    ButtonGroup bg;
    JComboBox<String> cb;
    MyFrame() {
        setTitle("Event Handling - Item Event");

        JLabel gender = new JLabel("Select Gender: ");
        gender.setBounds(30, 30, 100, 25);

        rb1 = new JRadioButton("Male");
        rb1.setBounds(140, 30, 100, 25);

        rb2 = new JRadioButton("Female");
        rb2.setBounds(240, 30, 100, 25);

        bg = new ButtonGroup();

        bg.add(rb1);
        bg.add(rb2);

        JLabel countryLabel = new JLabel("Select Country: ");
        countryLabel.setBounds(30, 70, 100, 25);

        String country[] = {"Nepal", "India", "China", "Pakistan", "Bhutan"};

        cb = new JComboBox<String>(country);
        cb.setBounds(140, 70, 200, 25);

        add(gender);
        add(rb1);
        add(rb2);
        add(countryLabel);
        add(cb);

        rb1.addItemListener(this);
        rb2.addItemListener(this);
        cb.addItemListener(this);

        setLayout(null);

        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == rb1 && e.getStateChange() == ItemEvent.SELECTED) {
            JOptionPane.showMessageDialog(this, "You are Male");
        } else if(e.getSource() == rb2 && e.getStateChange() == ItemEvent.SELECTED) {
            JOptionPane.showMessageDialog(this, "You are Female");
        } else if(e.getSource() == cb && e.getStateChange() == ItemEvent.SELECTED) {
            JOptionPane.showMessageDialog(this, "Your country is "+cb.getSelectedItem());
        }
    }
}

public class P05_ItemEvent {
    public static void main(String arr[]) {
        new MyFrame();
    }
}
