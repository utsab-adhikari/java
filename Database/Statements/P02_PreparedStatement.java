package Database.Statements;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class P02_PreparedStatement {
    public static void main(String arr[]) {
        putData();
    }
    public static Connection getConnection() {
        try {
         String driver = "com.mysql.cj.jdbc.Driver";
         String dbUrl = "jdbc:mysql://localhost:3306/ncit_college";
         Class.forName(driver);
         Connection conn = DriverManager.getConnection(dbUrl, "root", "");
         System.out.println("Database Connected !");
         return conn;
        } catch(Exception e) {
            System.out.println("Connection Error:"+e);
        }
        return null;
    }
    public static void putData() {
        Connection conn = getConnection();
        try {
            String sql = "UPDATE ncit_student SET address = ? WHERE Roll_no = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "Kathmandu");
            ps.setInt(2, 3);
            
            ps.executeQuery();
            ps.close();
        } catch(Exception e) {
            System.out.println("Update Error: "+ e);
        }
    }
}
