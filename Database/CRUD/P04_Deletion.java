package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class P04_Deletion {
    public static void main(String arr[]) {
        deleteData();
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
    
    public static void deleteData() {
        try{
            Statement statement = getConnection().createStatement();
            String query = "DELETE FROM ncit_table01 WHERE roll = 2";
            
            int result = statement.executeUpdate(query);
            System.out.println(result+"row(s) Deleted from Database");
        } catch(Exception e) {
            System.out.println("Insertion Error: "+e);
        }
    }
}

