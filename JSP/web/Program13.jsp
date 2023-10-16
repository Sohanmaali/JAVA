<%-- 
    Document   : Program13
    Created on : 16-Oct-2023, 10:47:58 am
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
        int n = 5;
        long fact = 1;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            fact *= i;
            if (i % 2 == 0) {
                sum += fact;
        %>
        <span> + <%= i %>!</span>
        <%
                } else {
                    sum -= fact;
        %>
        <span> - <%= i %>!</span>
        <%
                }
            }
        %>
        <span> = <%= sum %></span>
    </body>
</html>
