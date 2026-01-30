
package servlet.ServletLabQuestion03;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public class servlet03 extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        int id = Integer.parseInt(request.getParameter("teacherId"));
        String name = request.getParameter("teacherName");

        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String dbUrl = "jdbc:mysql://localhost:3306/NCIT";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(dbUrl, "root", "");
            System.out.println("Database connected!");

            String query = "UPDATE NCIT_Teacher SET TeacherName = ? WHERE TeacherId = ?";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setString(1, name);
            ps.setInt(2, id);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("<h4>Error " + e + "</h4>");
        }

        out.println("<h2>Updated in database for teacher id = " + id + " and teacher name = " + name + " </h3>");
        out.println("<h3>Thank You</h3>");
        out.close();
    }
}