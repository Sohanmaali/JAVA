<%-- 
    Document   : Program8
    Created on : 16-Oct-2023, 10:31:27 am
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
      int num1 = 200;
      int num2 = 100;

      if (num1 > num2) {
        %>
        <p>Loss <%= (num1 - num2) %> rs</p>
        <%
            } else if (num1 < num2) {
        %>
        <p>Profit <%= (num2 - num1) %> rs</p>
        <%
            } else {
        %>
        <p>No Profit, No Loss</p>
        <%
            }
        %>
    </body>
</html>
