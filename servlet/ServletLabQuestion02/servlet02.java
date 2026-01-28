package servlet.ServletLabQuestion02;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class servlet02 extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        int p = Integer.parseInt(request.getParameter("principal"));
        int t = Integer.parseInt(request.getParameter("time"));
        int r = Integer.parseInt(request.getParameter("rate"));
        
        int si = (p*t*r)/100;
        
        out.println("<h3> The Simple Interest is: "+si);
        out.close();
    }
}