package Database.Questions;

/*
Write a program to insert three records into a table Item which is in the database shop and contains
the columns ItemID, Name, UnitPrice, Units and Expiry Date.
*/

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;


public class L06_insertionRecords {
    public static void main(String arr[]) {
        insertData(1, "firstItem", "250", 5, "jan 20 2026"); 
        insertData(1, "secondItem", "50", 4, "march 30 2027");
        insertData(1, "thirdItem", "300", 50, "jan 22 2028");

    }
    public static Connection getConnection() {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String dbUrl = "jdbc:mysql://localhost:3306/NCITDB";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(dbUrl, "root", "");
            System.out.println("Database Connected");
            return conn;
        } catch (Exception e) {
            System.out.println("Connection Error: "+e);
        }
        return null;
    }
    public static void insertData(int id, String name, String price, int units, String expDate) {
        Connection conn = getConnection();
        try {
            String query = "INSERT INTO shop(ItemID, Name, UnitPrice, Units, ExpiryDate) VALUES(?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, price);
            ps.setInt(4, units);
            ps.setString(5, expDate);
            
            ps.executeUpdate();
            System.out.println(name+" is Added to Database");
            
        } catch (Exception e) {
            System.out.println("Insertion Error: "+e);
        }
    }
}
