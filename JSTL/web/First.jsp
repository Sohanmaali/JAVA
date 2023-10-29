<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Retrieve Data from MySQL</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    </head>
    <body>
        <sql:setDataSource
            var="dataSource"
            driver="com.mysql.jdbc.Driver"
            url="jdbc:mysql://localhost:3306/Infojava"
            user="root"
            password="root"
            />

        <sql:query var="result" dataSource="${dataSource}">
            SELECT * FROM servlet;
        </sql:query>

        <table class="table">
            <tr>
                <c:forEach var="column" items="${result.columnNames}">
                    <th><c:out value="${column}" /></th>
                    </c:forEach>
            </tr>
            <c:forEach var="row" items="${result.rows}">
                <tr>
                    <td><c:out value="${row.name}" /></td>
                    <td><c:out value="${row.fname}" /></td>
                    <td><c:out value="${row.gmail}" /></td>
                    <td><c:out value="${row.mobile}" /></td>
                    <td><c:out value="${row.password}" /></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
