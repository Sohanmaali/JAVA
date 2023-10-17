package jdbcConnect;

import jakarta.servlet.ServletContext;
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

public class UpdateData extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            HttpSession session = request.getSession();

            ResultSet rs = (ResultSet) session.getAttribute("rs");
            session.setAttribute("error", 100);
            System.out.println(request.getParameter("password"));
            System.out.println(request.getParameter("cpassword"));
            if (!request.getParameter("password").equals(request.getParameter("cpassword"))) {
                session.setAttribute("error", 2);
                response.sendRedirect(request.getContextPath() + "/EditProfile");
                return;
            }
            if (!checkMobileNumber(request.getParameter("mobile"))) {
                session.setAttribute("error", 3);
                response.sendRedirect(request.getContextPath() + "/EditProfile");
                return;
            }
            if (!checkName(request.getParameter("name"))) {
                session.setAttribute("error", 4);
                response.sendRedirect(request.getContextPath() + "/EditProfile");
                return;
            }
            if (!checkName(request.getParameter("fname"))) {
                session.setAttribute("error", 5);
                response.sendRedirect(request.getContextPath() + "/EditProfile");
                return;
            }
            ServletContext ctx = this.getServletContext();
            Class.forName(ctx.getInitParameter("driver"));
            Connection con;
            String sql;
            try {
                con = DriverManager.getConnection(ctx.getInitParameter("path"), ctx.getInitParameter("idpass"), ctx.getInitParameter("idpass"));
                PreparedStatement ps;

//                    if (!request.getParameter("name").isEmpty()) {
                sql = "UPDATE servlet SET name =  ?,fname =  ?,gmail =?, mobile =?, password =? WHERE  gmail =  ? ";
                ps = con.prepareStatement(sql);
                ps.setString(1, request.getParameter("name"));
                ps.setString(2, request.getParameter("fname"));
                ps.setString(3, request.getParameter("gmail"));
                ps.setString(4, request.getParameter("mobile"));
                ps.setString(5, request.getParameter("password"));
                ps.setString(6, rs.getString("gmail"));
//            }
                if (ps.executeUpdate() > 0) {

                    session.setAttribute("error", 100);
//                    response.sendRedirect(request.getContextPath() + "/Profile");
//                    response.sendRedirect(request.getContextPath() + "/LoginPage");

                    rs = getRSData(request, response);
                    session.setAttribute("rs", rs);
                    response.sendRedirect(request.getContextPath() + "/AfterUpdate");

                } else {
                    session.setAttribute("error", 100);
                    response.sendRedirect(request.getContextPath() + "/LoginPage");
                }
            } catch (SQLException e) {
                session.setAttribute("error", 100);
                out.println(e);
            }
        }
    }

    public ResultSet getRSData(HttpServletRequest request, HttpServletResponse response) throws IOException, ClassNotFoundException {
        ServletContext ctx = this.getServletContext();
        Class.forName(ctx.getInitParameter("driver"));
        Connection con;

        String sql = "SELECT * FROM servlet WHERE gmail = ?";
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection(ctx.getInitParameter("path"), ctx.getInitParameter("idpass"), ctx.getInitParameter("idpass"));
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, request.getParameter("gmail"));
            rs = ps.executeQuery();
            rs.next();
        } catch (SQLException e) {
            System.out.print(e);
        }
        return rs;
    }

    public static boolean checkMobileNumber(String mobileNumber) {
        if (mobileNumber.length() != 10) {
            return false;
        }
        for (int i = 0; i < mobileNumber.length(); i++) {
            try {
                int n = mobileNumber.charAt(i) - '0';
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }

    public boolean checkName(String name) {
        for (int i = 0; i < name.length(); i++) {
            if ((name.charAt(i) < 97 || name.charAt(i) > 122) && (name.charAt(i) < 67 || name.charAt(i) > 122)) {
                return false;
            }
        }
        return true;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            // Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
