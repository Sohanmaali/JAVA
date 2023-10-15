<%-- 
    Document   : Program7
    Created on : 13-Oct-2023, 9:09:03 am
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
int num = 5; // Replace with the desired number for multiplication
        %>
        <table border="1">
            <%
            for (int i = 1; i <= 10; i++) {
            %>
            <tr>
                <td><%= num %></td>
                <td>&times;</td>
                <td><%= i %></td>
                <td>=</td>
                <td><%= num * i %></td>
            </tr>
            <%
            }
            %>
        </table>

    </body>
</html>
