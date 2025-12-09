import java.awt.*;
import javax.swing.*;

public class P01_JFrame {
    public static void main (String[] args) {
        JFrame f = new JFrame("Hey There");
        f.setBackground(Color.blue);
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
