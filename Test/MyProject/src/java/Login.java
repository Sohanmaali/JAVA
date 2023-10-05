/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Hp
 */
public class Login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
          out.println(" <html>");
   out.println("  <head>");
       out.println("  <title>Login Page</title>");
        out.println(" <meta charset='UTF-8'>");
        out.println(" <meta name='viewport' content='width=device-width, initial-scale=1.0'>");
    out.println(" </head>");
   out.println("  <body>");
    out.println("     <!--        <div>TODO write content</div>-->");
    out.println(" <center>");
     out.println("    <form action='LoginTask' style='border: 2px solid black; height:300px; width:400px; background-color:lightblue; margin-top:30px;'>");
//        out.println("<form style='border:2px solid black; height:300px; width:400px; background-color:lightblue; margin-top:30px;'>");
       out.println("      <center> <h1> Login Here</center>");
         out.println("       User :  <input type='email' name='email' placeholder='Enter User Name'style='margin-left:20px;margin-top:10px; text-align:center;'><br><br>");
         out.println("    Password :  <input type='password' name='password' placeholder='Enter User Password' style='margin-top:10px; text-align:center;'><br><br>");
          out.println("   <center><input type='submit' value='Login' style='height:25px; width:80px; background-color:Black;color:white;margin-left:20px; margin-top:10px;'></center><br><br>");
          out.println("   <a href='Registration' style='height:60px; width:200px; background-color:Black; color:white; margin-left:20px; text-decoration:none;padding:6px; text-align:center;'>Register Here</a>");
        out.println(" </form>");
     out.println("</center>");
   out.println("  </body>");
 out.println("</html>");

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
