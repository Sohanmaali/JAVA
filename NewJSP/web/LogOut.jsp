<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    session.setAttribute("rs", null);
    session.invalidate();
    response.sendRedirect(request.getContextPath() + "/index.jsp");
%>
