package GUI.Components;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
    MyFrame() {
        setTitle("Components - JButton");

        // Defining Buttons using JButton
        JButton b1 = new JButton("Button 01");
        JButton b2 = new JButton("Button 02");
        JButton b3 = new JButton("Button 03");

        // adding buttons to the frame: 

        add(b1);
        add(b2);
        add(b3);

        //Default Frame: 
        setLayout(new FlowLayout()); // General Flow Layout
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class P01_JButton {
    public static void main(String arr[]) {
        new MyFrame();
    }
}


