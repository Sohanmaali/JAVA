package jdbcConnect;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Profile extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            HttpSession session = request.getSession();
            ResultSet rs = (ResultSet) session.getAttribute("rs");
            Object ob = session.getAttribute("sms");
            out.print("            <!DOCTYPE html>");
            out.print(" <html lang='en'>");
            out.print("  <head>");
            out.print("<meta charset='UTF-8' />");
            out.print("<meta name='viewport' content='width=device-width, initial-scale=1.0' />");
            out.print("<meta http-equiv='X-UA-Compatible' content='ie=edge' />");
            out.print("<title>Profle Card UI Design | CoderGirl</title>");
            out.print("<style>");
            out.print("  * {");
            out.print("    margin: 0;");
            out.print("    padding: 0;");
            out.print("    box-sizing: border-box;");
            out.print("    font-family: 'Poppins', sans-serif;");
            out.print("  }");
            out.print("  .main {");
            out.print("    width: 100%;");
            out.print("    height: 100vh;");
            out.print("    display: flex;");
            out.print("    align-items: center;");
            out.print("    justify-content: center;");
            out.print("  }");
            out.print("  .profile-card {");
            out.print("    display: flex;");
            out.print("    flex-direction: column;");
            out.print("    align-items: center;");
            out.print("    height: 600px;");
            out.print("    width: 50%;");
            out.print("    border-radius: 25px;");
            out.print("    padding: 30px;");
            out.print("    border: 1px solid #ffffff40;");
            out.print("    /* background-color: yellow; */");
            out.print("    box-shadow: 0 5px 20px rgba(0, 0, 0, 0.4);");
            out.print("  }");
            out.print("  .image {");
            out.print("    position: relative;");
            out.print("    height: 150px;");
            out.print("    width: 150px;");
            out.print("  }");
            out.print("  .image .profile-pic {");
            out.print("    width: 100%;");
            out.print("    height: 100%;");
            out.print("    border-radius: 50%;");
            out.print("    box-shadow: 0 5px 20px rgba(0, 0, 0, 0.4);");
            out.print("  }");
            out.print("  form {");
            out.print("    width: 100%;");
            out.print("    position: relative;");
            out.print("  }");
            out.print("  table {");
            out.print("    position: absolute;");
            out.print("    margin-top: 30px;");
            out.print("    width: 100%;");
            out.print("  }");
            out.print("  table tr {");
//            out.print("    width: 50%;");
            out.print("    display: flex;");
            out.print("  }");
            out.print("  table tr td {");
            out.print("    font-size: 18px;");
            out.print("    width: 100%;");
            out.print("    height: 35px;");
            out.print("     display: flex;");
            out.print("      flex-direction: row;");
            out.print("    color: black;");
            out.print("  }");
            out.print("  table tr td a {");
            out.print("    font-size: 18px;");
            out.print("    width: 40%;");
            out.print("    height: 35px;");
            out.print("    color: black;");
            out.print("    text-decoration: none;");
            out.print("  }");
            out.print("  table tr td a:hover {");
            out.print("    color: grey;");
            out.print("  }");
            out.print("  input {");
            out.print("    width: 90%;");
            out.print("    height: 30px;");
            out.print("    font-size: 15px;");
            out.print("    border-radius: 10px;");
            out.print("    border: none;");
            out.print("  }");
//            out.print("  input:hover {");
//            out.print("    background-color: gray;");
//            out.print("  }");
            out.print("""
                       /* -------------------------------------------- */
                            input[type="checkbox"] {
                              display: none;
                            }
                      
                            input[type="checkbox"]:checked + input[type="text"] {
                              pointer-events: auto;
                              background-color: #fff;
                              border: 1px solid #ccc;
                              color: #333;
                            }
                      
                            button {
                              display: none;
                            }
                      
                            input[type="checkbox"]:checked + input[type="text"] + button {
                              display: inline-block;
                            }
                            /* ---------------------------------------- */""");
            out.print("</style>");
            out.print("  </head>");
            out.print("  <body>");
            out.print("    <section class='main'>");
            out.print("      <div class='profile-card'>");
            out.print("<div class='image'>");
            out.print("  <img src='images/profile.jpg' alt='' class='profile-pic' />");
            out.print("</div>");
            out.print("<div class='data'>");
            out.print("  <br />");
            out.print("  <br />");
            out.print("  <h2>" + rs.getString(1) + "</h2>");
            out.print("</div>");
            out.print("<form action='UpdateData'>");
            out.print("  <table>");
            out.print("    <tr>");
            out.print("<td>");
            out.print("  <span>Name : </span>");
            out.print("</td>");
            out.print("<td>");
            out.print("  <span>" + rs.getString(1) + "</span>");
            out.print("</td>");
            //-------------------------------------------
            out.print("""
                      <td>
                                      <label for="editToggle1">Edit</label>
                                    </td>
                                    <td class="save_btn">
                                      <input type="checkbox" id="editToggle1" />
                                      <input type="text" id="editableField1" name= "name" />
                                      <button id="saveButton1" name ="saveButton1" value="name">Save</button>
                                    </td>""");
            //-------------------------------------------

            out.print("    </tr>");
            out.print("    <tr>");
            out.print("      <td>");
            out.print("        <span>Father :</span>");
            out.print("      </td>");
            out.print("      <td>");
            out.print("        <span>" + rs.getString(2) + "</span>");
            out.print("      </td>");
            //-------------------------------------------
            out.print("""
                       <td>
                                      <label for="editToggle2">Edit</label>
                                    </td>
                                    <td class="save_btn">
                                      <input type="checkbox" id="editToggle2" />
                                      <input type="text" id="editableField2" name= "fname" />
                                      <button id="saveButton2" name ="saveButton2" value = "save2">Save</button>
                                    </td>""");
            //-------------------------------------------
            out.print("    </tr>");
            out.print("    <tr>");
            out.print("      <td>");
            out.print("        <span>Gmail : </span>");
            out.print("      </td>");
            out.print("      <td>");
            out.print("        <span>" + rs.getString(3) + "</span>");
            out.print("      </td>");
            //-------------------------------------------
            out.print("""
                      <td>
                                      <label for="editToggle3">Edit</label>
                                    </td>
                                    <td class="save_btn">
                                      <input type="checkbox" id="editToggle3" />
                                      <input type="text" id="editableField3" name= "gmail" />
                                      <button id="saveButton3" name ="saveButton3">Save</button>
                                    </td>""");
            //-------------------------------------------

            out.print("    </tr>");
            out.print("    <tr>");
            out.print("      <td>");
            out.print("        <span>Mobile : </span>");
            out.print("      </td>");
            out.print("      <td>");
            out.print("        <span>" + rs.getString(4) + "</span>");
            out.print("      </td>");
            //-------------------------------------------
            out.print("""
                      <td>
                                      <label for="editToggle4">Edit</label>
                                    </td>
                                    <td class="save_btn">
                                      <input type="checkbox" id="editToggle4" />
                                      <input type="text" id="editableField4" name= "mobile" />
                                      <button id="saveButton4" name ="saveButton4">Save</button>
                                    </td>""");
            //-------------------------------------------
            out.print("    </tr>");
            out.print("    <tr>");
            out.print("      <td>Change Password</td>");
            out.print("      <td></td>");
            //-------------------------------------------
            out.print("""
                      <td class="save_btn">
                                      <label for="editToggle5">Edit</label>
                                    </td>
                                    <td>
                                      <input type="checkbox" id="editToggle5" />
                                      <input type="text" id="editableField5" name= "password" />
                                      <button id="saveButton5" name ="saveButton5">Save</button>
                                    </td>""");
            //-------------------------------------------
            out.print("    </tr>");
            out.print("    <tr>");
            out.print("      <td>");
            if (ob.equals(1)) {
                out.print("<span>Data Saved</span>");
            }
            out.print("      </td>");
            out.print("    </tr>");
            out.print("    <tr>");
            out.print("      <td>");
            out.print("        <a href='DashBoard' class='btn'>Home</a>");
            out.print("      </td>");
            out.print("      <td>");
            out.print("        <a href='LoginPage' class='btn'>LogOut</a>");
            out.print("      </td>");
            out.print("    </tr>");
            out.print("  </table>");
            out.print("</form>");
            out.print("      </div>");
            out.print("    </section>");
            out.print("  </body>");
            out.print("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
