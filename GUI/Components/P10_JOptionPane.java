package GUI.Components;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
    MyFrame() {
        setTitle("Components - JOptionPane");

        JOptionPane.showMessageDialog(this, "Hey there");

        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class P10_JOptionPane {
    public static void main(String arr[]) {
        new MyFrame();
    }
}
