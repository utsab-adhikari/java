package servlet.CookieAndSession;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class sessioncookies01 extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        
        Cookie ck = new Cookie("name", name);
        HttpSession hs = request.getSession();
        hs.setAttribute("name", name);
        response.addCookie(ck);
        out.println("<html><body>");
        out.println("<h3>Hey "+name+" click the button to see Cookie and Session info</h3>");
        out.println("<form name='form02' method='post' action='sessioncookies02'>");
        out.println("<input type='submit' value='Submit'>");
        out.println("</form>");
        out.println("</body></html>");
        out.close();
    }
}