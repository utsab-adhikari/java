package GUI.Layouts;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
    MyFrame() {
        setTitle("Layouts - GridLayout");

        setLayout(new GridLayout(3, 3, 10, 10));

        /*
        Here GridLayout can be called as: 
            1) GridLayout(): General Grid;
            2)GridLayout(int row, int col): frame into row and columns
                    
                GrifLayouut(2, 2): 2 rows and 2 columns;


            3) GridLayout(int row, int col, int hgap, int vgap): 
                giving specific horizontal gap and Vertical gap between items of row and column
        */
       JButton b1 = new JButton("Button 01");
       JButton b2 = new JButton("Button 02");
       JButton b3 = new JButton("Button 03");
       JButton b4 = new JButton("Button 04");
       JButton b5 = new JButton("Button 05");
       JButton b6 = new JButton("Button 06");
       JButton b7 = new JButton("Button 07");
       JButton b8 = new JButton("Button 08");
       JButton b9 = new JButton("Button 09");

       add(b1);
       add(b2);
       add(b3);
       add(b4);
       add(b5);
       add(b6);
       add(b7);
       add(b8);
       add(b9);

        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class P02_GridLayout {
    public static void main(String arr[]) {
        new MyFrame();
    }
}
