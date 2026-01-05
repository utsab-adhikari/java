package GUI.Components;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
    MyFrame() {
        setTitle("Components - JFrame"); // sets title of the frame

        setSize(400, 400); // sets size of the frame (width, height)
        setVisible(true); // makes the frame visible on screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit the program when window is closed
    }
}

public class P00_JFrame {
    public static void main(String[] args) {
        new MyFrame();
    }
}