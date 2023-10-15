<%-- 
    Document   : Program3
    Created on : 13-Oct-2023, 9:04:31 am
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
 float unit1 = 50.0f; 
 float unit2 = 75.0f;

 float total = unit1 + unit2;
 float bill = 0.0f;

 if (total > 0 && total <= 100) {
     bill = total * 5.0f;
        %>
        <p>Your bill is <%= bill %></p>
        <%
        } else if (total > 100 && total <= 200) {
            bill = total * 7.50f;
        %>
        <p>Your bill is <%= bill %></p>
        <%
        } else if (total > 200 && total <= 300) {
            bill = total * 12.50f;
        %>
        <p>Your bill is <%= bill %></p>
        <%
        } else if (total > 300) {
            bill = total * 16.0f;
        %>
        <p>Your bill is <%= bill %></p>
        <%
        }
        %>

    </body>
</html>
