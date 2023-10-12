<%-- 
    Document   : First
    Created on : 12-Oct-2023, 1:30:30 pm
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
        for(int i= 1;i<=row;i++) 
        {
            for(int j= 1;j<=row;j++) {
                if(j>=row-i+1){
        %>
        <p>*</p>
        <% }else {%>
        <p>_</p>
        <%
         }
     }
 }%>
    </body>
</html>
