<%-- 
    Document   : Program15
    Created on : 16-Oct-2023, 10:52:41 am
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
        int x = 3;
        int y = 4;
        int pow = 1;
        int sum = 0;

        for (int i = 1; i <= y; i++) {
            pow = pow * x;
            sum += pow;

            out.print(x + "^" + i);
            if (i < y) {
                out.print(" + ");
            }
        }
        %>
        <p> = <%= sum %></p>
    </body>
</html>
