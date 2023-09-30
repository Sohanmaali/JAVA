
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Calculatar extends HttpServlet {

    protected void serviseRequest(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html;charset = UTF-8");
        try (PrintWriter out = res.getWriter()) {
            int n = 0, m = 0;
            try {
                n = Integer.parseInt(req.getParameter("n1"));
                m = Integer.parseInt(req.getParameter("n2"));
                if (req.getParameter("Addition") != null) {
                    showResult(addition(n, m, out), res);

                } else if (req.getParameter("Subtraction") != null) {
                    showResult(subtraction(n, m, out), res);
                } else if (req.getParameter("Multiplaction") != null) {
                    showResult(multiplaction(n, m, out), res);
                } else if (req.getParameter("Division") != null) {
                    showResult(division(n, m, out), res);
                } else if (req.getParameter("Modul") != null) {
                    showResult(modul(n, m, out), res);
                }
            } catch (NumberFormatException e) {
                showResult("Invalide Input", res);
            }

        }
    }

    public void showResult(String n, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        res.getWriter().println("<html>");
        res.getWriter().println("<head><title>Calculator Result</title></head>");
        res.getWriter().println("<body>");
        res.getWriter().println("<h1>Calculator Result</h1>");
        res.getWriter().println("<p>Result: " + n + "</p>");
        res.getWriter().println("</body>");
        res.getWriter().println("</html>");
    }

    public void showResult(int n, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        res.getWriter().println("<html>");
        res.getWriter().println("<head><title>Calculator Result</title></head>");
        res.getWriter().println("<body>");
        res.getWriter().println("<h1>Calculator Result</h1>");
        res.getWriter().println("<p>Result: " + n + "</p>");
        res.getWriter().println("</body>");
        res.getWriter().println("</html>");
    }

    public int addition(int n, int m, PrintWriter out) {
        return n + m;

    }

    public int subtraction(int n, int m, PrintWriter out) {
        return n - m;
    }

    public int multiplaction(int n, int m, PrintWriter out) {
        return n * m;
    }

    public int division(int n, int m, PrintWriter out) {
        return n / m;
    }

    public int modul(int n, int m, PrintWriter out) {
        return n % m;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        serviseRequest(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        serviseRequest(req, res);
    }

    @Override
    public String getServletInfo() {
        return "short Descreption";
    }
}
