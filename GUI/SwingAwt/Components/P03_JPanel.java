package GUI.Components;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
    MyFrame() {
        setTitle("Components - JPanel");

       /* General Example: 

       JPanel p1 = new JPanel();
       add(p1);

        */ 

        //we can use different pannels for different purposes:

        JPanel topPanel = new JPanel();
        JPanel bottomPanel = new JPanel();

        topPanel.setBackground(Color.LIGHT_GRAY);
        bottomPanel.setBackground(Color.CYAN);

        topPanel.add(new JLabel("Top Panel"));
        bottomPanel.add(new JButton("Click Me"));

        add(topPanel, BorderLayout.NORTH);
        add(bottomPanel, BorderLayout.CENTER);


        // setLayout(new FlowLayout()); 
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class P03_JPanel {
    public static void main(String arr[]) {
       new  MyFrame();
    }
}
