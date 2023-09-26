
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class OddNumberSerice extends HttpServlet {

    protected void servicesRequest(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html;charset = UTF-8");
        try (PrintWriter out = res.getWriter()) {
            int n = 10;
            for (int i = 1; i <= n; i++) {
                out.println(i * 2 - 1 + "<br>");
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        this.servicesRequest(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        this.servicesRequest(req, res);
    }

    public String getServletinfo() {
        return "sort Discreption";
    }
}
