<%-- 
    Document   : Pattern3
    Created on : 13-Oct-2023, 8:55:14 am
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
int k = row - 1;

for (int i = 1; i <= row; i++) {
    for (int j = 1; j <= (row << 1); j++) {
        if (j > row - i + 1 && j <= (row << 1) - k) {
        %>
        <span>*</span> 
        <%
                } else {
        %>
        <span> &nbsp;&nbsp;</span>
        <%
                }
            }
            k--;
        %>
        <br/>
        <%
        }
        %>

    </body>
</html>
