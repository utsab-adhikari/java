package servlet.ServletDemo;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class ServletDemo extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        out.println("<html><body>");
        if (name != null && !name.trim().isEmpty()) {
            out.println("<h1>Hello, " + name + "!</h1>");
        } else {
            out.println("<h1>Hello, World!</h1>");
        }
        out.println("</body></html>");
    }

}
