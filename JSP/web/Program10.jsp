<%-- 
    Document   : Program10
    Created on : 16-Oct-2023, 10:40:49 am
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
        int num = 5;
        int ans = (num > 0 ? 1 : (num < 0 ? 2 : 3));
        
        switch (ans) {
            case 1:
        %>
        <p>Positive num</p>
        <%
                    break;
                case 2:
        %>
        <p>Negative num</p>
        <%
                    break;
                case 3:
        %>
        <p>Zero</p>
        <%
                    break;
            }
        %>

    </body>
</html>
