<%-- 
    Document   : Program1
    Created on : 13-Oct-2023, 9:01:38 am
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
char ch = 'A'; 

int num = (int) ch;

if (num >= 65 && num <= 90) {
    num = num + 32;
    char al = (char) num;
        %>
        <p>
            lower case of <%= ch %> = <%= al %>
        </p>
        <%
        } else {
        %>
        <p>
            Please Enter an Uppercase Alphabet
        </p>
        <%
        }
        %>

    </body>
</html>
