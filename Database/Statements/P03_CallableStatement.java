package Database.Statements;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

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
    public static void callProcedure(int id, String name) {
        Connection conn = getConnection();
        CallableStatement cstmt = null;
        try {
            String sql = "{call InsertDepartment(?, ?)}";
            cstmt = conn.prepareCall(sql);
            cstmt.setInt(1, id);
            cstmt.setString(2, name);
            cstmt.execute();
            System.out.println("Stored Procedure Executed Successfully");
        } catch (Exception e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }
}
