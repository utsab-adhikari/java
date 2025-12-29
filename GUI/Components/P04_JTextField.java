package GUI.Components;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
    MyFrame() {
        setTitle("Componets - JTextField");

        JTextField tf1 = new JTextField(10); 
        // Here in the Textfiled 10 defines approx 10 character/columns can display
        JLabel l1 = new JLabel("Enter Text:");

        add(l1); // Lebel first
        add(tf1);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class P04_JTextField {
    public static void main(String arr[]) {
        new MyFrame();
    }
}
