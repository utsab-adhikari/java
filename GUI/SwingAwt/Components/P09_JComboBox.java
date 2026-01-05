package GUI.Components;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
    MyFrame() {
        setTitle("Components - JComboBox");

        JLabel l1 = new JLabel("Select Country: ");

        String countryList[] = {"Nepal", "India", "Pakistan", "Bhutan", "Bangladesh", "China", "Srilanka"};

        JComboBox<String> country = new JComboBox<String>(countryList);

        add(l1);
        add(country);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class P09_JComboBox {
    public static void main(String arr[]) {
        new MyFrame();
    }
}
