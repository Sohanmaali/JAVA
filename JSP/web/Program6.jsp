<%-- 
    Document   : Program6
    Created on : 13-Oct-2023, 9:08:30 am
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
 int N = 10; // Replace with the desired value of N
 int sum = 0;

 for (int i = 1; i <= N; i++) {
     sum += i;
 }

        %>
        <p>The sum of numbers from 1 to <%= N %> is <%= sum %></p>

    </body>
</html>
