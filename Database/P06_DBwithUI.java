package Database;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    JTextField t1, t2, t3, t4;
    JButton b1, b2;
    JLabel label;
    MyFrame() {
        setTitle("An Full Stack GUI Application");
        
        JLabel l1 = new JLabel("Roll No: ");
        l1.setBounds(30, 30, 100, 25);
        t1 = new JTextField(10);
        t1.setBounds(140, 30, 200, 25);
        
        JLabel l2 = new JLabel("Name: ");
        l2.setBounds(30, 70, 100, 25);
        t2 = new JTextField(10);
        t2.setBounds(140, 70, 200, 25);
        
        JLabel l3 = new JLabel("Email: ");
        l3.setBounds(30, 110, 100, 25);
        t3 = new JTextField(10);
        t3.setBounds(140, 110, 200, 25);
        
        JLabel l4 = new JLabel("Address: ");
        l4.setBounds(30, 150, 100, 25);
        t4 = new JTextField(10);
        t4.setBounds(140, 150, 200, 25);
        
        b1 = new JButton("Submit");
        b1.setBounds(50, 190, 100, 25);
        b2 = new JButton("Clear");
        b2.setBounds(160, 190, 100, 25);
        
        label = new JLabel("");
        label.setBounds(30, 290, 200, 25);
        label.setForeground(Color.GREEN);
        add(label);
        
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(b1);
        add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        setLayout(null);
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
    
        if(e.getSource() == b1) {
            
            if(t1.getText().equals("") && t2.getText().equals("") && t3.getText().equals("") && t4.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "All fields required !!");
                t1.requestFocus();
            } else {
                int rn = Integer.parseInt(t1.getText());    
                insertData(rn, t2.getText(), t3.getText(), t4.getText());
                label.setText(t2.getText()+" added to Database");
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
            }
            
        } else if(e.getSource() == b2) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
        }
    }
    
    public static Connection getConnection() {
        try {
            
            String driver = "com.mysql.cj.jdbc.Driver";
            String dbUrl = "jdbc:mysql://localhost:3306/NCITDB";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(dbUrl, "root", "");
            System.out.println("Database Connected Successfully");
            return conn;
            
        } catch (Exception e) {
            System.out.println("Connection error :"+e);
        }
      return null;
    }
    
    public static void insertData(int roll, String name, String email, String address) {
        try{
            String query = "INSERT INTO ncit_table02(roll, name, email, address) VALUES(?, ?, ?, ?)";
            
            PreparedStatement ps = getConnection().prepareStatement(query);
            
            ps.setInt(1, roll);
            ps.setString(2, name);
            ps.setString(3, email);
            ps.setString(4, address);
            
            int result = ps.executeUpdate();
            System.out.println(result+"row(s) inserted into Database");
        } catch(Exception e) {
            System.out.println("Insertion Error: "+e);
        }
    }
}

public class P06_DBwithUI {
    public static void main(String arr[]) {
       new MyFrame();
    }
    public static Connection getConnection() {
        
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String dbUrl = "jdbc:mysql://localhost:3306/NCITDB";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(dbUrl, "root", "");
            System.out.println("Database Connected Successfully");
            return conn;
        } catch (Exception e) {
            System.out.println("Connection Error: "+e);
        }
        return null;
    }
}
