package Database.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class P05_Retrieve {
     public static void main(String arr[]) {
        getData();
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

      public static void getData() {
        try{
            Statement statement = getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM ncit_table01");
           
            while(resultSet.next()) {
                System.out.println("Roll: "+resultSet.getInt("roll"));
                System.out.println("Name: "+resultSet.getString("name"));
                System.out.println("Address: "+resultSet.getString("address"));
                System.out.println("---------------------------");
            }
        } catch(Exception e) {
            System.out.println("Insertion Error: "+e);
        }
    }
}
