<%-- Document : Pattern1 Created on : 12-Oct-2023, 12:51:54 pm Author : DELL
--%> <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>JSP Page</title>
    </head>
    <body>
        <%
   int row = 5;
   for (int i = 1; i <= row; i++) {
        for (int j = 1; j <= row; j++) {
          if (j <= row - i + 1) {
        %>
        <span>*</span>
        <%
          } 
        }
        %>
        <br />
        <%
        }
        %>

    </body>
</html>
