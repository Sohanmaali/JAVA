<%-- 
    Document   : Program16
    Created on : 16-Oct-2023, 10:54:05 am
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
      int n = 125;
      int rev = 0;

      for (; n > 0; n /= 10) {
          int rem = n % 10;
          rev = rev * 10 + rem;
      }
        %>
        <p>Reverse = <%= rev %></p>
    </body>
</html>
