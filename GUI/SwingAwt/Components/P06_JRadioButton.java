package GUI.Components;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
    MyFrame() {
        setTitle("Components - JRadioButton");

        JRadioButton b1 = new JRadioButton("Male");
        JRadioButton b2 = new JRadioButton("Female");
        JRadioButton b3 = new JRadioButton("Others");

        ButtonGroup bg = new ButtonGroup();


        bg.add(b1);
        bg.add(b2);
        bg.add(b3);

        JLabel gender = new JLabel("Select Your Gender: ");

        add(gender);

        add(b1);
        add(b2);
        add(b3);

        setLayout(new FlowLayout());
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class P06_JRadioButton {
    public static void main(String arr[]) {
        new MyFrame();
    }
}
