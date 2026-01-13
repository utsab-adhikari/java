package Database.Questions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class L01_CRUD {
    public static Connection getConnection() {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String dbUrl = "jdbc:mysql://localhost:3306/NCITDB";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(dbUrl, "root", "");
            System.out.println("Database Connected Successfully");
            return conn;
        } catch (Exception e) {
            System.out.println("DB Connection Error: " + e);
        }
        return null;
    }

    public static void insertData(int roll, String name, String email, String address) {
        Connection conn = getConnection();
        try {
            String query = "INSERT INTO ncit_table02(roll, name, email, address) VALUES(?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, roll);
            ps.setString(2, name);
            ps.setString(3, email);
            ps.setString(4, address);
            ps.executeUpdate();
            System.out.println(name + " added to Database");
        } catch (Exception e) {
            System.out.println("InsertionError: " + e);
        }
    }

    public static void retrieveAllData() {
        try {
            Statement st = getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM ncit_table02");

            while (rs.next()) {
                System.out.println("Roll: " + rs.getString("roll") + " | Name: " + rs.getString("name") + " | Email: "
                        + rs.getString("email"));
            }
            System.out.println("---------------------\n");

        } catch (Exception e) {
            System.out.println("RetriveError: " + e);
        }
    }

    public static void retrieveData(int roll) {
        Connection conn = getConnection();
        try {
            String query = "SELECT * FROM ncit_table02 WHERE roll = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, roll);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("Roll: " + rs.getString("roll") + " | Name: " + rs.getString("name") + " | Email: "
                        + rs.getString("email") + " | Address: " + rs.getString("address"));
            }
            System.out.println("---------------------\n");

        } catch (Exception e) {
            System.out.println("RetriveError: " + e);
        }
    }

    public static void deleteData(int roll) {
        Connection conn = getConnection();
        try {
            String query = "DELETE FROM ncit_table02 WHERE roll = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, roll);
            ps.executeUpdate();
            System.out.print("Data Deleted");
            System.out.println("---------------------\n");

        } catch (Exception e) {
            System.out.println("DeletionError: " + e);
        }
    }

    public static void updateData(int roll, String name) {
        Connection conn = getConnection();
        try {
            String query = "UPDATE ncit_table02 SET name = ? WHERE roll = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setInt(2, roll);
            ps.executeUpdate();
            System.out.println("Roll: " + roll + "'s Data Updated");
            System.out.println("---------------------\n");

        } catch (Exception e) {
            System.out.println("DeletionError: " + e);
        }
    }

    public static void main(String arr[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nYour Choices ----> ");
            System.out.println("1. Insert Data");
            System.out.println("2. Get ALl Data");
            System.out.println("3. Get Specific Data");
            System.out.println("4. Update Data");
            System.out.println("5. Delete Data");
            System.out.println("6. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("<--- Insertion --->");
                    System.out.print("Enter Roll:");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name:");
                    String name = sc.nextLine();
                    System.out.print("Enter Email:");
                    String email = sc.nextLine();
                    System.out.print("Enter Address:");
                    String address = sc.nextLine();
                    insertData(roll, name, email, address);
                    break;

                case 2:
                    System.out.println("<--- Get ALL --->");
                    retrieveAllData();
                    break;

                case 3:
                    System.out.println("<--- Get Data --->");
                    System.out.print("Enter Roll:");
                    int roll1 = sc.nextInt();
                    sc.nextLine();
                    retrieveData(roll1);
                    break;

                case 4:
                    System.out.println("<--- Update Data --->");
                    System.out.print("Enter Roll:");
                    int roll2 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name:");
                    String name1 = sc.nextLine();
                    updateData(roll2, name1);
                    break;

                case 5:
                    System.out.println("<--- Delete --->");
                    System.out.print("Enter Roll:");
                    int roll3 = sc.nextInt();
                    sc.nextLine();
                    deleteData(roll3);
                    break;

                case 6:
                    System.out.println("Exiting ...... ");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice !");
                    break;

            }
        }

    }
}
