/*
5. Write a GUI program using components to find factorial and cube of number. Use TextField
for giving input and label for output. The program should display factorial if user press mouse
on result button and cube if user release mouse from result button
*/

package GUI.Questions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MyFrame extends JFrame implements MouseListener {
    JTextField t1;
    JButton b1;
    JLabel l1, result;

    MyFrame() {
        setTitle("Question - UI 05");

        l1 = new JLabel("Enter Number: ");
        b1 = new JButton("Result");
        t1 = new JTextField(10);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        p1.add(l1);
        p1.add(t1);
        p1.setLayout(new FlowLayout());

        result = new JLabel("Result will be Shown here.");
        p2.add(result);

        p3.add(b1);

        add(p1);
        add(p2);
        add(p3);

        b1.addMouseListener(this);

        setLayout(new GridLayout(3, 1, 10, 50));

        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mousePressed(MouseEvent e) {
        int num, fact=1;
        num = Integer.parseInt(t1.getText());
        for(int i=num; i>0; i--) {
            fact = fact * i;
        }
        result.setText(
            "Factorial of the Number "+num+" is: "+fact+" ."
        );
    }
    public void mouseReleased(MouseEvent e) {
        int num, cube;

        num = Integer.parseInt(t1.getText());
        cube = num*num*num;
        result.setText("Cube of the Number "+ num+ " is: "+cube+" .");
    }
    public void mouseExited(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}
}

public class P05_question05UI {
    public static void main(String arr[]) {
        new MyFrame();
    }
}
