<%-- 
    Document   : Program14
    Created on : 16-Oct-2023, 10:50:55 am
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
       int n = 3;
       int i, fact, x = 2, sum = 0;

       for (i = 1; i <= n; i++) {
           fact = 1;
           for (int j = 1; j <= x; j++) {
               fact *= j;
           }
           out.print(x + "! ");
           if (i < n) {
               out.print(" + ");
           }
           sum += fact;
           x += 2;
       }
        %>
        <p> = <%= sum %></p>
    </body>
</html>
