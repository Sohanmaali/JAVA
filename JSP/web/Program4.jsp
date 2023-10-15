<%-- 
    Document   : Program4
    Created on : 13-Oct-2023, 9:05:57 am
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
 int year = 2023; // Replace with the year you want to check

 if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
        %>
        <p>Enter year is a leap year</p>
        <%
        } else {
        %>
        <p>Enter year is a normal year</p>
        <%
        }
        %>

    </body>
</html>
