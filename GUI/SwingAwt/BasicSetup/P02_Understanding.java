package GUI.BasicSetup;
import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
	MyFrame() {
		setTitle("Understanding The Basic");
		 // sets title of the frame

		JPanel p1 = new JPanel(); // JPanel
		JButton b1 = new JButton("Click Me 1");
		JButton b2 = new JButton("Click Me 2");
		p1.add(b1);
		p1.add(b2);
		add(p1);

		setSize(400, 400); //sets size of the frame
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // default close operation: exit
	}
}

public class P02_Understanding{
	public static void main(String arr[]) {
		new MyFrame();
	}
}
