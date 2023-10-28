<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
  <head>
    <title>J S T L Page Example</title>
  </head>
  <body>
    <h1>Welcome to the J S T L Page Example</h1>

    <!-- Define a variable -->
    <c:set var="greeting" value="Hello, JSTL!" />

    <!-- Display the value of the variable -->
    <!--<p>${greeting}</p>-->

    <!-- Conditional rendering -->
    <c:choose>
      <c:when test="${empty greeting}">
        <p>Greeting is empty.</p>
      </c:when>
      <c:otherwise>
        <p>Greeting is not empty.</p>
      </c:otherwise>
    </c:choose>
  </body>
</html>
