package Database.Questions;

/*
Assume a table MOVIE(id, title, genre). Now, using JDBC perform queries:
a. Add any three records to the MOVIE table.
b. Using a prepared statement, update the genre to “Comedy” having the title “Jatra”.
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class L05_MoviePreparedSt {
    public static void main(String[] args) {
        addMovies();
        updateMovieGenre("Jatra", "Comedy");
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
    public static void addMovies() {
        Connection conn = getConnection();
        try {
            String sql = "INSERT INTO MOVIE (id, title, genre) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, 1);
            pstmt.setString(2, "Jatra");
            pstmt.setString(3, "Drama");
            pstmt.executeUpdate();

            pstmt.setInt(1, 2);
            pstmt.setString(2, "Hasi");
            pstmt.setString(3, "Comedy");
            pstmt.executeUpdate();

            pstmt.setInt(1, 3);
            pstmt.setString(2, "Ratra");
            pstmt.setString(3, "Horror");
            pstmt.executeUpdate();

            System.out.println("Movies Added Successfully");
        } catch (Exception e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }

    public static void updateMovieGenre(String title, String newGenre) {
        Connection conn = getConnection();
        try {
            String sql = "UPDATE MOVIE SET genre = ? WHERE title = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, newGenre);
            pstmt.setString(2, title);
            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Movie genre updated successfully.");
            } else {
                System.out.println("No movie found with the title: " + title);
            }
        } catch (Exception e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }
}