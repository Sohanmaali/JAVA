package jdbcConnect;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginPage extends HttpServlet {

    public static void processRequest(HttpServletRequest request, HttpServletResponse response, int n)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.print("      <!DOCTYPE html>");
            out.print(" <html>");
            out.print("    <head>");
            out.print("        <title>TODO supply a title</title>");
            out.print("        <meta charset='UTF-8'>");
            out.print("        <meta name='viewport' content='width=device-width, initial-scale=1.0'>");
            out.print("        <style>");
            out.print("            *{");
            out.print("                margin: 0;");
            out.print("                padding: 0;");
            out.print("                box-sizing: border-box;");
            out.print("                font-family: 'Poppins', sans-serif;");
            out.print("            }");
            out.print("            body{");
            out.print("                min-height: 100vh;");
            out.print("                width: 100%;");
            out.print("                background: #009579;");
            out.print("            }");
            out.print("""
                       nav {
                                                      position: fixed;
                                                      top: 0;
                                                      left: 0;
                                                      width: 100%;
                                                      padding: 20px;
                                                    }
                                                    nav.sticky {
                                                      padding: 15px 20px;
                                                    }
                                                    nav .nav-content {
                                                      height: 10%;
                                              width: 100%;
                                                      display: flex;
                                                      align-items: center;
                                                      justify-content: space-between;
                                                    }
                                                    
                                                    nav.sticky .logo a {
                                                      color: white;
                                                    }
                                                    .nav-content .nav-links {
                                                      display: flex;
                                                    }
                                                    .nav-content .nav-links li {
                                                      list-style: none;
                                                      margin: 0 8px;
                       padding-left:185px;
                                                    }
                                                    .nav-links li a {
                                                      text-decoration: none;
                                                      color: white;
                                                      font-size: 18px;
                                                      font-weight: 500;
                                                      padding-left:5px;
                                                    }
                                                    .nav-links li a:hover {
                                                      color: black;
                                                    }
                                                    nav.sticky .nav-links li a {
                                                      color: #fff;
                                                    }
                                                    nav.sticky .nav-links li a:hover {
                                                      color: #0e2431;
                                                    }""");
            out.print("            .container{");
            out.print("                position: absolute;");
            out.print("                top: 50%;");
            out.print("                left: 50%;");
            out.print("                transform: translate(-50%,-50%);");
            out.print("                max-width: 430px;");
            out.print("                width: 100%;");
            out.print("                background: #fff;");
            out.print("                border-radius: 7px;");
            out.print("                box-shadow: 0 5px 10px rgba(0,0,0,0.3);");
            out.print("            }");
            out.print("            .container .registration{");
            out.print("                display: none;");
            out.print("            }");
            out.print("            #check:checked ~ .registration{");
            out.print("                display: block;");
            out.print("            }");
            out.print("            #check:checked ~ .login{");
            out.print("                display: none;");
            out.print("            }");
            out.print("            #check{");
            out.print("                display: none;");
            out.print("            }");
            out.print("            .container .form{");
            out.print("                padding: 2rem;");
            out.print("            }");
            out.print("            .form header{");
            out.print("                font-size: 2rem;");
            out.print("                font-weight: 500;");
            out.print("                text-align: center;");
            out.print("                margin-bottom: 1.5rem;");
            out.print("            }");
            out.print("            .form input{");
            out.print("                height: 60px;");
            out.print("                width: 100%;");
            out.print("                padding: 0 15px;");
            out.print("                font-size: 17px;");
            out.print("                margin-bottom: 1.3rem;");
            out.print("                border: 1px solid #ddd;");
            out.print("                border-radius: 6px;");
            out.print("                outline: none;");
            out.print("            }");
            out.print("            .form input:focus{");
            out.print("                box-shadow: 0 1px 0 rgba(0,0,0,0.2);");
            out.print("            }");
            out.print("            .form a{");
            out.print("                font-size: 16px;");
            out.print("                color: #009579;");
            out.print("                text-decoration: none;");
            out.print("            }");
            out.print("            .form a:hover{");
            out.print("                text-decoration: underline;");
            out.print("            }");
            out.print("            .form input.button{");
            out.print("                color: #fff;");
            out.print("                background: #009579;");
            out.print("                font-size: 1.2rem;");
            out.print("                font-weight: 500;");
            out.print("                letter-spacing: 1px;");
            out.print("                margin-top: 1.7rem;");
            out.print("                cursor: pointer;");
            out.print("                transition: 0.4s;");
            out.print("            }");
            out.print("            .form input.button:hover{");
            out.print("                background: #006653;");
            out.print("            }");
            out.print("            .signup{");
            out.print("                font-size: 17px;");
            out.print("                text-align: center;");
            out.print("            }");
            out.print("            .signup label{");
            out.print("                color: #009579;");
            out.print("                cursor: pointer;");
            out.print("            }");
            out.print("            .signup label:hover{");
            out.print("                text-decoration: underline;");
            out.print("            }");
            out.print("        </style>");
            out.print("    </head>");
            out.print("    <body>");
            out.print("        <!DOCTYPE html>");
            out.print("    <html lang='en'>");
            out.print("        <head>");
            out.print("            <meta charset='UTF-8'>");
            out.print("            <meta name='viewport' content='width=device-width, initial-scale=1.0'>");
            out.print("            <meta http-equiv='X-UA-Compatible' content='ie=edge'>");
            out.print("            <title>Login & Registration Form</title>");
            out.print("        </head>");
            out.print("        <body>");
            out.print("""
                      <nav>
                            <div class="nav-content">
                                <ul class="nav-links">
                                    <li><a href="WelComePage">Home</a></li>
                                    <li><a href="#">About</a></li>
                                    <li><a href="#">Skills</a></li>
                                    <li><a href="#">Services</a></li>
                                    <li><a href="#">Contact</a></li>
                                </ul>
                            </div>
                     </nav>""");

            out.print("            <div class='container'>");
            out.print("                <input type='checkbox' id='check'>");
            out.print("                <div class='login form'>");
            out.print("                    <header>Login</header>");
            out.print("                    <form action='LoginPageData'>");
            out.print("                        <input id='inputField' type='text' placeholder='Enter your email' name='gmail' required> ");
            out.print(
                    "                        <input id='inputField' type='password' placeholder='Enter your password' name='password' required>");
            out.print("                        <a href='#'>Forgot password?</a>");
//            -----------------------------------------------------------------
            if (n == 1) {
                out.print(" <br> <br> <label for='inputField'>Invalide Id Password </label>");
            }
//            -----------------------------------------------------------------
            out.print("                        <input type='submit' class='button' value='Login'>");
            out.print("                    </form>");
            out.print("                    <div class='signup'>");
            out.print("                        <span class='signup'>Don't have an account?       <a href='RegistrationPage'>SignUp</a>");
            out.print("                        </span>");
            out.print("                    </div>");
            out.print("                </div>");
            out.print("            </div>");
            out.print("        </body>");
            out.print("    </html>");
            out.print("</body>");
            out.print("</html>");

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response, 0);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response, 0);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
