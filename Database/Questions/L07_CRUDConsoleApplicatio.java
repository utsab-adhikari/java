package Database.Questions;

/*
Consider db_college and tbl_student as database name and table respectively where a tbl_student
has columns name, faculty and batch. Write console application with CREATE, READ, UPDATE and
DELETE queries only using prepared statement.
*/
import java.sql.PreparedStatement;
import  java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;

public class L07_CRUDConsoleApplication {
    
    public static void main(String arr[]) {
        insertData("Utsab", "BEIT", "2024");
    }
    
    public static Connection getConnection() {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String dbUrl = "jdbc:mysql://localhost:3306/db_college";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(dbUrl, "root", "");
            System.out.println("Database connected!");
            return conn;
        } catch(Exception e) {
            System.out.println("Connection Error: "+e);
        }
        return null;
    }
    public static void insertData(String name, String faculty, String batch) {
        Connection conn = getConnection();
        try {
            String query = "INSERT INTO tbl_student(name, faculty, batch) VALUES(?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, faculty);
            ps.setString(3, batch);
            ps.executeUpdate();
            
            System.out.println(name+" added to db_ college");

        } catch(Exception e) {
            System.out.println("Insertion Error:"+e);
        }
    }
    public static void readData(String name) {
         Connection conn = getConnection();
        try {
            String query = "SELECT * FROM tbl_student WHERE name = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ResultSet rs =  ps.executeQuery();
            while(rs.next()) {
                System.out.println("NAme: "+rs.getString("name")+" Faculty: "+rs.getString("faculty")+" batch: "+rs.getString("batch"));
            }

        } catch(Exception e) {
            System.out.println("Read Error:"+e);
        }
    }
    public static void deleteData(String name) {
         Connection conn = getConnection();
        try {
            String query = "DELETE FROM tbl_student WHERE name = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.executeQuery();
            System.out.println(name+" Deleted From db_ college");
        } catch(Exception e) {
            System.out.println("Deletion Error:"+e);
        }
    }
    
    public static void updateData(String name, String faculty) {
        Connection conn = getConnection();
        try {
            String query = "UPDATE tbl_student SET faculty = ? WHERE name = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, faculty);            
            ps.setString(2, name);
            ps.executeQuery();
            
            System.out.println(name+" Updated in db_ college");
        } catch(Exception e) {
            System.out.println("Update Error:"+e);
        }
    }
}
