<%-- 
    Document   : Program2
    Created on : 13-Oct-2023, 9:03:20 am
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
int num = 4;  // Replace with the number you want to check
int num1 = 3; // Replace with the divisor

if (num % num1 == 0) {
        %>
        <p>
            Enter num is divisible by <%= num1 %>
        </p>
        <%
        } else {
        %>
        <p>
            Enter num is Not divisible by <%= num1 %>
        </p>
        <%
        }
        %>

    </body>
</html>
