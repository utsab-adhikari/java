package Database.Questions;

/*
Write a java program to create login form with user id, password, ok button and cancel button.
Handle key events such that pressing ‘I’ performs login and pressing ‘C’ clears text boxes and
puts focus on user id, text box. Assume user table having fields Uid and Password in the
database named account.
*/

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class MyFrame01 extends JFrame implements ActionListener, KeyListener {

	JButton b1, b2;
	JTextField t1;
        JPasswordField p1;
	JLabel l1, l2, l3;
	MyFrame01() {
		setTitle("Login Form");
		setLayout(null);

		l1 = new JLabel("Welcome To Login Form ");
		l1.setBounds(75, 30, 200, 25);

		l2 = new JLabel("User Id: ");
		l2.setBounds(30, 90, 100, 25 );

		t1 = new JTextField(10);
                t1.setBounds(140, 90, 200, 25);
                
                l3 = new JLabel("Password: ");
                l3.setBounds(30, 140, 100, 25);
                
                p1 = new JPasswordField(10);
                p1.setBounds(140, 140, 200, 25);
                
                b1 = new JButton("Ok");
                b1.setBounds(30, 180, 100, 25);
                
                b2 = new JButton("Clear");
                b2.setBounds(140, 180, 100, 25);
                
                add(l1);
                add(l2);
                add(t1);
                add(l3);
                add(p1);
                add(b1);
                add(b2);
                
                b1.addActionListener(this);
                b2.addActionListener(this);
                
                t1.addKeyListener(this);                
                p1.addKeyListener(this);
                
                setVisible(true);
                setSize(500, 500);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == b1) {
               login();
            } else if(e.getSource() == b2) {
                clear();
            }
        }
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyChar() == 'I') {
                login();
            }
            if(e.getKeyChar() == 'C') {
                clear();
            }
        }
        @Override
        public void keyReleased(KeyEvent e) {
            
        }
        @Override
        public void keyTyped(KeyEvent e) {
            
        }
        
        public static Connection getConnection() {
            
            try {
                String driver = "com.mysql.cj.jdbc.Driver";
                String dbUrl = "jdbc:mysql://localhost:3306/account";
                Class.forName(driver);
                Connection conn = DriverManager.getConnection(dbUrl, "root", "");
                System.out.println("Database Connected Successfully");
                return conn;
            } catch (Exception e) {
                System.out.println("Connection Error: "+e);
            }
            
            return null;
        }
        
        public static void validate(String userId, String password) {
            Connection conn = getConnection();
            try {
                String query = "SELECT Password FROM users where Uid = ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, userId);
                ResultSet rs = ps.executeQuery();   
                
                if(rs.next()) {
                    String passwordFromDb = rs.getString("Password");
                   if(password.equals(passwordFromDb)) {
                        JOptionPane.showMessageDialog(null, "Login Successfull");
                   } else {
                       JOptionPane.showMessageDialog(null, "InValid Password");
                   }
                } else {
                    JOptionPane.showMessageDialog(null, "User Not Found");
                }
                
            } catch (Exception e) {
                System.out.println("Validation Error:"+e);
            }
        }
        
        public void login() {
               String Uid = t1.getText();
               String password = String.valueOf(p1.getPassword());
               if(Uid.equals("")) {
                   JOptionPane.showMessageDialog(null, "Enter User Id");
                   t1.requestFocus();
               } else if(password.equals("")) {
                   JOptionPane.showMessageDialog(null, "Enter Password");
                   p1.requestFocus();
               } else {
                   validate(Uid, password);
               }
        }
        public void clear() {
                t1.setText("");
                p1.setText("");
                t1.requestFocus();
        }
} 

public class L08_LoginForm {
	public static void main(String arr[]) {
            new MyFrame01();
        }
}
