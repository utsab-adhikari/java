package Database.Questions;

/*
You are hired by a reputed software company which is going to design an application for “Movie Rental
System”. Your responsibility is to design a schema named MRS and create a table named Movie(id,
Tille, Genre, Language, Length). Write a program to design a GUI form to take input for this table and
insert the data into table after clicking the OK button.

*/ 

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    
    JLabel l1, l2, l3, l4, l5, l6;
    JButton b1;
    JTextField t1, t2, t3, t4, t5;
    MyFrame() {
        setTitle("Movie GUI");
        setLayout(null);
        
        l1 = new JLabel("Id: ");
        l1.setBounds(30, 30, 100, 25);
        add(l1);
        
        t1 = new JTextField(10);
        t1.setBounds(140, 30, 200, 25);
        add(t1);
        
        l2 = new JLabel("Title: ");
        l2.setBounds(30, 70, 100, 25);
        add(l2);
        
        t2 = new JTextField(10);
        t2.setBounds(140, 70, 200, 25);
        add(t2);
        
        l3 = new JLabel("Genre: ");
        l3.setBounds(30, 110, 100, 25);
        add(l3);
        
        t3 = new JTextField(10);
        t3.setBounds(140, 110, 200, 25);
        add(t3);
        
        l4 = new JLabel("Language: ");
        l4.setBounds(30, 150, 100, 25);
        add(l4);
        
        t4 = new JTextField(10);
        t4.setBounds(140, 150, 200, 25);
        add(t4);
        
        l5 = new JLabel("Length: ");
        l5.setBounds(30, 190, 100, 25);
        add(l5);
        
        t5 = new JTextField(10);
        t5.setBounds(140, 190, 200, 25);
        add(t5);
        
        b1 = new JButton("OK");
        b1.setBounds(70, 230, 100, 25);
        add(b1);

        b1.addActionListener(this);
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static Connection getConnection() {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String dbUrl = "jdbc:mysql://localhost:3306/MRS";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(dbUrl, "root", "");
            System.out.println("DataBAse Connected Successfully");
            return conn; 
        } catch (Exception e) {
            System.out.println("Connection Error: "+e);
        }
        return null;
    }
    
    public static void insertData(int id, String title, String genre, String language, String length) {
        Connection conn = getConnection();
        try {
            String query = "INSERT INTO Movie(id, Title, Genre, Language, Length) VALUES(?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.setString(2, title);
            ps.setString(3, genre);
            ps.setString(4, language);
            ps.setString(5, length);
            
            ps.executeUpdate();
            
            System.out.println(title+" is Added to Database");
            
        } catch(Exception e) {
            System.out.println("Insertion Error:" + e);
        }
    }
    
    public void actionPerformed(ActionEvent e ) {
       int id = Integer.parseInt(t1.getText());
       String title = t2.getText();
       String genre = t3.getText();
       String language = t4.getText();
       String length = t5.getText();
       insertData(id, title, genre, language, length);
    }
}

public class L03_MovieGUI {
    public static void main(String arr[]) {
        new MyFrame();
    }
}