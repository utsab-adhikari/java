package GUI.Components;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
    MyFrame() {
        setTitle("Components - Table");

        String ColumnName[] = { "Name", "Year", "Course" };

        String Data[][] = { { "Utsab", "2024", "BEIT" },
                { "Ram", "2025", "BECE" },
                { "Hari", "2023", "BESE" } };

        JTable t1 = new JTable(Data, ColumnName);

        add(t1);

        setLayout(new FlowLayout());
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class P08_JTable {
    public static void main(String arr[]) {
        new MyFrame();
    }
}
