<%-- 
    Document   : Pattern4
    Created on : 13-Oct-2023, 8:57:31 am
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
int row = 5;
int k = 1;

for (int i = 1; i <= row; i++) {
    for (int j = 1; j <= i; j++) {
        %>
        <%= k %> 
        <%
                k++;
            }
        %>
        <br/>
        <%
        }
        %>

    </body>
</html>
