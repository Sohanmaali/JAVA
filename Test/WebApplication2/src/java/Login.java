
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Login</title>");
            out.println("<style>");
            out.println("table{");
            out.println("margin-top:2vh;");
            out.println("width:28vw;");
            out.println("border-radius:5px;");
            out.println("border: 2px solid gray;");
            out.println("border-spacing: 10px;");
            out.println("box-shadow:3px 3px 10px black;");
            out.println("background-color: lightgray;");
            out.println("font-size:18px;");
            out.println("}");
            out.println("h1{");
            out.println("margin-top:13vh;");
            out.println("color: gray;");
            out.println("text-shadow:2px 2px 7px gray;");
            out.println("}");
            out.println("#loginbtn{");
            out.println("width:22vw;");
            out.println("font-size:18px;");
            out.println("height:5vh;");
            out.println("background-color: darkgray;");
            out.println("color: ghostwhite;");
            out.println("border-radius:5px;");
            out.println("box-shadow:3px 3px 7px gray;");
            out.println("}");
            out.println("#loginbtn:hover{");
            out.println("background-color: dimgray;");
            out.println("border-radius:8px;");
            out.println("color: white;");
            out.println("}");
            out.println("input{");
            out.println("background-color: transparent;");
            out.println("border-radius:4px;");
            out.println("color: black;");
            out.println("border:1px solid black;");
            out.println("font-size: 18px;");
            out.println("}");
            out.println("td{");
            out.println("border-style:none;");
            out.println("}");
            out.println("</style>");
            out.println("</head>");

            out.println("<body>");
            out.println("<h1 align='center'>");
            out.println("Login Form");
            out.println("</h1>");
            out.println("<table border=1 cellspacing=0 align='center'>");
            out.println("<form>");
            out.println("<tr>");
            out.println("<td align='center' colspan=2 >");
            out.println("&nbsp;");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("Email :");
            out.println("</td>");
            out.println("<td>");
            out.println("<input type='email' name='email'>");
            out.println("</td>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<td>");
            out.println("Password :");
            out.println("</td>");
            out.println("<td>");
            out.println("<input type='password' name='password'>");
            out.println("</td>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<td align='center' colspan=2 >");
            out.println("&nbsp;");
            out.println("</td>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<td align='center' colspan=2 >");
            out.println("<input id='loginbtn' type='submit' value='LOGIN'>");
            out.println("</td>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<td align='center' colspan=2 >");
            out.println("<a href='Register'>new user?</a>");
            out.println("</td>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<td align='center' colspan=2 >");
            out.println("&nbsp;");
            out.println("</td>");
            out.println("</tr>");

            out.println("</form>");
            out.println("<table>");
            out.println("</body>");
            out.println("</html>");

            String email = request.getParameter("email");
            String password = request.getParameter("password");

            try {
//                Class.forName("com.mysql.cj.jdbc.Driver");
//                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webproject","root","root");
//                String sql="select * from registration where email=? and password=?";
//                PreparedStatement ps = con.prepareStatement(sql);
//                
//                ps.setString(1, email);
//                ps.setString(2, password);
//                
//                
//                ResultSet rs = ps.executeQuery();
//                
//                if(rs.next())
                {
                    System.out.print("Success");
                    response.sendRedirect("DashBoard");
                }
//                else
                {
                    response.sendRedirect("Login");
                }
            } catch (Exception e) {
                out.println(e);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
