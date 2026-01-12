package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class P01_Connection {

    public static void main(String arr[]) {
        getConnection();
    }

    public static Connection getConnection() {

        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String dbUrl = "jdbc:mysql://localhost:3306/NCITDB";
            /*
            here NCITDB is name of the Database created in MySQL Database (XAMPP)
            */
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(dbUrl, "root", "");
            System.out.println("Database Connected Successfully");
            return conn;
        } catch (Exception e) {
            System.out.println("Connection Error: " + e);
        }
        return null;
    }

}