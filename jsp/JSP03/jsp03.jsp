
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Question 03</title>
    </head>
    <body>
        <%
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        %>
        <%="Your Full Name is: "+fname+" "+lname%>
    </body>
</html>
