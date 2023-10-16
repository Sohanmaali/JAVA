<%-- 
    Document   : Program17
    Created on : 16-Oct-2023, 10:57:06 am
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
        int n1 = 45;
        int n2 = 3;
        int hcf;

        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        hcf = n1;
        %>
        <p>HCF (GCD) = <%= hcf %></p>
    </body>
</html>
