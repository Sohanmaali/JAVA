package jdbcConnect;

import java.sql.Connection;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class DataStore extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
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

//                if (!request.getParameter("password").equals(request.getParameter("cpassword"))) {
//                    RegistrationPage.processRequest(request, response, 2);
////                    return;
//                }
                try {
                    if (ps.executeUpdate() > 0) {
                        response.sendRedirect(request.getContextPath() + "/LoginPage");
                    } else {
                        response.sendRedirect(request.getContextPath() + "/RegistrationPage");
                    }
                } catch (SQLException e) {
                    //if we get error thrn catch block is exceute
                    System.out.println(e);
                    response.setStatus(23);
                    System.out.println("////////////////////////////////////");
                    response.sendError(0);
                    System.out.println("////////////////////////////////////");
                    response.sendRedirect(request.getContextPath() + "/RegistrationPage");
                }
            }
        }
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

//public class MyServlet extends HttpServlet {
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        // Some logic to detect an error condition
//        boolean isError = true;
//
//        if (isError) {
//            // Sending a 404 (Not Found) status code with a custom error message
//            response.sendError(HttpServletResponse.SC_NOT_FOUND, "Resource not found");
//        } else {
//            // Normal processing
//            response.getWriter().write("Request processed successfully");
//               }
//
//    
//
//    }
//}
