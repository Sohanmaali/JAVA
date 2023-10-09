package jdbcConnect;

import java.sql.Connection;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class DataStore extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
//        System.out.println(checkName("wsed96FDfsadf"));
        try (PrintWriter out = response.getWriter()) {
            //----------------------------------
            HttpSession session = request.getSession();
//            session.setAttribute("error", 0);
            //----------------------------------
            if (!request.getParameter("password").equals(request.getParameter("cpassword"))) {
                session.setAttribute("error", 2);
                response.sendRedirect(request.getContextPath() + "/RegistrationPage");
                return;
            }
            if (!checkMobileNumber(request.getParameter("mobile"))) {
                session.setAttribute("error", 3);
                response.sendRedirect(request.getContextPath() + "/RegistrationPage");
                return;
            }
            if (!checkName(request.getParameter("name"))) {
                session.setAttribute("error", 4);
                response.sendRedirect(request.getContextPath() + "/RegistrationPage");
                return;
            }
            if (!checkName(request.getParameter("fname"))) {
                session.setAttribute("error", 5);
                response.sendRedirect(request.getContextPath() + "/RegistrationPage");
                return;
            }

            Class.forName("com.mysql.cj.jdbc.Driver");

            String path = "jdbc:mysql://localhost:3306/Infojava";
            String idpass = "root";

            String sql = "INSERT INTO servlet (name,fname,gmail,mobile,password) values(?,?,?,?,?)";
            try (Connection con = DriverManager.getConnection(path, idpass, idpass)) {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, request.getParameter("name"));
                ps.setString(2, request.getParameter("fname"));
                ps.setString(3, request.getParameter("gmail"));
                ps.setString(4, request.getParameter("mobile"));
                ps.setString(5, request.getParameter("password"));

                try {
                    if (ps.executeUpdate() > 0) {
                        response.sendRedirect(request.getContextPath() + "/LoginPage");
                    } else {
                        response.sendRedirect(request.getContextPath() + "/RegistrationPage");
                    }
                } catch (SQLException e) {
                    //if we get error thrn catch block is exceute
                    System.out.println(e);
                    session.setAttribute("error", 1);
                    response.sendRedirect(request.getContextPath() + "/RegistrationPage");
                }
            }
        }
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
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
