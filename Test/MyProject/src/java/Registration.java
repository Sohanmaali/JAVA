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
public class Registration extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           out.println("<html>");
  out.println(" <head>");
       out.println(" <title>TODO supply a title</title>");
       out.println(" <meta charset='UTF-8'>");
       out.println(" <meta name='viewport' content=width=device-width, initial-scale=1.0'>");
    out.println("</head>");
   out.println(" <body>");
   out.println(" <center>");
       out.println(" <form action='RegistrationTask' style='border: 2px solid black; background-color:lightblue'>");
         out.println("   <h1>Registration Form</h1>");
           out.println(" Name  : <input type='text' name='name' placeholder='Enter Name'style='margin-left:55px;'><br><br>");
           out.println(" FName  : <input type='text' name='fname'placeholder='Enter Father Name'style='margin-left:55px;'><br><br>");
          out.println("  Mobile : <input type='tel name='mob' placeholder='Enter Mobile number' style='margin-left:55px;'><br><br>");
          out.println("  Email :  <input type='email' name='email' placeholder='Enter Your Emailr' style='margin-left:55px;'><br><br>");
           out.println(" Password : <input type='password' name='pass' placeholder='Enter Secure Password' style='margin-left:40px;'><br><br>");
           out.println(" Confirm Password :<input type='password' name='Cpass' placeholder=' Re-Enter Password '><br><br>");
          out.println("  <center><input type='Submit' value='Submit' style='height:25px; width:80px; background-color:Black;color:white;margin-left:20px; margin-top:10px;'></center><br><br>");
    out.println(" </form>");
    out.println("</center>");
   out.println(" </body>");
out.println("</html>");

        }
    }

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
