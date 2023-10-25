<%-- Document : DashBoard Created on : 25-Oct-2023, 2:15:17 pm Author : DELL
--%> <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8" />
    <title>Sticky Navigation Bar | CodingLab</title>

    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css"
    />
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
      * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
        text-decoration: none;
      }
      #head {
        width: 100%;
        padding: 15px;
        background: grey;
        display: flex;
        align-items: center;
        justify-content: center;
        font-family: "Ubuntu", sans-serif;
      }
      #head div {
        font-size: 20px;
        color: white;
      }
      nav {
        top: 0;
        left: 0;
        width: 100%;
        padding: 15px;
        background: #4070f4;
        position: sticky;
        font-family: "Ubuntu", sans-serif;
      }
      .nav-content {
        height: 100%;
        margin: auto;
        display: flex;
        align-items: center;
        justify-content: space-between;
      }
      .logo a {
        font-weight: 500;
        font-size: 35px;
        color: white;
      }
      .nav-links {
        width: 60%;
      }
      .nav-content .nav-links {
        display: flex;
      }
      .nav-content .nav-links li {
        list-style: none;
        margin: 8px;
        margin-left: 80px;
      }
      .nav-links li a {
        text-decoration: none;
        color: white;
        font-size: 18px;
        font-weight: 500;
        padding: 10px 4px;
      }
      /* .ze: 18px;} */
      .nav-links li a:hover {
        color: black;
      }
      #section_one {
        height: 500px;
        width: 100%;
        display: flex;
        justify-content: space-evenly;
        align-items: center;
      }
      #section_one_one,
      #section_one_two,
      #section_one_three {
        height: 450px;
        width: 33%;
        background-color: blue;
      }
      footer {
        width: 100%;
        background: #111;
      }
      .content {
        width: 100%;
        padding: 20px;
        display: flex;
        /* flex-wrap: wrap; */
        justify-content: space-between;
      }
      .content p,
      a {
        color: #fff;
      }
      .left_box {
        width: 33%;
        display: flex;
        flex-direction: column;
      }
      .left_box p {
        width: 80%;
      }
      .middle_box {
        width: 33%;
        display: flex;
        flex-direction: column;
      }
      .right_box {
        width: 33%;
        display: flex;
        flex-direction: column;
      }
      .content .topic {
        font-size: 22px;
        font-weight: 600;
        color: #fff;
        margin-bottom: 16px;
      }
      footer .content .lower i {
        padding-right: 16px;
      }
      #text_sub {
        height: 43px;
        width: 50%;
        font-size: 20px;
      }
      #sent_btn {
        height: 43px;
        width: 20%;
        font-size: 20px;
      }
      footer .content .media-icons a {
        font-size: 16px;
        width: 45px;
        display: inline-block;
        text-align: center;
        line-height: 43px;
        border: 2px solid #222222;
        margin: 30px 5px;
      }
      .content .media-icons a:hover {
        border-color: #eb2f06;
      }
      footer .bottom {
        width: 100%;
        text-align: right;
        color: #d9d9d9;
        padding: 0 40px 5px 0;
      }
      footer .bottom a {
        color: #eb2f06;
      }
      footer a:hover {
        color: #eb2f06;
      }
    </style>
  </head>
  <body>
    <header id="head">
      <div>WELCOME SOHAN</div>
    </header>
    <nav>
      <div class="nav-content">
        <div class="logo">
          <a href="#">MyDashBoard</a>
        </div>
        <ul class="nav-links">
          <li><a href="#">Home</a></li>
          <li><a href="#">About</a></li>
          <li><a href="#">Gallary</a></li>
          <li><a href="#">Contact</a></li>
          <li>
            <a href="#"><i class="fa-solid fa-user"></i></a>
          </li>
          <li>
            <a href="LogOut"><i class="fa fa-sign-i"></i></a>
          </li>
        </ul>
      </div>
    </nav>

    <section>
        <!-- Modal -->
        <div id="loginmodal" class="modal fade" role="dialog">
          <div class="modal-dialog">
        
            <!-- Modal content-->
            <div class="modal-content">
              <div class="modal-header">
                
                <h4 class="modal-title">Login if you have exiting account</h4>
                <!-- <button type="button" class="close" data-dismiss="modal">&times;</button> -->
              </div>
              <div class="modal-body" id="modebody">
                
                <div class="container">
                  <h2>Login</h2>
                
                  <form action="LogInCheck.jsp" id="loginForm" onsubmit="return validateForm()">
                      <div class="form-group">
                          <label for="username">Username</label>
                          <div class="input-group">
                              <input name="userName" type="text" class="form-control custom-form-control" id="username" placeholder="Username or email">
                              <div class="input-group-append">
                                  <span class="input-group-text"><i class="fa fa-user"></i></span>
                              </div>
                          </div>
                      </div>
                      <div class="form-group">
                          <label for="password">Password</label>
                          <div class="input-group">
                              <input name="password" type="password" class="form-control custom-form-control" id="password" placeholder="Password">
                              <div class="input-group-append">
                                  <span class="input-group-text" onclick="togglePassword()">
                                      <i id="passwordToggle" class="fa fa-eye"></i>
                                  </span>
                              </div>
                          </div>
                      </div>
                      <button type="submit" class="btn btn-primary">Login</button>
                      <button type="button" class="btn btn-secondary"><a href="ragistration.html">Signup</a></button>
                      <div class="form-check mt-3">
                          <input type="checkbox" class="form-check-input" id="terms">
                          <label class="form-check-label" for="terms">I agree to the <a href="#">Terms and Conditions</a></label>
                      </div>
                  </form>
              </div>
              <script>
                  var passwordVisible = true;
          
                  function togglePassword() {
                      var passwordInput = document.getElementById("password");
                      var passwordToggle = document.getElementById("passwordToggle");
          
                      if (passwordVisible) {
                          passwordInput.type = "password";
                          passwordToggle.className = "fa fa-eye-slash";
                      } else {
                          passwordInput.type = "text";
                          passwordToggle.className = "fa fa-eye";
                      }
          
                      passwordVisible = !passwordVisible;
                  }
                  function validateForm() {
                      var username = document.getElementById("username").value;
                      var password = document.getElementById("password").value;
          
                      if (username === "") {
                          alert("Please enter your username.");
                          return false;
                      }
          
                      if (password === "") {
                          alert("Please enter your password.");
                          return false;
                      }
                      return true;
                  }
              </script>
              </div>
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
              </div>
            </div>
        
          </div>
        </div>
        </section>















    <section id="section_one">
      <div id="section_one_one"></div>
      <div id="section_one_two"></div>
      <div id="section_one_three"></div>
    </section>
    <footer>
      <div class="content">
        <div class="left_box">
          <div class="upper">
            <div class="topic">About us</div>
            <p>
              Lorem ipsum dolor sit amet consectetur adipisicing elit. Vitae
              illo nihil porro magnam quod explicabo nisi expedita dolores aut
              perspiciatis!
            </p>
          </div>
          <div class="lower">
            <div class="topic">Contact us</div>
            <div class="phone">
              <a href="#"><i class="fas fa-phone-volume"></i>+007 9089 6767</a>
            </div>
            <div class="email">
              <a href="#"><i class="fas fa-envelope"></i>abc@gmail.com</a>
            </div>
          </div>
        </div>
        <div class="middle_box">
          <span class="topic">Our Services</span><br />
          <span><a href="#">Web Design, Development</a></span> <br />
          <span><a href="#">Web UX Design, Reasearch</a></span> <br />
          <span><a href="#">Web User Interface Design</a></span> <br />
          <span><a href="#">Theme Development, Design</a></span> <br />
          <span><a href="#">Mobile Application Design</a></span> <br />
          <span><a href="#">Wire raming & Prototyping</a></span> <br />
        </div>
        <div class="right_box">
          <div class="topic">Subscribe us</div>
          <form action="#">
            <input
              id="text_sub"
              type="text"
              placeholder="Enter email address"
            />
            <input id="sent_btn" type="submit" name="" value="Send" />
            <div class="media-icons">
              <a href="#"><i class="fab fa-facebook-f"></i></a>
              <a href="https://www.instagram.com/sohan_maali1/" target="_blank"
                ><i class="fab fa-instagram"></i
              ></a>
              <a href="#"><i class="fab fa-twitter"></i></a>
              <a href="#"><i class="fab fa-youtube"></i></a>
              <a
                href="https://www.linkedin.com/in/sohan-un-6b3795282"
                target="_blank"
                ><i class="fab fa-linkedin-in"></i
              ></a>
            </div>
          </form>
        </div>
      </div>
      <div class="bottom">
        <p>Copyright © 2023 <a href="#">MyDashBoead</a> All rights reserved</p>
      </div>
    </footer>
  </body>
</html>
