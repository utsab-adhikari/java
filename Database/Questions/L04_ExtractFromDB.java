package Database.Questions;

/*
4. Write a program to extract the user information such as Reg_no, Name, Address, Phone_no from the
database and display in the console.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class L04_ExtractFromDB {
    public static void main(String[] args) {
        extractUserInfo();
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

    public static void extractUserInfo() {
        Connection conn = getConnection();
        try {
            String sql = "SELECT Reg_no, Name, Address, Phone_no FROM Users";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("User Information:");
            while (rs.next()) {
                int regNo = rs.getInt("Reg_no");
                String name = rs.getString("Name");
                String address = rs.getString("Address");
                String phoneNo = rs.getString("Phone_no");
                System.out.println("Reg_no: " + regNo + ", Name: " + name + ", Address: " + address + ", Phone_no: " + phoneNo);
            }
        } catch (Exception e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }
}
