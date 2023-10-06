package jdbcConnect;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UpdateData extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con;
            String path = "jdbc:mysql://localhost:3306/Infojava";
            String sql = "";
            HttpSession session = request.getSession();
            ResultSet rs = (ResultSet) session.getAttribute("rs");
            String idpass = "root";
            try {
                con = DriverManager.getConnection(path, idpass, idpass);
                PreparedStatement ps = null;
                if (request.getParameter("saveButton1") != null) {

                    if (!request.getParameter("name").isEmpty()) {
                        sql = "UPDATE servlet SET name =  ? WHERE  gmail =  ? ";
                        ps = con.prepareStatement(sql);
                        ps.setString(1, request.getParameter("name"));
                        ps.setString(2, rs.getString("gmail"));
                    }

                } else if (request.getParameter("saveButton2") != null) {

                    if (!request.getParameter("fname").isEmpty()) {
                        sql = "UPDATE servlet SET fname =  ? WHERE  gmail =  ?";
                        ps = con.prepareStatement(sql);
                        ps.setString(1, request.getParameter("fname"));
                        ps.setString(2, rs.getString("gmail"));
                    }

                } else if (request.getParameter("saveButton3") != null) {

                    if (!request.getParameter("gmail").isEmpty()) {
                        sql = "UPDATE servlet SET gmail =  ? WHERE  gmail =  ?";
                        ps = con.prepareStatement(sql);
                        ps.setString(1, request.getParameter("gmail"));
                        ps.setString(2, rs.getString("gmail"));
                    }
//                    System.out.print(rs.getString("gmail") + "<br>");
                } else if (request.getParameter("saveButton4") != null) {

                    if (!request.getParameter("mobile").isEmpty()) {
                        sql = "UPDATE servlet SET mobile =  ? WHERE  gmail =  ?";
                        ps = con.prepareStatement(sql);
                        ps.setString(1, request.getParameter("mobile"));
                        ps.setString(2, rs.getString("gmail"));
                    }

                } else if (request.getParameter("saveButton5") != null) {
                    if (!request.getParameter("password").isEmpty()) {
                        sql = "UPDATE servlet SET password =  ? WHERE  gmail =  ?";
                        ps = con.prepareStatement(sql);
                        ps.setString(1, request.getParameter("password"));
                        ps.setString(2, rs.getString("gmail"));
                    }
                }
                if (ps.executeUpdate() > 0) {
                    //Object datasave = 1;
                    session.setAttribute("sms", 1);
                    response.sendRedirect(request.getContextPath() + "/Profile");

                } else {
//                    Profile.processRequest(request, response, 1);
                    response.sendRedirect(request.getContextPath() + "/LoginPage");
                }
            } catch (SQLException e) {

                out.println(e);
                out.println("***************");
                out.println(e);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
