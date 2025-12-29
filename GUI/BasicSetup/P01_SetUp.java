package GUI.BasicSetup;
import javax.swing.*;
import java.awt.*;


class MyFrame extends JFrame {
    MyFrame() {
        // Frame Title
        this.setTitle("My First GUI Program");
        
        // Frame Size
        this.setSize(400, 400);

        // Frame Close Operation
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Frame Background Color
        this.getContentPane().setBackground(Color.LIGHT_GRAY);

        // Frame Visibility
        this.setVisible(true);
    }
}

public class P01_SetUp {
    public static void main(String[] args) {
        new MyFrame();
    }
}