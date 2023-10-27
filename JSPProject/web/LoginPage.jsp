<%-- 
    Document   : LoginPage
    Created on : 25-Oct-2023, 2:03:10 pm
    Author     : DELL
--%>

<%@page import = "java.sql.DriverManager"%>
<%@page import =  "java.sql.PreparedStatement"%>
<%@page import =  "java.sql.ResultSet"%>
<%@page import =  "java.sql.SQLException"%>
<%@page import =  "java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login Page</title>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <style>
            * {
                margin: 0;
                padding: 0;
                box-sizing: border-box;
                font-family: "Poppins", sans-serif;
            }
            body {
                min-height: 100vh;
                width: 100%;
                background: #009579;
            }
            .container {
                position: absolute;
                top: 50%;
                left: 50%;
                transform: translate(-50%, -50%);
                max-width: 430px;
                width: 100%;
                background: #fff;
                border-radius: 7px;
                box-shadow: 0 5px 10px rgba(0, 0, 0, 0.3);
            }
            .container .registration {
                display: none;
            }
            #check:checked ~ .registration {
                display: block;
            }
            #check:checked ~ .login {
                display: none;
            }
            #check {
                display: none;
            }
            .container .form {
                padding: 2rem;
            }
            .form header {
                font-size: 2rem;
                font-weight: 500;
                text-align: center;
                margin-bottom: 1.5rem;
            }
            .form input {
                height: 60px;
                width: 100%;
                padding: 0 15px;
                font-size: 17px;
                margin-bottom: 1.3rem;
                border: 1px solid #ddd;
                border-radius: 6px;
                outline: none;
            }
            .form input:focus {
                box-shadow: 0 1px 0 rgba(0, 0, 0, 0.2);
            }
            .form a {
                font-size: 16px;
                color: #009579;
                text-decoration: none;
            }
            .form a:hover {
                text-decoration: underline;
            }
            .form input.button {
                color: #fff;
                background: #009579;
                font-size: 1.2rem;
                font-weight: 500;
                letter-spacing: 1px;
                margin-top: 1.7rem;
                cursor: pointer;
                transition: 0.4s;
            }
            .form input.button:hover {
                background: #006653;
            }
            .signup {
                font-size: 17px;
                text-align: center;
            }
            .signup label {
                color: #009579;
                cursor: pointer;
            }
            .signup label:hover {
                text-decoration: underline;
            }
            label {
                display: block;
            }
            input:focus + label {
                display: none;
            }
        </style>
    </head>
    <body>
        <!DOCTYPE html>
    <html lang="en">
        <head>
            <meta charset="UTF-8" />
            <meta name="viewport" content="width=device-width, initial-scale=1.0" />
            <meta http-equiv="X-UA-Compatible" content="ie=edge" />
            <title>Login & Registration Form</title>
        </head>
        <body>
            <div class="container">
                <input type="checkbox" id="check" />
                <div class="login form">
                    <header>Login</header>
                    <form action="" onsubmit="return validateId()">
                        <input
                            type="text"
                            placeholder="Enter your email"
                            name="gmail"
                            id="inputField"
                            />
                        <input
                            type="password"
                            placeholder="Enter your password"
                            name="password"
                            id="inputField"
                            />
                        <a href="#">Forgot password?</a>
                        <input type="submit" class="button" value="Login" />
                        <div id="error" style="display: none"></div>
                    </form>
                    <div class="signup">
                        <span class="signup" > Don't have an account?
                            <a href="RegistrationPage.jsp">SignUp</a>
                        </span>
                    </div>
                </div>
            </div>
        </body>
    </html>
</body>
</html>
<%   
    if(request.getParameter("password")!=null && request.getParameter("password")!="")
    {
    Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con;
             String path = "jdbc:mysql://localhost:3306/Infojava";
            String idpass = "root";
            String sql = "SELECT * FROM servlet WHERE gmail = ? and password = ?";
            try {
                con = DriverManager.getConnection(path, idpass, idpass);
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, request.getParameter("gmail"));
                ps.setString(2, request.getParameter("password"));
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    session.setAttribute("rs", rs);
                    response.sendRedirect(request.getContextPath() + "/DashBoard.jsp");
                } else {
%>
<script>
    function validateId()
    {
        var error = document.getElementById("error");
        error.innerHTML = "Password Not Match";
        error.style.color = "red";
    }
</script>
<%
}
} catch (SQLException e) {
System.out.print(e);
}
}
%>