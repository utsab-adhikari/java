import java.awt.*;
import javax.swing.*;

public class P03_JButton {
    public static void main (String[] args) {
        JFrame f = new JFrame("Hey There");
        JPanel p = new JPanel();
        JButton b = new JButton("Click Me");

        p.add(b);
        f.add(p);  
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
