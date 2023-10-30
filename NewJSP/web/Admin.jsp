
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.sql.DriverManager"%>
<%@page import =  "java.sql.PreparedStatement"%>
<%@page import =  "java.sql.ResultSet"%>
<%@page import =  "java.sql.SQLException"%>
<%@page import =  "java.sql.Connection"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%
        response.setHeader("Cache-Control", "No-Cache");
        response.setHeader("Cache-Control", "No-Store"); 
        ResultSet rs =(ResultSet)session.getAttribute("rs"); 
        if(rs!=null){
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <!-- basic -->
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <!-- mobile metas -->
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <meta name="viewport" content="initial-scale=1, maximum-scale=1" />
        <!-- site metas -->
        <title>Admin Pannel</title>
        <meta name="keywords" content="" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <!--***************************************************-->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

        <!--***************************************************-->
        <!-- ------------------- CDN PATH BOOT------------------------------- -->
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
            crossorigin="anonymous"
            />
        <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"
        ></script>
        <script
            src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
            integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
            crossorigin="anonymous"
        ></script>
        <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
            integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
            crossorigin="anonymous"
        ></script>
        <!-- ---------------------- CDN PATH BOOT END---------------------------- -->
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css"
            integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw=="
            crossorigin="anonymous"
            referrerpolicy="no-referrer"
            />
        <!-- <link rel="stylesheet" href="css/bootstrap.min.css" /> -->
        <!-- site css -->
        <link rel="stylesheet" href="assets/css/AdminCss.css" />
        <!-- responsive css -->
        <link rel="stylesheet" href="css/responsive.css" />


    </head>
    <body class="dashboard dashboard_1">
        <div class="full_container">
            <div class="inner_container">
                <!-- right content -->
                <div id="content">
                    <!-- topbar -->

                    <jsp:include page="AdminNavVar.jsp" />       

                    <!-- end topbar -->
                    <!-- dashboard inner -->
                    <div class="midde_cont">
                        <div class="container-fluid">
                            <div class="row column_title">
                                <div class="col-md-12">
                                    <div class="page_title">
                                        <h2>Dashboard</h2>
                                    </div>
                                </div>
                            </div>

                            <div class="row">
                                <sql:setDataSource
                                    var="dataSource"
                                    driver="com.mysql.jdbc.Driver"
                                    url="jdbc:mysql://localhost:3306/Infojava"
                                    user="root"
                                    password="root"
                                    />

                                <sql:query var="result" dataSource="${dataSource}">
                                    SELECT * FROM servlet;
                                </sql:query>

                                <!-- table  -->
                                <table
                                    id="dtBasicExample"
                                    class="table table-striped table-bordered table-sm"
                                    cellspacing="0"
                                    width="100%"
                                    >
                                    <tbody>
                                        <tr>
                                            <th class="th-sm">User ID</th>
                                            <th class="th-sm">User Name</th>
                                            <th class="th-sm">Father Name</th>
                                            <th class="th-sm">Email</th>
                                            <th class="th-sm">Phone No</th>
                                            <th class="th-sm">Edit</th>
                                            <th class="th-sm">Delete</th>
                                        </tr>
                                        <c:set var="n" value="1"/>
                                        <c:forEach var="row" items="${result.rows}">
                                            <tr>
                                                <td><c:out value="${n}" /></td>
                                                <td><c:out value="${row.name}"/></td>
                                                <td><c:out value="${row.fname}"/></td>
                                                <td><c:out value="${row.gmail}"/></td>
                                                <td><c:out value="${row.mobile}"/></td>
                                                <td>
                                                    <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
                                                        Edit
                                                    </button>
                                                </td>
                                                <td>
                                                    <button
                                                        type="button"
                                                        class="btn btn-danger"
                                                        onclick="myDelete()"
                                                        >
                                                        Delete
                                                    </button>
                                                </td>
                                            </tr>
                                            <c:set var="n" value="${n+1}" />
                                        </c:forEach>
                                    </tbody>
                                </table>
                                <!-- table end  -->

                                <!-- modal start ------------------------ -->

                                <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                    <div class="modal-dialog">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <h1 class="modal-title fs-5" id="exampleModalLabel">Edit profile</h1>
                                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                            </div>
                                            <div class="modal-body">
                                                <form action="">
                                                    <div class="mb-3">
                                                        <label for="exampleInputEmail1" class="form-label">User Name</label>
                                                        <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">

                                                    </div>
                                                    <div class="mb-3">
                                                        <label for="exampleInputEmail1" class="form-label">User Father Name</label>
                                                        <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">

                                                    </div>
                                                    <div class="mb-3">
                                                        <label for="exampleInputEmail1" class="form-label">Email address</label>
                                                        <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                                        <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
                                                    </div>
                                                    <div class="mb-3">
                                                        <label for="exampleInputEmail1" class="form-label">User Mobile Number</label>
                                                        <input type="tel" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">

                                                    </div>
                                                    <div class="mb-3 form-check">
                                                        <input type="checkbox" class="form-check-input" id="exampleCheck1">
                                                        <label class="form-check-label" for="exampleCheck1">Check me out</label>
                                                    </div>
                                                    <button type="submit" class="btn btn-primary">Submit</button>
                                                </form>
                                            </div>

                                        </div>
                                    </div>
                                </div>

                                <!-- modal end ---------------------------------- -->
                            </div>
                        </div>
                        <!-- footer -->
                        <div class="container-fluid">
                            <div class="footer">
                                <p>
                                    Copyright © 2018 Designed by sohan.design. All rights
                                    reserved.<br /><br />
                                    Distributed By:
                                    <a href="#">Sohan</a>
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
<% 
    }
    else { 
            response.sendRedirect(request.getContextPath() + "/index.jsp");
        }
%>
<script>
    var Myname = document.getElementById("Myname");
    var father = document.getElementById("father");
    var mobile = document.getElementById("mobile");
    var email = document.getElementById("email");
    var btn = document.getElementById("btn");
    var enableButton = document.getElementById("enableButton");
    enableButton.addEventListener("click", () => {
        Myname.disabled = false;
        father.disabled = false;
        mobile.disabled = false;
        email.disabled = false;
        btn.style.display = "inline";
        enableButton.style.display = "none";
    });
</script>