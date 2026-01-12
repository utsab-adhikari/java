package Database.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class P02_Insertion {
    public static void main(String arr[]) {
        insertData();
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
    
    public static void insertData() {
        try{
            Statement statement = getConnection().createStatement();
            String query = "INSERT INTO ncit_table01(roll, name, address) "
                    + "values(3, 'Hari', 'Butwal')";
            
            int result = statement.executeUpdate(query);
            System.out.println(result+"row(s) inserted into Database");
        } catch(Exception e) {
            System.out.println("Insertion Error: "+e);
        }
    }
}
