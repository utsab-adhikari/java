/*
4. Write a GUI program using components to find sum and difference of two numbers. Use two
text fields for giving input and a label for output. The program should display sum if user
presses mouse and difference if user release mouse. 
*/
package GUI.Questions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MyFrame extends JFrame implements MouseListener {
	JLabel l1, l2, l3;
	JTextField t1, t2;
	JPanel fields, result;
	MyFrame() {
		setTitle("Questions - UI 04");

		l1 = new JLabel("First Number: ");
		l2 = new JLabel("Second Number: ");
		l3 = new JLabel("Result will be Shown here.");

		t1 = new JTextField(10);
		t2 = new JTextField(10);

		fields = new JPanel();
		result = new JPanel();

		fields.add(l1);
		fields.add(t1);
		fields.add(l2);
		fields.add(t2);

		fields.setLayout(new GridLayout(2, 2));

		result.add(l3);

		add(fields);
		add(result);

		addMouseListener(this);

		setLayout(new GridLayout(2,1));
		setVisible(true);
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void mousePressed(MouseEvent e) {
		l3.setText("Sum of Two Number: "+(Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText())));
	}
	public void mouseReleased(MouseEvent e) {
		l3.setText("Difference of Two Number: "+(Integer.parseInt(t1.getText())-Integer.parseInt(t2.getText())));
	}
	public void mouseClicked(MouseEvent e) {

	}
	public void mouseEntered(MouseEvent e) {

	}
	public void mouseExited(MouseEvent e) {

	}
}

public class P04_question04UI {
	public static void main(String arr[]) {
		new MyFrame();
	}
}
