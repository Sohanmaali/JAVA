<%-- 
    Document   : Program5
    Created on : 13-Oct-2023, 9:07:25 am
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body><%
int age = 25;
String gender = "Male";

if (age >= 18) {
    if (gender.equals("Male")) {
        %>
        <p>You are an adult male.</p>
        <%
            } else if (gender.equals("Female")) {
        %>
        <p>You are an adult female.</p>
        <%
            } else {
        %>
        <p>You are an adult with an unspecified gender.</p>
        <%
            }
        } else {
        %>
        <p>You are not yet an adult.</p>
        <%
        }
        %>

    </body>
</html>
