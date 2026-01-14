package Database.Questions;

/*
2. Write a java program to design an GUI application that reads teacher information like as tchID,
tchName, tchAddress, tchPhone and store into a database called “citizen” when user clicks on a
button(login).
*/

// This is Simple and Exam Oriented Solution


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;


class MyFrame1 extends JFrame implements ActionListener {
    JTextField t1, t2, t3, t4;
    JButton b1, b2;
    JLabel l1, l2, l3, l4, l5;
    
    MyFrame1() {
        setTitle("GUI For Teachers");
        
        setLayout(null);
        
        l1 = new JLabel("Id: ");
        l1.setBounds(30, 30, 100, 25);
        
        t1 = new JTextField(10);
        t1.setBounds(140, 30, 200, 25);
        
        l2 = new JLabel("Name: ");
        l2.setBounds(30, 70, 100, 25);
        
        t2 = new JTextField(10);
        t2.setBounds(140, 70, 200, 25);
        
        l3 = new JLabel("Address: ");
        l3.setBounds(30, 110, 100, 25);
        
        t3 = new JTextField(10);
        t3.setBounds(140, 110, 200, 25);
        
        l4 = new JLabel("Phone: ");
        l4.setBounds(30, 150, 100, 25);
        
        t4 = new JTextField(10);
        t4.setBounds(140, 150, 200, 25);
        
        b2 = new JButton("Login");
        b2.setBounds(140, 200, 100, 25);
        
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        
        add(b2);

        b2.addActionListener(this);
        
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        int id = Integer.parseInt(t1.getText());
        String name = t2.getText();
        String address = t3.getText();
        String phone = t4.getText();
        insertData(id, name, address, phone);
    }
    
    public static Connection getConnection() {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String dbUrl = "jdbc:mysql://localhost:3306/citizen";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(dbUrl, "root", "");
            System.out.println("Database Connected !");
            return conn;
        } catch(Exception e) {
            System.out.println("Connection Error: "+e);
        }
        return null;
    }
    public static void insertData(int id, String name, String address, String phone) {
        Connection conn = getConnection();
        try {
            
            String query = "INSERT INTO teachres(tchID, tchName, tchAddress, tchPhone) values(?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, address);
            ps.setString(4, phone);
            ps.executeUpdate();
            System.out.println(name+" Added to the Database");
        } catch (Exception e) {
            System.out.println("Insertion Error: "+e);
        }
    }

}

public class L02_Teachers {
    public static void main(String arr[]) {
        new MyFrame1();
    }
}
