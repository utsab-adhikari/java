
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Question 04</title>
    </head>
    <body>
        <%
          String username = request.getParameter("username");
          if(request.getParameter("password").equals("1234")) {
              %>
              <h2>Thank You for Login..</h2>
              <%
          } else {
              %>
              <h3>Redirecting ....</h3>
              <%
               response.sendRedirect("register.html");
          }
        %>
    </body>
</html>
