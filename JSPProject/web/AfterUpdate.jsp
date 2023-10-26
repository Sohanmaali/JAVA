<%-- 
    Document   : AfterUpdate
    Created on : 26-Oct-2023, 10:02:44 am
    Author     : DELL
--%>
<%@page import = "java.sql.DriverManager"%>
<%@page import =  "java.sql.PreparedStatement"%>
<%@page import =  "java.sql.ResultSet"%>
<%@page import =  "java.sql.SQLException"%>
<%@page import =  "java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
       Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con;
             String path = "jdbc:mysql://localhost:3306/Infojava";
            String idpass = "root";
            String sql = "SELECT * FROM servlet WHERE gmail = ? and password = ?";

            try {
                con = DriverManager.getConnection(path, idpass, idpass);
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, session.getAttribute("email"));
                ps.setString(2, session.getAttribute("password"));
                ResultSet rs = ps.executeQuery();
                System.out.print("--------------------------");
                       System.out.print(session.getAttribute("password"));
                     System.out.print("--------------------------");
                if (rs.next()) {
//                    HttpSession session = request.getSession();
                    session.setAttribute("rs", rs);
                     System.out.print("--------------------------");
                       System.out.print(session.getAttribute("password"));
                     System.out.print("--------------------------");
                    response.sendRedirect(request.getContextPath() + "/DashBoard.jsp");
                } else {
                                   }
            } catch (SQLException e) {
               
                System.out.print(e);
            }
%>
