package servlet.CookieAndSession;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class sessioncookies02 extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        Cookie[] cook = request.getCookies();
        HttpSession session = request.getSession(false);
        String name = (String) session.getAttribute("name");
        
        out.println("<h2>Hey there From Cookies Sessooin</h2>");        
        out.println("<h2>Cookie: "+cook[1].getValue()+"</h2>");
        out.println("<h2>Session: "+name+"</h2>");
        out.close();
    }
}
