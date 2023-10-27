<%-- Document : RegistrationPage Created on : 25-Oct-2023, 4:03:42 pm Author :
DELL --%> <%@page import = "java.sql.DriverManager"%> 
<%@page import ="java.sql.PreparedStatement"%> 
<%@page import = "java.sql.ResultSet"%> 
<%@page import = "java.sql.SQLException"%> 
<%@page import = "java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />

        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css"
            rel="stylesheet"
            />
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css"
            integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw=="
            crossorigin="anonymous"
            referrerpolicy="no-referrer"
            />
        <title>Document</title>

        <style>
            * {
                margin: 0;
                padding: 0;
                box-sizing: border-box;
                font-family: "Poppins", sans-serif;
            }
            body {
                min-height: 100vh;
                display: flex;
                align-items: center;
                justify-content: center;
                background: grey;
            }
            .wrapper {
                position: relative;
                max-width: 430px;
                width: 100%;
                background: #fff;
                padding: 34px;
                border-radius: 6px;
                box-shadow: 0 5px 10px rgba(0, 0, 0, 0.2);
            }
            .wrapper h2 {
                position: relative;
                font-size: 22px;
                font-weight: 600;
                color: #333;
            }
            .wrapper form {
                margin-top: 30px;
            }
            .wrapper form .input-box {
                height: 52px;
                margin: 18px 0;
            }
            form .input-box input {
                height: 100%;
                width: 100%;
                padding: 0 15px;
                font-size: 17px;
                font-weight: 400;
                color: #333;
                border: 1.5px solid #c7bebe;
                border-bottom-width: 2.5px;
                border-radius: 6px;
            }
            #btn {
                height: 100%;
                width: 100%;
                padding: 0 15px;
                font-size: 17px;
                font-weight: 400;
                color: #333;
                border: 1.5px solid #c7bebe;
                border-bottom-width: 2.5px;
                border-radius: 6px;
            }
            form h3 {
                color: #707070;
                font-size: 14px;
                font-weight: 500;
                margin-left: 10px;
            }
            .input-box.button input {
                color: #fff;
                border: none;
                background: #4070f4;
            }
            .input-box.button input:hover {
                background: #0e4bf1;
            }
            form .text h3 {
                color: #333;
                width: 100%;
                text-align: center;
            }
            form .text h3 a {
                color: #4070f4;
                text-decoration: none;
            }
            form .text h3 a:hover {
                text-decoration: underline;
            }
        </style>
    </head>
    <body>
        <div class="wrapper">
            <h2>Registration</h2>

            <form action="" onsubmit="return validate()">
                <div class="input-box">
                    <input
                        onkeyup="usernamevalidate()"
                        id="username"
                        type="text"
                        placeholder="Enter your name"
                        name="name"
                        />
                </div>
                <div id="udisplay"></div>
                <div class="input-box">
                    <input
                        onkeyup="fathervalidate()"
                        id="father"
                        type="text"
                        placeholder="Enter your Father Name"
                        name="fname"
                        />
                </div>
                <div id="fdisplay"></div>
                <div class="input-box">
                    <input
                        onkeyup="mobilevalidate()"
                        id="mobile"
                        type="text"
                        placeholder="Enter your Mobile"
                        maxlength="10"
                        name="mobile"
                        />
                </div>
                <div id="mdisplay"></div>
                <div class="input-box">
                    <input
                        onkeyup="emailvalidate()"
                        id="email"
                        type="email"
                        placeholder="Enter your email"
                        name="gmail"
                        />
                </div>
                <div id="edisplay"></div>
                <div class="input-box">
                    <input
                        onkeyup="passvalidate()"
                        id="pass"
                        type="password"
                        placeholder="Create password"
                        name="password"
                        />
                </div>
                <div id="pdisplay"></div>
                <div class="input-box">
                    <input

                        onclick="cpassvalidate()"
                        id="cpass"
                        type="password"
                        placeholder="Confirm password"
                        name="cpassword"
                        />
                </div>
                <div id="cpdisplay"></div>
                <div class="input-box button">
                    <input type="Submit" value="Register Now" />
                    <!--<button id="btn" type="button" onclick="validateName()"> Submit                                 </button>-->
                </div>
                <div class="text">
                    <h3>
                        Already have an account? <a href="LoginPage.jsp">Login now</a>
                    </h3>
                </div>
            </form>
        </div>
        <script>
            //        --------------------------------------------
            function validate() {
                var username = usernamevalidate();
                var father = fathervalidate();
                var mobile = mobilevalidate();
                var email = emailvalidate();
                var pass = passvalidate();
//                var cpass = cpassvalidate();
                var passmatch = PassMatch();

                if (!username || !father || !mobile || !email || !pass || !cpa || !passmatch) {
                    return false;
                }
            }
            function usernamevalidate() {
                var username = document.getElementById("username");
                var udisplay = document.getElementById("udisplay");
                if (username.value.trim() === "") {
                    udisplay.innerHTML = "Username Required";
                    udisplay.style.color = "red";
                    return false;
                } else {
                    var reg = /^[A-Z  a-z_]+$/;
                    if (reg.test(username.value)) {
                        udisplay.innerHTML = "";
                        return true;
                    } else {
                        udisplay.innerHTML = "Invalid Name";
                        return false;
                    }
                }
            }
            function fathervalidate() {
                var father = document.getElementById("father");
                var fdisplay = document.getElementById("fdisplay");
                if (father.value.trim() === "") {
                    fdisplay.innerHTML = "Father name Required";
                    fdisplay.style.color = "red";
                    return false;
                } else {
                    var reg = /^[A-Z  a-z]+$/;
                    if (reg.test(father.value)) {
                        fdisplay.innerHTML = "";
                        return true;
                    } else {
                        fdisplay.innerHTML = "Invalid Father Name";
                        return false;
                    }
                }
            }
            function mobilevalidate() {
                var mobile = document.getElementById("mobile");
                var mdisplay = document.getElementById("mdisplay");
                if (mobile.value.trim() === "") {
                    mdisplay.innerHTML = "Mobile Number Required";
                    mdisplay.style.color = "red";
                    return false;
                } else {
//                    var reg = /^[0-9]+$/;
                    var reg = /^\d{10}$/;
                    if (reg.test(mobile.value)) {
                        mdisplay.innerHTML = "";
                        return true;
                    } else {
                        mdisplay.innerHTML = "Invalid Mobile Number";
                        return false;
                    }
                }
            }
            function emailvalidate() {
                var email = document.getElementById("email");
                var edisplay = document.getElementById("edisplay");
                if (email.value.trim() === "") {
                    edisplay.innerHTML = "Email Id Required";
                    edisplay.style.color = "red";
                    return false;
                } else {
                    // var reg = /^[a-z]+$/;
                    var reg = /^[a-z0-9.]+@[a-z0-9.]+\.[a-z]{2,4}$/;
                    if (reg.test(email.value)) {
                        edisplay.innerHTML = "";
                        return true;
                    } else {
                        edisplay.innerHTML = "Invalid Email id";
                        return false;
                    }
                }
            }
            function passvalidate() {
                var pass = document.getElementById("pass");
                var pdisplay = document.getElementById("pdisplay");
                if (pass.value.trim() === "") {
                    pdisplay.innerHTML = "Password Required";
                    pdisplay.style.color = "red";
                    return false;
                } else {
                    pdisplay.innerHTML = "";
                    return true;
                }
            }

// ---------------------------------------
            function cpassValidate() {
                var pass = document.getElementById("pass").value;
                var cpass = document.getElementById("cpass").value;
                var cpdisplay = document.getElementById("cpdisplay");

                if (cpass.trim() === "") {
                    cpdisplay.innerHTML = "Password Required";
                    cpdisplay.style.color = "red";
                    return false;
                } else {
                    cpdisplay.innerHTML = "";
                    return true;
                }
            }
// ---------------------------------------
        </script>
        <!--    </body>-->
        <!--</html>-->
        <% 
            if(request.getParameter("name")!=null) 
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String path ="jdbc:mysql://localhost:3306/Infojava"; 
                String idpass = "root"; String sql ="INSERT INTO servlet (name,fname,gmail,mobile,password) values(?,?,?,?,?)"; 
                try(Connection con = DriverManager.getConnection(path, idpass, idpass)) 
                {
                    PreparedStatement ps = con.prepareStatement(sql); 
                    ps.setString(1,request.getParameter("name"));
                    ps.setString(2, request.getParameter("fname"));
                    ps.setString(3, request.getParameter("gmail"));
                    ps.setString(4,request.getParameter("mobile")); 
                    ps.setString(5, request.getParameter("password"));
                    try { 
                        if (ps.executeUpdate() > 0) 
                        {
                            response.sendRedirect(request.getContextPath() + "/LoginPage.jsp"); 
                        } else {
                            response.sendRedirect(request.getContextPath() + "/RegistrationPage.jsp");
                        } 
                    }
                    catch (SQLException e) 
                    {
                        response.sendRedirect(request.getContextPath() + "/RegistrationPage.jsp"); 
        %>
        <script>
            function PassMatch() {
                var pass = document.getElementById("pass").value;
                var cpass = document.getElementById("cpass").value;
                if (cpass === pass) {
                    cpdisplay.innerHTML = "";
                    return true;
                } else {
                    cpdisplay.innerHTML = "Passwords do not match";
                    cpdisplay.style.color = "red";
                    return false;
                }
            }
        </script>
        <%
                    }
                }  
            } 
        %>
    </body>
</html>