
package servlet.ServletLabQuestion01;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.*;

public class servlet01 extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        
        out.println("<h2>Welcome to Servlet 01</h2>");
        out.println("<h2>First Name: "+firstname+"</h2>");
        out.println("<h2>Last Name: "+lastname+"</h2>");
        out.close();
    }
}

