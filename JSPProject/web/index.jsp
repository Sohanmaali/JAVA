<%-- 
    Document   : WelComePage
    Created on : 25-Oct-2023, 1:57:48 pm
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
                       <!DOCTYPE html>
                        <html lang="en" dir="ltr">
                          <head>
                            <meta charset="UTF-8" />
                            <title>Sticky Navigation Bar | CodingLab</title>
                            <style>
                              * {
                                margin: 0;
                                padding: 0;
                                box-sizing: border-box;
                                text-decoration: none;
                                font-family: "Ubuntu", sans-serif;
                              }
                              nav {
                                position: fixed;
                                top: 0;
                                left: 0;
                                width: 100%;
                                padding: 20px;
                                transition: all 0.4s ease;
                              }
                              nav.sticky {
                                padding: 15px 20px;
                                background: gray;
                                box-shadow: 0 5px 10px rgba(0, 0, 0, 0.1);
                              }
                              nav .nav-content {
                                height: 100%;
                                max-width: 1200px;
                                margin: auto;
                                display: flex;
                                align-items: center;
                                justify-content: space-between;
                              }
                              nav .logo a {
                                font-weight: 500;
                                font-size: 35px;
                                color: #4070f4;
                              }
                              nav.sticky .logo a {
                                color: #fff;
                              }
                              .nav-content .nav-links {
                                display: flex;
                              }
                              .nav-content .nav-links li {
                                list-style: none;
                                margin: 0 8px;
                              }
                              .nav-links li a {
                                text-decoration: none;
                                color: #0e2431;
                                font-size: 18px;
                                font-weight: 500;
                                padding: 10px 4px;
                                transition: all 0.3s ease;
                              }
                              .nav-links li a:hover {
                                color: #4070f4;
                              }
                              nav.sticky .nav-links li a {
                                color: #fff;
                                transition: all 0.4s ease;
                              }
                              nav.sticky .nav-links li a:hover {
                                color: #0e2431;
                              }
                              .home {
                                height: 100vh;
                                width: 100%;
                                background: url("images/background.png") no-repeat;
                                background-size: cover;
                                background-position: center;
                                background-attachment: fixed;
                                font-family: "Ubuntu", sans-serif;
                              }
                              h2 {
                                font-size: 30px;
                                margin-bottom: 6px;
                                color: #4070f4;
                              }
                              .text {
                                text-align: justify;
                                padding: 40px 80px;
                                box-shadow: -5px 0 10px rgba(0, 0, 0, 0.1);
                              }
                              .header {
                                position: fixed;
                                top: 0;
                                left: 0;
                                width: 100%;
                              }
                              .navbar {
                                display: flex;
                                align-items: center;
                                justify-content: space-between;
                                max-width: 1200px;
                                margin: 0 auto;
                                padding: 20px 15px;
                              }
                              .navbar .logo a {
                                font-size: 1.8rem;
                                text-decoration: none;
                                color: #fff;
                              }
                              .navbar .links {
                                display: flex;
                                align-items: center;
                                list-style: none;
                                gap: 35px;
                              }
                              .navbar .links a {
                                font-weight: 500;
                                text-decoration: none;
                                color: #fff;
                                padding: 10px 0;
                                transition: 0.2s ease;
                              }
                              .navbar .links a:hover {
                                color: #47b2e4;
                              }
                              .navbar .buttons a {
                                text-decoration: none;
                                color: #fff;
                                font-size: 1rem;
                                padding: 15px 0;
                                transition: 0.2s ease;
                              }
                              .navbar .buttons a:not(:last-child) {
                                margin-right: 30px;
                              }
                              .navbar .buttons .signin:hover {
                                color: #47b2e4;
                              }
                              .navbar .buttons .signup {
                                border: 1px solid #fff;
                                padding: 10px 20px;
                                border-radius: 0.375rem;
                                text-align: center;
                                transition: 0.2s ease;
                              }
                              .navbar .buttons .signup:hover {
                                background-color: #47b2e4;
                                color: #fff;
                              }
                              .hero-section {
                                display: flex;
                                justify-content: space-evenly;
                                align-items: center;
                                height: 95vh;
                                padding: 0 15px;
                                max-width: 1200px;
                                margin: 0 auto;
                              }
                              .hero-section .hero {
                                max-width: 50%;
                                color: #fff;
                              }
                              .hero h2 {
                                font-size: 2.5rem;
                                margin-bottom: 20px;
                              }
                              .hero p {
                                font-size: 1.2rem;
                                margin-bottom: 20px;
                                color: #c9c7c7;
                              }
                              .hero-section .img img {
                                width: 517px;
                              }
                              .hero-section .buttons {
                                margin-top: 40px;
                              }
                              .hero-section .buttons a {
                                text-decoration: none;
                                color: #fff;
                                padding: 12px 24px;
                                border-radius: 0.375rem;
                                font-weight: 600;
                                transition: 0.2s ease;
                                display: inline-block;
                              }
                              .hero-section .buttons a:not(:last-child) {
                                margin-right: 15px;
                              }
                              .buttons .join {
                                background-color: #47b2e4;
                              }
                              .hero-section .buttons .learn {
                                border: 1px solid #fff;
                                border-radius: 0.375rem;
                              }
                              .hero-section .buttons a:hover {
                                background-color: #47b2e4;
                              }
                              /* Hamburger menu styles */
                              #menu-toggle {
                                display: none;
                              }
                              #hamburger-btn {
                                font-size: 1.8rem;
                                color: #fff;
                                cursor: pointer;
                                display: none;
                                order: 1;
                              }
                              @media screen and (max-width: 1023px) {
                                .navbar .logo a {
                                  font-size: 1.5rem;
                                }
                                .links {
                                  position: fixed;
                                  left: -100%;
                                  top: 75px;
                                  width: 100%;
                                  height: 100vh;
                                  padding-top: 50px;
                                  background: #175d69;
                                  flex-direction: column;
                                  transition: 0.3s ease;
                                }
                                .navbar #menu-toggle:checked ~ .links {
                                  left: 0;
                                }
                                .navbar #hamburger-btn {
                                  display: block;
                                }
                                .header .buttons {
                                  display: none;
                                }
                                .hero-section .hero {
                                  max-width: 100%;
                                  text-align: center;
                                }
                                .hero-section img {
                                  display: none;
                                }
                              }
                            </style>
                          </head>
                          <body>
                            <nav>
                              <div class="nav-content">
                                <div class="logo">
                                  <a href="#">Welcome</a>
                                </div>
                                <ul class="nav-links">
                                  <li><a href="#">Home</a></li>
                                  <li><a href="#">About</a></li>
                                  <li><a href="#">Skills</a></li>
                                  <li><a href="#">Services</a></li>
                                  <li><a href="#">Contact</a></li>
                                  <li><a href="LoginPage.jsp">Log in</a></li>
                                </ul>
                              </div>
                            </nav>
                        
                            <section class="hero-section">
                              <div class="hero">
                                <h2>Mobile App Development</h2>
                                <p>
                                  Join us in the exciting world of programming and turn your ideas into
                                  reality. Unlock the world of endless possibilities - learn to code and
                                  shape the digital future with us.
                                </p>
                                <div class="buttons">
                                  <a href='RegistrationPage.jsp' class="join">Join Now</a>
                                  <a href="#" class="learn">Learn More</a>
                                </div>
                              </div>
                              <div class="img">
                                <img
                                  src="https://www.codingnepalweb.com/demos/create-responsive-website-html-css/hero-bg.png"
                                  alt="hero image"
                                />
                              </div>
                            </section>
                          </body>
                        </html>