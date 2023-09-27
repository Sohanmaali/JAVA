
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FoureValue1 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try (PrintWriter out = response.getWriter()) {

            String ans = request.getParameter("answer");
            int n = Integer.parseInt(request.getParameter("n1"));
            int i, j, k;

            if (request.getParameter("Fibbonaci") != null) {
                out.println("<h1>Fibonaci : </h1>");

                int a = 0, b = 1, c = 0;
                for (i = 1; i <= n; i++) {
                    a = b;
                    b = c;
                    c = a + b;//                        Object ob = c;
                    out.println(c);
                    //out.print(c + " ");
                }
            } else if (request.getParameter("PrimeSeries") != null) {
                while (n >= 1) {
                    j = 1;
                    while (j <= n) {
                        out.print("* ");
                        j++;
                    }
                    out.println();
                    n--;
                }
            } else if (request.getParameter("triangle3") != null) {
                for (i = n; i >= 1; i--) {
                    for (j = i; j < n; j++) {
                        out.print("  ");
                    }
                    for (k = i; k >= 1; k--) {
                        out.print(k + " ");
                    }
                    out.println("");
                }
            } else if ((request.getParameter("triangle4") != null)) {
                for (i = n; i >= 1; i--) {
                    for (j = i; j < n; j++) {
                        System.out.print("  ");
                    }

                    for (k = i; k >= 1; k--) {
                        out.print("* ");
                    }

                    out.println("");
                }
            } else if ((request.getParameter("triangle5") != null)) {
                for (i = 1; i <= n; i++) {
                    for (j = 1; j < i; j++) {
                        out.print("  ");
                    }

                    for (k = i; k <= n; k++) {
                        out.print(k + " ");
                    }
                    out.println("");
                }
            } else if ((request.getParameter("triangle6") != null)) {
                for (i = 1; i <= n; i++) {
                    switch (i) {
                        case 1 ->
                            out.print("* ");
                        case 2 ->
                            out.print("* * ");
                        default -> {
                            for (j = 1; j <= i * i; j++) {
                                out.print("* ");
                            }
                        }
                    }
                    out.println("");
                }
            } else if ((request.getParameter("triangle7") != null)) {
                int a = 3,
                        b = 1;
                for (i = 1; i <= n; i++) {
                    if (i == 1) {
                        out.print("* ");
                    } else if (i == 2) {
                        out.print("* * ");
                    } else if (i % 2 == 0) {

                        for (j = 1; j <= i + a; j++) {
                            out.print("* ");
                        }
                        a = a + j;
                    } else {
                        for (j = 1; j <= i + b; j++) {
                            out.print("* ");
                        }
                    }

                    out.println("");
                }
            }
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
