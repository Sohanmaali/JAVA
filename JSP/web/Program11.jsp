<%-- 
    Document   : Program11
    Created on : 16-Oct-2023, 10:42:12 am
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
        int choice = 2;
        float r =3;
        float ans=0;

        switch (choice) {
            case 1:
       
        r = Float.parseFloat(request.getParameter("radius"));
        ans = 3.14f * r * r;
        %>
        <p>Area of the circle = <%= ans %></p>
        <%
                    break;
                case 2:
               ans = 2 * r;
        %>
        <p>Diameter of the circle = <%= ans %></p>
        <%
                    break;
                case 3:
       
        ans = 2 * 3.14f * r;
        %>
        <p>Circumference of the circle = <%= ans %></p>
        <%
                    break;
                default:
        %>
        <p>Invalid choice!</p>
        <%
            }
        %>
    </body>
</html>
