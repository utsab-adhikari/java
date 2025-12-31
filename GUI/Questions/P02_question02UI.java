 /*
Write a program that divides the frame into five regions by using border layout and then add
panels in the east, north and center region. Finally add some descriptive label in the north panel,
buttons with icon in the east panel and a sample form in the center panel. You can further
subdivide the center panel, if necessary. Prepare a program with three text boxes First Number,
Second Number and Result and four buttons add, subtract, multiply and divide. Handle the
events to perform the required operation and display results.
*/

package GUI.Questions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
	JButton b1, b2, b3, b4;
	JTextField t1, t2, t3;
	MyFrame() {
		setTitle("Questions - UI 02");

		BorderLayout B1 = new BorderLayout(20, 20);

		setLayout(B1);

		JPanel eastPanel = new JPanel();
		JPanel northPanel = new JPanel();
		JPanel centerPanel = new JPanel();
		JPanel westPanel = new JPanel();
		JPanel southPanel = new JPanel();

		add(eastPanel, BorderLayout.EAST);
		add(northPanel, BorderLayout.NORTH);
		add(centerPanel, BorderLayout.CENTER);
		add(westPanel, BorderLayout.WEST);
		add(southPanel, BorderLayout.SOUTH);

		JLabel titleLabel = new JLabel("Welcome To Calculator ");

		northPanel.add(titleLabel);

		b1 = new JButton("Add + ");
		b2 = new JButton("Subtract - ");
		b3 = new JButton("Multiply * ");
		b4 = new JButton("Divide / ");

		eastPanel.setLayout(new GridLayout(4, 1, 20, 20));

		eastPanel.add(b1);
		eastPanel.add(b2);
		eastPanel.add(b3);
		eastPanel.add(b4);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		JLabel l1 = new JLabel("First Number: ");
		JLabel l2 = new JLabel("Second Number: ");
		JLabel l3 = new JLabel("Result: ");

		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);
		t3.setEditable(false);

		centerPanel.setLayout(new GridLayout(3, 2, 20, 50));

		centerPanel.add(l1);
		centerPanel.add(t1);
		centerPanel.add(l2);
		centerPanel.add(t2);
		centerPanel.add(l3);
		centerPanel.add(t3);
		
		setVisible(true);
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		int num1, num2, result;

		num1 = Integer.parseInt(t1.getText());
		num2 = Integer.parseInt(t2.getText());

		if(e.getSource() == b1) {
			result = num1 + num2;
		} else if(e.getSource() == b2) {
			result = num1 - num2;
		} else if(e.getSource() == b3) {
			result = num1 * num2;
		} else if(e.getSource() == b4) {
			result = num1 / num2;
		} else {
			result = 0;
		}

		t3.setText(String.valueOf(result));
	}
}

public class P02_question01UI {
	public static void main(String arr[]) {
		new MyFrame();
	}
}
