<%-- Document : RegistrationPage Created on : 25-Oct-2023, 4:03:42 pm Author :
DELL --%> <%@page import = "java.sql.DriverManager"%> <%@page import =
"java.sql.PreparedStatement"%> <%@page import = "java.sql.ResultSet"%> <%@page
import = "java.sql.SQLException"%> <%@page import = "java.sql.Connection"%>
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

      <form action="">
        <div class="input-box">
          <input
            onclick="checkname()"
            type="text"
            placeholder="Enter your name"
            required
            name="name"
          />
        </div>
        <div id="error-message"></div>
        <div class="input-box">
          <input
            type="text"
            placeholder="Enter your Father Name"
            required
            name="fname"
          />
        </div>
        <div class="input-box">
          <input type='text' placeholder='Enter your Mobile' maxlength="10"
          required" name='mobile' />
        </div>
        <div class="input-box">
          <input
            type="email"
            placeholder="Enter your email"
            required
            name="gmail"
          />
        </div>
        <div class="input-box">
          <input
            type="password"
            placeholder="Create password"
            required
            name="password"
          />
        </div>
        <div class="input-box">
          <input
            type="password"
            placeholder="Confirm password"
            required
            name="cpassword"
          />
        </div>
        <div class="input-box button">
           <input type="Submit" value="Register Now"  onclick="validateName()"/> 
          <!--<button id="btn" type="button" onclick="validateName()">-->
<!--            Submit
          </button>-->
        </div>
        <div class="text">
          <h3>
            Already have an account? <a href="LoginPage.jsp">Login now</a>
          </h3>
        </div>
      </form>
    </div>
    <script>
      function validateName() {
        var nameInput = document.getElementById("name");
        var errorMessage = document.getElementById("error-message");

        var namePattern = /^[A-Za-z\s]+$/;

        if (namePattern.test(nameInput.value)) {
          errorMessage.textContent = "";
          alert("Name is valid!");
        } else {
          errorMessage.textContent = "Please enter a valid name";
        }
      }
    </script>
  </body>
</html>
<% if(request.getParameter("name")!=null) {
Class.forName("com.mysql.cj.jdbc.Driver"); String path =
"jdbc:mysql://localhost:3306/Infojava"; String idpass = "root"; String sql =
"INSERT INTO servlet (name,fname,gmail,mobile,password) values(?,?,?,?,?)"; try
(Connection con = DriverManager.getConnection(path, idpass, idpass)) {
PreparedStatement ps = con.prepareStatement(sql); ps.setString(1,
request.getParameter("name")); ps.setString(2, request.getParameter("fname"));
ps.setString(3, request.getParameter("gmail")); ps.setString(4,
request.getParameter("mobile")); ps.setString(5,
request.getParameter("password")); try { if (ps.executeUpdate() > 0) {
response.sendRedirect(request.getContextPath() + "/LoginPage.jsp"); } else {
response.sendRedirect(request.getContextPath() + "/RegistrationPage.jsp"); } }
catch (SQLException e) { //if we get error thrn catch block is exceute
System.out.println(e); session.setAttribute("error", 1);
response.sendRedirect(request.getContextPath() + "/RegistrationPage.jsp"); } } }
%>
