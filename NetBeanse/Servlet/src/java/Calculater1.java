
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Calculater1 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Test</title>");
            out.print("<style> #try{background-color: #f0f4f5;} .inp{background-color: #5F6368; color: white; width:50%; margin-bottom:10px;} </style>");
            out.println("</head>");
            out.println("<body>");

            out.print("<center>");
            out.print("<form action ='Calculatar'>");
            out.print("<table id='try' height='450px' width='350px' border='black'>");

            out.print("<tr>");
            out.print("<td>");
            out.print("<lable style='width:97%; height:30px;' >Enter First Number: </lable>   ");
            out.print("   <input style='width:97%; height:30px;' type = 'text' placeholder='Enter Number' name='n1'>");
            out.print("</td>");
            out.print("</tr>");
            out.print("<tr>");
            out.print("<td>");
            out.print("<lable style='width:97%; height:30px;' >Enter Second Number: </lable>   ");
            out.print("   <input style='width:97%; height:30px;' type = 'text' placeholder='Enter Second number' name='n2'>");
            out.print("</td>");
            out.print("</tr>");

            out.print("<tr>");
            out.print("<td>");
            out.print("<center>");
            out.print(" <input id='d' class='inp'  type='submit' name='Addition' value='Addition'>");
            out.print(" <br> <input class='inp' type='submit' name='Subtraction' value='Subtraction'>");
            out.print(" <br><input class='inp' type='submit' name='Multiplaction' value='Multiplaction'>");
            out.print(" <br><input class='inp' type='submit' name='Division' value='Division'>");
            out.print("<br> <input class='inp' type='submit' name='Modul' value='Modul'>");

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
