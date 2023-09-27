
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TwoValue1 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Test</title>");
            out.print("<style> #try{background-color: #f0f4f5;} .inp{background-color: yellow; color: red; width:50%; margin-bottom:10px;} </style>");
            out.println("</head>");
            out.println("<body>");

            out.print("<center>");
            out.print("<form action ='TwoValue'>");
            out.print("<table id='try' height='450px' width='350px' border='black'>");
            out.print("<tr>");
            out.print("<td>");
            out.print("<lable style='width:97%; height:30px;' >Enter a Range: </lable>   ");
            out.print("   <input style='width:97%; height:30px;' type = 'text' placeholder='Enter range' name='n'>");

            out.print("</td>");
            out.print("</tr>");
            out.print("<tr>");
            out.print("<td>");
            out.print("<center>");
            out.print(" <input id='d' class='inp'  type='submit' name='answer' value='triangle1'>");
            out.print(" <br> <input class='inp' type='submit' name='answer' value='triangle2'>");
            out.print(" <br><input class='inp' type='submit' name='answer' value='triangle3'>");
            out.print(" <br><input class='inp' type='submit' name='answer' value='triangle4'>");
            out.print("<br> <input class='inp' type='submit' name='answer' value='triangle5'>");
            out.print(" <br><input class='inp' type='submit' name='answer' value='triangle6'>");
            out.print(" <br><input class='inp' type='submit' name='answer' value='triangle7'>");
            out.print("<br><input type = 'reset' value='Clear' >");
            out.print("</center>");
            out.print("</td>");
            out.print("</tr>");
            out.print("</table>");
            out.print("</form>");
            out.print("</center>");
            out.println("</body>");
            out.println("</html>");

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
