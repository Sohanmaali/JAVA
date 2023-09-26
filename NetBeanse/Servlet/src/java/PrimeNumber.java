
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class PrimeNumber extends HttpServlet {

    protected void prossesRequest(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html;charset = UTF-8");
        try (PrintWriter out = res.getWriter()) {
            int n = 10, count = 1;
            boolean flag = false;
            for (int i = 2; count < n; i++) {
                for (int x = 2; x < 5; x++) {
                    if (i % x == 0) {
                        flag = true;
                    }
                }
                if (!flag) {
                    out.println(i + " ");
                    count++;
                    flag = false;
                }
            }
            out.println("Sohan");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        prossesRequest(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        prossesRequest(req, res);
    }

    @Override
    public String getServletInfo() {
        return "short Descraption";
    }
}
