<%-- 
    Document   : Program12
    Created on : 16-Oct-2023, 10:45:34 am
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
         int num = 52;

         switch (num % 2) {
             case 1:
        %>
        <p>Entered number is Odd</p>
        <%
                    break;
                case 0:
        %>
        <p>Entered number is Even</p>
        <%
                    break;
            }
        %>
    </body>
</html>
