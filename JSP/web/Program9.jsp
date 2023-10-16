<%-- 
    Document   : Program9
    Created on : 16-Oct-2023, 10:38:37 am
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

       if (num == 1) {
        %>
        <p>MONDAY</p>
        <%
            } else if (num == 2) {
        %>
        <p>TUESDAY</p>
        <%
            } else if (num == 3) {
        %>
        <p>WEDNESDAY</p>
        <%
            } else if (num == 4) {
        %>
        <p>THURSDAY</p>
        <%
            } else if (num == 5) {
        %>
        <p>FRIDAY</p>
        <%
            } else if (num == 6) {
        %>
        <p>SATURDAY</p>
        <%
            } else if (num == 7) {
        %>
        <p>SUNDAY</p>
        <%
            } else {
        %>
        <p>INVALID INPUT!</p>
        <%
            }
        %>
    </body>
</html>
