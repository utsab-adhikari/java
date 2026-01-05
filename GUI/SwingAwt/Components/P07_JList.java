package GUI.Components;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
    MyFrame() {
        setTitle("Components - JList");

        String week[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        JList<String> l1 = new JList<String>(week);

        JLabel lb = new JLabel("Select The Day:");

        add(lb);        
        add(l1);        

        setLayout(new FlowLayout());
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class P07_JList {
    public static void main(String arr[]) {
        new MyFrame();
    }
}
