
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Palindrome extends HttpServlet {

    protected void prossesRequest(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html;charset = UTF-8");
        try (PrintWriter out = res.getWriter()) {
            int n = 125;
            int rev = 0;
            int temp = n;
            while (n > 0) {
                rev = rev * 10 + (n % 10);
                n /= 10;
            }
            if (temp == rev) {
                out.println("Palindrome Number");
            } else {
                out.println("Not A Palindrome Number");
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        this.prossesRequest(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        this.prossesRequest(req, res);
    }

    @Override
    public String getServletInfo() {
        return "short Discreption";
    }
}
