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
public class Dashbord extends HttpServlet {

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
            out.print("            <!DOCTYPE html>");
            out.print("<html lang='en' dir='ltr'>");
            out.print("  <head>");
            out.print("    <meta charset='utf-8' />");
            out.print("    <title>Responsive Navbar | CodingNepal</title>");
            out.print("    <meta name='viewport' content='width=device-width, initial-scale=1.0' />");
            out.print("");
            out.print("    <link");
            out.print("      rel='stylesheet'");
            out.print("      href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css'");
            out.print("    />");
            out.print("    <style>");
            out.print("      * {");
            out.print("        padding: 0;");
            out.print("        margin: 0;");
            out.print("        text-decoration: none;");
            out.print("      }");
            out.print("      body {");
            out.print("        font-family: montserrat;");
            out.print("      }");
            out.print("      nav {");
            out.print("        background:black; ");
            out.println("  color: black;");
            out.print("        height: 60px;");
            out.print("        width: 100%;");
            out.print("        display: flex;");
            out.print(" padding-left:20px; ");
            out.print("        justify-content: space-evenly;");
            out.print("        align-items: center;");
            out.print("      }");
            out.print("      label.logo {");
            out.print("        color: white;");
            out.print("        font-size: 25px;");
            out.print("      }");
            out.print("");
            out.print("      nav ul li {");
            out.print("        display: inline-block;");
            out.print("      }");
            out.print("      nav ul li a {");
            out.print("        color: white;");
            out.print("        font-size: 20px;");
            out.print("        margin-right: 100px;");
            out.print("      }");
            out.print("      nav ul li a:hover {");
            out.print("        color: black;");
            out.print("      }");
            out.print("");
            out.print("      #section_o {");
            out.print("        height: 500px;");
            out.print("        width: 100%;");
            out.print("        display: flex;");
            out.print("        justify-content: space-evenly;");
            out.print("        align-items: center;");
            out.print("      }");
            out.print("      #section_one,");
            out.print("      #section_two,");
            out.print("      #section_three {");
            out.print("        height: 400px;");
            out.print("        width: 33%;");
             out.print("margin-top:20px;");
              
            out.print("        background-color: lightblue;");
            out.print("      }");
            out.print("      footer {");
            out.print("        bottom: 0px;");
            out.print("        width: 100%;");
//            out.print("        background: white;");
            out.print("        display: flex;");
            out.print("        background-color: lightgrey;");
            out.print("        justify-content: center;");
            out.print("        justify-content: space-evenly;");
            out.print("      }");
            out.print("      .main-content {");
            out.print("        display: flex;");
            out.print("      }");
            out.print("      .main-content .box {");
            out.print("        flex-basis: 50%;");
            out.print("        padding: 20px;");
            out.print("      }");
            out.print("      .box h2 {");
            out.print("        font-size: 1.125rem;");
            out.print("        font-weight: 600;");
            out.print("      }");
            out.print("      .box .content {");
            out.print("        margin: 20px;");
            out.print("        position: relative;");
            out.print("      }");
            out.print("      .box .content:before {");
            out.print("        position: absolute;");
            out.print("        content: '';");
            out.print("        top: -10px;");
            out.print("        height: 2px;");
            out.print("        width: 100%;");
            out.print("        background: #1a1a1a;");
            out.print("      }");
            out.print("      .box .content:after {");
            out.print("        position: absolute;");
            out.print("      }");
            out.print("");
            out.print("      .left .content .social {");
            out.print("        margin: 20px;");
            out.print("      }");
            out.print("");
            out.print("      .left .content .social a span {");
            out.print("        height: 40px;");
            out.print("        width: 40px;");
            out.print("        background: #1a1a1a;");
            out.print("        line-height: 40px;");
            out.print("        text-align: center;");
            out.print("        border-radius: 5px;");
            out.print("      }");
            out.print("      .left .content .social a span:hover {");
            out.print("        background: #f12020;");
            out.print("      }");
            out.print("      .center .content .fas {");
            out.print("        font-size: 1.4375rem;");
            out.print("        background: #1a1a1a;");
            out.print("        height: 45px;");
            out.print("        width: 45px;");
            out.print("         color: white;");
            out.print("        line-height: 45px;");
            out.print("        text-align: center;");
            out.print("        border-radius: 50%;");
            out.print("      }");
            out.print("      .center .content .fas:hover {");
            out.print("        background: #f12020;");
            out.print("      }");
            out.print("      .center .content .text {");
            out.print("        font-size: 1.0625rem;");
            out.print("        font-weight: 500;");
            out.print("        padding-left: 10px;");
            out.print("      }");
            out.print("      .center .content .phone {");
            out.print("        margin: 15px 0;");
            out.print("      }");
            out.print("      .right form .text {");
            out.print("        font-size: 1.0625rem;");
            out.print("        margin-bottom: 2px;");
            out.print("        color: #656565;");
            out.print("      }");
            out.print("      .right form .msg {");
            out.print("        margin-top: 10px;");
            out.print("      }");
            out.print("      .right form input,");
            out.print("      .right form textarea {");
            out.print("        width: 100%;");
            out.print("        font-size: 1.0625rem;");
            out.print("        padding-left: 10px;");
            out.print("        border: 1px solid #222222;");
            out.print("      }");
            out.print("      .right form input:focus,");
            out.print("      .right form textarea:focus {");
            out.print("        outline-color: #3498db;");
            out.print("      }");
            out.print("      .right form input {");
            out.print("        height: 35px;");
            out.print("      }");
            out.print("      .right form .btn {");
            out.print("        margin-top: 10px;");
            out.print("      }");
            out.print("      .right form .btn button {");
            out.print("        height: 40px;");
            out.print("        width: 100%;");
             out.print("        color:white;");
            out.print("        background:black;");
            out.print("        font-size: 1.0625rem;");
            out.print("      }");
            out.print("      .right form .btn button:hover {");
            out.print("        background: white;");
            out.print("      }");
            out.print("      .bottom center {");
            out.print("        padding: 5px;");
            out.print("        font-size: 0.9375rem;");
            out.print("        background: #151515;");
            out.print("      }");
            out.print("      .bottom center span {");
            out.print("        color: #656565;");
            out.print("      }");
            out.print("#email,#sms{ color: white;}");

            out.print("      .bottom center a {");
            out.print("        color: #f12020;");
            out.print("        text-decoration: none;");
            out.print("      }");
            out.println("}>");
            out.print("    </style>");
            out.print("  </head>");
            out.print("  <body>");
            out.print("    <nav>");
            out.print("      <label class='logo'>Welcome To DashBoard</label>");
             out.print("    </nav>");
            out.println("<div class='li'>");
            out.print("      <ul style='background-color:lightblue; padding-left:50px; text-decoration:none'>");
            out.print("        <li><a href='#'style='position:absolute; top:100px;color:black;'>Home</a></li>");
            out.print(" <li><a href='#'style='position:absolute; top:100px;padding-left:80px; color:black; '>About</a></li>");
            out.print("        <li><a href='#'style='position:absolute; top:100px;padding-left:180px;color:black;'>Services</a></li>");
            out.print("        <li><a href='#'style='position:absolute; top:100px;padding-left:300px; color:black;'>Contact</a></li>");
            out.print("        <li><a href='#'style='position:absolute; top:100px;padding-left:400px; color:black;'>Logout</a></li>");
            out.print("      </ul>");
            out.println("</div>");
           
            out.print("    <section id='section_o'>");
            out.print("      <div id='section_one'>nhjdtydfsio</div>");
            out.print("      <div id='section_two'>mdjbdha</div>");
            out.print("      <div id='section_three'>knhjvdkahd</div>");
            out.print("    </section>");
            out.print("    <footer>");
            out.print("      <div class='main-content'>");
            out.print("        <div class='left box'>");
            out.print("          <h2>About us</h2>");
            out.print("          <div class='content'>");
            out.print("            <p>");
            out.print("              Lorem, ipsum dolor sit amet consectetur adipisicing elit.");
            out.print("              Obcaecati eius autem repellat impedit vero inventore illo harum");
            out.print("              distinctio voluptatum soluta.");
            out.print("            </p>");
            out.print("            <div class='social'>");
            out.print("              <a href='https://facebook.com/coding.np'>");
            out.print("                <span class='fab fa-facebook-f'> </span>");
            out.print("              </a>");
            out.print("              <a href='#'><span class='fab fa-twitter'></span></a>");
            out.print("              <a href='https://instagram.com/coding.np'>");
            out.print("                <span class='fab fa-instagram'></span>");
            out.print("              </a>");
            out.print("              <a href='https://youtube.com/c/codingnepal'>");
            out.print("                <span class='fab fa-youtube'></span>");
            out.print("              </a>");
            out.print("            </div>");
            out.print("          </div>");
            out.print("        </div>");
            out.print("        <div class='center box'>");
            out.print("          <h2>Address</h2>");
            out.print("          <div class='content'>");
            out.print("            <div class='place'>");
            out.print("              <span class='fas fa-map-marker-alt'></span>");
            out.print("              <span class='text'>Indrapuri colony Bhawarkua,Indore, Indore</span>");
            out.print("            </div>");
            out.print("            <div class='phone'>");
            out.print("              <span class='fas fa-phone-alt'></span>");
            out.print("              <span class='text'>+91-7863798132</span>");
            out.print("            </div>");
            out.print("            <div class='email'>");
            out.print("              <span class='fas fa-envelope'></span>");
            out.print("              <span class='text'>Soniyakardam@gmai.com</span>");
            out.print("            </div>");
            out.print("          </div>");
            out.print("        </div>");
            out.print("        <div class='right box'>");
            out.print("          <h2>Contact us</h2>");
            out.print("          <div class='content'>");
            out.print("            <form action='#'>");
            out.print("              <div id= 'email' class='email'>");
            out.print("                <div class='text'>Email</div>");
            out.print("                <input type='email' required />");
            out.print("              </div>");
            out.print("              <div class='msg'>");
            out.print("                <div id ='sms' class='text'>Message</div>");
            out.print("                <textarea rows='2' cols='25' required></textarea>");
            out.print("              </div>");
            out.print("              <div class='btn'>");
            out.print("                <button type='submit'>Send</button>");
            out.print("              </div>");
            out.print("            </form>");
            out.print("          </div>");
            out.print("        </div>");
            out.print("      </div>");
            out.print("    </footer>");
            out.print("    <div class='bottom'>");
            out.print("      <center>");
            out.print("        <span class='credit'>");
            out.print("          Created By <a href='https://www.codingnepalweb.com'>Soniya Kardam</a> ");
            out.print("        </span>");
            out.print("        <span class='far fa-copyright'></span>");
            out.print("        <span> 2020 All rights reserved.</span>");
            out.print("      </center>");
            out.print("    </div>");
            out.print("  </body>");
            out.print("</html>");
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
