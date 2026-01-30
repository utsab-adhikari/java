
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP 02</title>
    </head>
    <body>
        <%@page import="java.io.*" %>        
        <%@page import="javax.servlet.*" %>
        <%@page import="javax.servlet.http.*" %>
        
         <form name="form02" action="jsp021.jsp" method="post">
            <input type="submit" value="Submit">
        </form>
        
        <% String name = request.getParameter("name"); %>
        
        <% Cookie ck = new Cookie("name", name); %>
        <% HttpSession hs = request.getSession(); %>
        <% hs.setAttribute("name", name);%>
        
       <% response.addCookie(ck); %>
    </body>
    
</html>
