/*
3. Using swing components design a form with three buttons with captions “RED”, “BLUE” and
“Green” respectively. Then write a program to handle the event such that when the user clicks
the button, the color of that button will be the same as its caption.
*/

package GUI.Questions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    JButton b1, b2, b3;
    MyFrame() {
        setTitle("Questions - UI 03");
        
        b1 = new JButton("RED");
        b2 = new JButton("BLUE");
        b3 = new JButton("GREEN");
        
        add(b1);
        add(b2);
        add(b3);

        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        
        setLayout(new FlowLayout());
        
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1) {
            b1.setBackground(Color.RED);
        } else if(e.getSource() == b2) {
            b2.setBackground(Color.BLUE);
        } else if(e.getSource() == b3) {
            b3.setBackground(Color.GREEN);
        } 
    }
}

public class P03_question03UI {
    public static void main(String arr[]) {
        new MyFrame();
    }
}

