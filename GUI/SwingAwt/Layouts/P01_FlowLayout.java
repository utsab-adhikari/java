package GUI.Layouts;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
    MyFrame() {
        setTitle("Layouts - FLowLayout");

        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        /*
        Here FlowLayout can be called as: 
            1) FLowlayout(): General flow;
            2)FlowLayout(int allign): specific allignment of items
                    allignment can be done in two ways: 

                    0 or LEFT
                    1 or CENTER
                    2 or RIGHT
                    3 or LEADING
                    4 or TRALING

    FlowLayout(1) or FlowLayout(FlowLayout.CENTER) is same

            3) FlowLayout(int align, int hgap, int vgap): 
                giving specific horizontal gap and Vertical gap between items
        */

        JButton b1 = new JButton("Button 01");
        JButton b2 = new JButton("Button 02");
        JButton b3 = new JButton("Button 03");
        JButton b4 = new JButton("Button 04");
        JButton b5 = new JButton("Button 05");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);

        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class P01_FlowLayout {
    public static void main(String arr[]) {
        new MyFrame();
    }
}
