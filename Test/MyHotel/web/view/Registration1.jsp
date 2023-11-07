<%-- 
    Document   : Registrationform
    Created on : 26-Oct-2023, 11:29:57 am
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import=" java.io.IOException"%>
<%@ page import=" java.io.PrintWriter"%>
<%@ page import=" jakarta.servlet.http.HttpSession"%>
<%@ page import=" java.sql.Connection"%>
<%@ page import=" java.sql.PreparedStatement"%>
<%@ page import=" java.sql.ResultSet"%>
<%@ page import=" java.sql.SQLException"%>

<!DOCTYPE html>
<html lang='en'>
    <head>
        <meta charset='UTF - 8' />
        <meta name='viewport' content='width=device-width, initial-scale=1.0' />
        <title>Registration Form</title>
        <script>
            function validate() {}
            function namevalidate()
            {
                var name1 = document.getElementById("name1");
                var udisplay = document.getElementById("udisplay");
                if (name1.value.trim() == "") {
                    udisplay.innerHTML = "Name Required";
                    udisplay.style.color = "red";
                    return false;
                } else {
                    var reg = /^[A-Z a-z]+$/;
                    if (reg.test(name1.value)) {
                        udisplay.innerHTML = "";
                        udisplay.style.color = "red";
                        return true;
                    } else {

                        udisplay.innerHTML = "Invalid Name";
                        udisplay.style.color = "PURPLE";
                        return false;
                    }
                     }
                    }
            function fnamevalidate()
            {
                var fname1 = document.getElementById("fname1");
                var fdisplay = document.getElementById("fdisplay");
                if (fname1.value.trim() == "") {
                    fdisplay.innerHTML = "Name Required";
                    fdisplay.style.color = "red";
                    return false;
                } else {
                    var reg = /^[A-Z a-z]+$/;
                    if (reg.test(fname1.value)) {
                        fdisplay.innerHTML = "";
                        fdisplay.style.color = "red";
                        return true;
                    } else {

                        fdisplay.innerHTML = "Invalid Name";
                        fdisplay.style.color = "PURPLE";
                        return false;
                    }
                     }
                    }

            function gvalidation()
            {
                var gvalidation = document.getElementById("gvalidation");
                var gdisplay = document.getElementById("gdisplay");
                if (gvalidation.value.trim() == "") {
                    gdisplay.innerHTML = "gmail Required";
                    gdisplay.style.color = "red";
                    return false;
                } else {
                    var reg = /^[0-9A-Za-z_]+@[a-z]+\.[a-z]{2,3}$/;
                    if (reg.test(gvalidation.value)) {

                        gdisplay.style.color = "red";
                        return true;
                    } else {

                        gdisplay.innerHTML = "Invalid Name";
                        gdisplay.style.color = "PURPLE";
                        return false;
                    }
                     }
                    }
            function psvalidate()
            {
                var psvalidation = document.getElementById("psvalidation");
                var pdisplay = document.getElementById("pdisplay");
                if (psvalidation.value.trim() == "") {
                    pdisplay.innerHTML = "Name Required";
                    pdisplay.style.color = "red";
                    return false;
                } else {
                    var reg = /^(?=.+?[0-9])(?=.+?[A-Z])(?=.+?[a-z])(?=.+?[~!@#$%^&*()_+]).{8,}$/;
                    if (reg.test(psvalidation.value)) {

                        pdisplay.style.color = "red";
                        return true;
                    } else {

                        pdisplay.innerHTML = "Invalid Name";
                        pdisplay.style.color = "PURPLE";
                        return false;
                    }
                     }
                    }


            function mvalidation()
            {
                var mvalidation = document.getElementById("mobile1");
                var mdisplay = document.getElementById("mdisplay");
                if (mvalidation.value.trim() == "") {
                    mdisplay.innerHTML = "mobile Required";
                    mdisplay.style.color = "red";
                    return false;
                } else {
                    var reg = /^[6789][0-9]{9}/;
                    if (reg.test(mobile1.value)) {
                        mdisplay.innerHTML = "";
                        mdisplay.style.color = "red";
                        return true;
                    } else {

                        mdisplay.innerHTML = "Invalid Name";
                        mdisplay.style.color = "PURPLE";
                        return false;
                    }
                     }
                    }


        </script>
        <style>
            body {
                font-family: Arial, sans-serif;
                background: url("https://i.pinimg.com/originals/a7/96/e3/a796e37aedf6d1153d820620eb135c7c.jpg"), #000;
                background-color: #f2f2f2;
                margin: 0;
                padding: 0;
            }

            .container {
                width: 30%;
                margin: 0 auto;
                padding: 20px;
                background-color: #ffffff;
                border: 1px solid;
                border-radius: 15px;
                text-align: center;
            }

            h2 {
                color: #333;
            }

            .form-group {
                text-align: left;
                margin-bottom: 15px;
            }

            .form-group label {
                font-weight: bold;
            }

            .form-group input {
                width: 90%;
                padding: 10px;
                border: 1px solid #ccc;
                border-radius: 5px;
                font-size: 15px;
            }
            #submit_btn {
                background-color: grey;
                font-size: 15px;
                color: white;
                width: 95%;
            }
            #submit_btn:hover {
                background-color: blue;
            }
        </style>
    </head>
    <body>
        <!-- <a href="../view/web/src\"></a> -->





        <!-- file:///D:/myfolder/yourpage.html" -->
        <div class='container'>
            <!--<a href="../RegistrationController">click </a>-->
            <h2>Registration Form</h2>
            <form action="../RegistrationController">
                <div class='form-group'>
                    <label for='name'>Name:</label>
                    <br />
                    <input
                        onkeyup="namevalidate()"

                        type='text'
                        id="name1" name='name'
                        placeholder='Enter your name'
                        //          pattern=\"[A-Za-z]+\" name='name'
                        required
                        />
                        <span id="udisplay" style="color: red;">*

                    </span>
                </div>
                <!--                <div class='form-group'>
                                    <label for='fatherName'>Father's Name:</label>
                                    <br />
                                    <input  onkeyup="fnamevalidate()"
                                            type='text'  name='fatherName'
                                            id='fname1'
                                            placeholder='Enter your Father name'
                                            //                     pattern=\"[A-Z a-z]+\" 
                                            required
                                            />
                                            <span id="fdisplay" style="color: red;">*
                
                                    </span>
                
                                </div>-->
                <div class='form-group'>
                    <label for='mobile'>Mobile:</label>
                    <br />
                    <input 
                        onkeyup="mvalidation()"
                        type='text'
                        id='mobile1'
                        placeholder='Enter your Mobile Number'
                        name='mobile'
                        maxlength="10"
                        required
                        />
                    <span id="mdisplay" style="color: red;">*

                    </span>
                </div>
                <div class='form-group'>
                    <label for='email'>Gmail:</label>
                    <br />
                    <input onkeyup="gvalidation()"
                           type='email'
                           id='gvalidation'
                           placeholder='Enter your email id'
                           name='email'
                           required
                           />
                    <span id="gvalidation" style="color: red" >*
                    </span>
                </div>
                <div class='form-group'>
                    <label for=''>Gender:</label>
                    <br />
                    <input "
                           type='text'
                           id='gvalidation'
                           placeholder='Enter your gender'
                           name='gender'
                           required
                           />
                    <span id="gvalidation" style="color: red" >*
                    </span>
                </div>
                <div class='form-group'>
                    <label for='password'>Password:</label>
                    <br />
                    <input onkeyup="psvalidation()"
                           type='password'
                           id='psvalidation'
                           placeholder='password'
                           name='password'
                           required
                           />
                    <span id="psvalidation" style="color: red">*

                    </span>
                </div>
                <div class='form-group'>
                    <label for='confirmPassword'>Confirm Password:</label>
                    <br />
                    <input
                        type='password'
                        id='confirmPassword'
                        placeholder='Confirm Password'
                        name='confirmPassword'
                        required
                        />
                </div>
                <div class='form-group'>
                    <input id='submit_btn' type='submit'value='Register' />
                </div>
            </form>
    </body>
</html>