import java.awt.*;
import javax.swing.*;

public class P02_Jpanel {
    public static void main (String[] args) {
        JFrame f = new JFrame("Hey There");
        JPanel p = new JPanel();
        JLabel l = new JLabel("Hy from utsab");
        f.add(l);
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
