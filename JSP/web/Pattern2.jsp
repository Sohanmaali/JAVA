<%-- 
    Document   : Pattern2
    Created on : 13-Oct-2023, 8:52:33 am
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
 int x = 5;

 for (int i = 1; i <= x; i++) {
     for (int j = 1; j <= x; j++) {
         if (i == j || j == 1 || i == x) {
        %>
        <span>*</span>
        <%
                } else {
        %>
        <span>&nbsp;</span>  
        <%
                }
            }
        %>
        <br/>
        <%
        }
        %>

    </body>
</html>
