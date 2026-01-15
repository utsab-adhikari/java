package Database.Statements;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class P03_CallableStatement {
    public static void main(String[] args) {

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
