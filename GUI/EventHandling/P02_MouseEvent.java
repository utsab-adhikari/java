package GUI.EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MyFrame extends JFrame implements MouseListener {

    JLabel l1, l2, l3, l4, l5;
    MyFrame() {
        setTitle(" Event Handling - MouseEvents");

        l1 = new JLabel("First Label");
        l2 = new JLabel("Second Label");
        l3 = new JLabel("Third Label");
        l4 = new JLabel("Fourth Label");
        l5 = new JLabel("Fifth Label");

        l1.setBounds(30, 30, 150, 25);
        l2.setBounds(30, 70, 150, 25); 
        l3.setBounds(30, 110, 150, 25); 
        l4.setBounds(30, 150, 150, 25); 
        l5.setBounds(30, 190, 150, 25); 

        add(l1);  
        add(l2); 
        add(l3);
        add(l4);
        add(l5); 

        addMouseListener(this);


        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void mousePressed(MouseEvent e){
        l1.setText("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e){
        l2.setText("Mouse Released");
    }
    public void mouseClicked(MouseEvent e){
        l3.setText("Mouse Clicked");
    }
    public void mouseEntered(MouseEvent e){
        l4.setText("Mouse Entered");
    }
    public void mouseExited(MouseEvent e){
        l5.setText("Mouse Exited");
    }
}

public class P02_MouseEvent {
    public static void main(String arr[]) {
        new MyFrame();
    }
}
