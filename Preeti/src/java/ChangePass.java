/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author DELL
 */
public class ChangePass extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("""
                        <!DOCTYPE html>
                        <html lang="en">
                          <head>
                            <meta charset="UTF-8" />
                            <meta name="viewport" content="width=device-width, initial-scale=1.0" />
                            <title>ChangePass</title>
                            <style>
                              * {
                                margin: 0;
                              }
                              body {
                                background-color: #e8f5ff;
                                font-family: Arial;
                                overflow: hidden;
                              }
                              .navbar-top {
                                background-color: #fff;
                                color: #333;
                                box-shadow: 0px 4px 8px 0px grey;
                                height: 70px;
                              }
                              .title {
                                font-family: "Dancing Script", cursive;
                                padding-top: 15px;
                                position: absolute;
                                left: 45%;
                              }
                              .navbar-top ul {
                                float: right;
                                list-style-type: none;
                                padding: 18px 50px 0 40px;
                              }
                              .navbar-top ul li {
                                float: left;
                              }
                              .navbar-top ul li a {
                                color: #333;
                                padding: 14px 16px;
                              }
                              .main {
                                margin-top: 2%;
                                margin-left: 22%;
                                font-size: 28px;
                                padding: 0 10px;
                                width: 58%;
                              }
                              .main h2 {
                                color: #333;
                                font-size: 24px;
                                margin-bottom: 10px;
                              }
                              .main .card {
                                background-color: #fff;
                                border-radius: 18px;
                                box-shadow: 1px 1px 8px 0 grey;
                                margin-bottom: 20px;
                                padding: 20px 0 20px 50px;
                              }
                              .main .card table {
                                border: none;
                                font-size: 16px;
                                height: 270px;
                                width: 80%;
                              }
                              #editbtn {
                                width: 80px;
                                height: 25px;
                                border-radius: 20px;
                                background-color: antiquewhite;
                                font-size: 18px;
                              }
                              #editbtn:hover {
                                background-color: grey;
                              }
                              #back {
                                text-decoration: none;
                                /* align-items: center; */
                              }
                              #back i {
                                font-size: 30px;
                                width: 50px;
                              }
                            </style>
                            <link
                              rel="stylesheet"
                              href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css"
                              integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw=="
                              crossorigin="anonymous"
                              referrerpolicy="no-referrer"
                            />
                          </head>
                          <body>
                            <!-- Navbar top -->
                            <div class="navbar-top">
                              <ul>
                                <li>
                                  <a href="#sign-out">
                                    <i class="fa fa-sign-out-alt fa-2x"></i>
                                  </a>
                                </li>
                              </ul>
                            </div>
                            <div class="main">
                              <h2>My Profile</h2>
                              <div class="card">
                                <div class="card-body">
                                  <form action="">
                                    <table>
                                      <tbody>
                                        <tr>
                                          <td>Old Password</td>
                                          <td>:</td>
                                          <td><input type="text" value="" name="oldpass" /></td>
                                        </tr>
                                        <tr>
                                          <td>New Password</td>
                                          <td>:</td>
                                          <td><input type="text" value="" name="newpass" /></td>
                                        </tr>
                                        <tr>
                                          <td>Conform Password</td>
                                          <td>:</td>
                                          <td>
                                            <input type="password" value="" name="cpassword" />
                                          </td>
                                        </tr>
                                        <tr>
                                          <td>
                                            <a id="back" href="#">
                                              <i class="fa-solid fa-arrow-left"></i>
                                            </a>
                                          </td>
                                          <td>
                                            <button id="editbtn">Save</button>
                                          </td>
                                        </tr>
                                      </tbody>
                                    </table>
                                  </form>
                                </div>
                              </div>
                            </div>
                          </body>
                        </html>""");
           
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
