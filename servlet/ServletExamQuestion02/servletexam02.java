
package servlet.ServletExamQuestion02;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class servletexam02 extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String input = request.getParameter("input02");
        out.println("<h2> Hello there From Post Method :"+input+"</h2>");
        out.close();
    }
      public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String input = request.getParameter("input01");
        out.println("<h2> Hello there From Get Method :"+input+"</h2>");
        out.close();
    }
}
