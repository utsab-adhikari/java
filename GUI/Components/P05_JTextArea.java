package GUI.Components;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
    MyFrame() {
        setTitle("Components - JTextArea");

        JTextArea ta1 = new JTextArea(3, 10);

        // height 3 - row, width 10 -cols textarea;

        JLabel l1 = new JLabel("Enter your Text:");

        add(l1);
        add(ta1);

        setLayout(new FlowLayout());
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class P05_JTextArea {
    public static void main(String arr[]) {
        new MyFrame();
    }
}
