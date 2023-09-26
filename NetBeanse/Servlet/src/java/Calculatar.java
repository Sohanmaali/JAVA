
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Calculatar extends HttpServlet {

    protected void serviseRequest(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html;charset = UTF-8");
        try (PrintWriter out = res.getWriter()) {
//            out.println("Sohan");
            int n = Integer.parseInt(req.getParameter("n1"));
            int m = Integer.parseInt(req.getParameter("n2"));
            
            if (req.getParameter("Addition") != null) {
                addition(n, m, out);
            } else if (req.getParameter("Subtraction") != null) {
                subtraction(n, m, out);
            } else if (req.getParameter("Multiplaction") != null) {
                multiplaction(n, m, out);
            } else if (req.getParameter("Division") != null) {
                division(n, m, out);
            }
        }
    }

    public void addition(int n, int m, PrintWriter out) {
        out.println(n + m);

    }

    public void subtraction(int n, int m, PrintWriter out) {
        out.println(n - m);

    }

    public void multiplaction(int n, int m, PrintWriter out) {
        out.println(n * m);

    }

    public void division(int n, int m, PrintWriter out) {
        out.println(n / m);

    }

    /**
     *
     * @param req
     * @param res
     * @throws IOException
     */
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
