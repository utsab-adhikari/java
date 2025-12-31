package GUI.Layouts;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
	MyFrame() {
		setTitle("Layouts - Borderlayout");

		BorderLayout B1 = new BorderLayout(20, 20);
		 // here 20 and 20 is horizontal and Vertical gap/space
		 /*
		BorderLayout(int hgap, int vgap);
		 */
		setLayout(B1);		

		JButton b1 = new JButton("Button 01");
		JButton b2 = new JButton("Button 02");
		JButton b3 = new JButton("Button 03");
		JButton b4 = new JButton("Button 04");
		JButton b5 = new JButton("Button 05");

		add(b1, BorderLayout.EAST);
		add(b2, BorderLayout.WEST);
		add(b3, BorderLayout.NORTH);
		add(b4, BorderLayout.SOUTH);
		add(b5, BorderLayout.CENTER);

		setVisible(true);
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class P04_BorderLayout {
	public static void main(String arr[]) {
		new MyFrame();
	}
}
