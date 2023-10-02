package jdbcConnect;

import java.sql.Connection;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginPageData extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con;
            String path = "jdbc:mysql://localhost:3306/Infojava";
            String sql = "SELECT * FROM servlet WHERE gmail = ? and password = ?";

            String idpass = "root";
            try {
                con = DriverManager.getConnection(path, idpass, idpass);
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, request.getParameter("gmail"));
                ps.setString(2, request.getParameter("password"));
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
//                   response.sendRedirect("DashBoard.java");
//                    response.sendRedirect("https://example.com/dashboard");
//                    response.sendRedirect("DashBoard.java");
//                    response.sendRedirect("Servlet.DashBoard.java");
                    response.sendRedirect(request.getContextPath() + "/DashBoard");

                } else {
                    out.println("Login Fail");
                }
            } catch (SQLException e) {
                out.print(e);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginPageData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginPageData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
