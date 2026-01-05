package GUI.Components;

import javax.swing.*;
import java.awt.*;


class MyFrame extends JFrame {
    MyFrame() {
        setTitle("Components - JLabel");

        JLabel l1 = new JLabel("Click The Button:");
        JButton b1 = new JButton("Click here");

        add(l1);
        add(b1);
        
        setLayout(new FlowLayout());
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


public class P02_JLabel {
    public static void main(String arr[]) {
        new MyFrame();
    }
}
