
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP 021</title>
    </head>
    <body>
        
        <%@page import="java.io.*" %>        
        <%@page import="javax.servlet.*" %>
        <%@page import="javax.servlet.http.*" %>
        <%
        Cookie[] cook = request.getCookies();
        if(cook !=null) {
            %>
           <h2><%= "Cookie Found Cookie content "+cook[0].getValue() %></h2>  
            <%
             
        }
        %>
        
        <% 
        session = request.getSession(false);
        String name =(String) session.getAttribute("name");
        
        out.println(name);
        %>
        
    </body>
</html>
