package Database.Statements;


import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class P01_GeneralStatement {
    public static void main(String arr[]) {
        getData();
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
    public static void getData() {
        try {
            Statement st = getConnection().createStatement();
            ResultSet result = st.executeQuery("SELECT * FROM ncti_college WHERE roll_no = 2");
            
            while(result.next()) {
                
                System.out.println(result.getString("Name"));
                System.out.println(result.getString("Address"));
                System.out.println(result.getString("Email"));

            }
        } catch(Exception e) {
            System.out.println("Retrieve Error: "+ e);
        }
    }
}

