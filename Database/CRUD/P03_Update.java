package Database.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class P03_Update {
    public static void main(String arr[]) {
        updateData();
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
    
    public static void updateData() {
        try{
            Statement statement = getConnection().createStatement();
            String query = "UPDATE ncit_table01 SET name = 'Shyam' WHERE roll = 2";
            
            int result = statement.executeUpdate(query);
            System.out.println(result+" row(s) Updated");
        } catch(Exception e) {
            System.out.println("Insertion Error: "+e);
        }
    }
}


