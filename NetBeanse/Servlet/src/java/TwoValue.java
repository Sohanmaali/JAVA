
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TwoValue extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try (PrintWriter out = response.getWriter()) {

            String ans = request.getParameter("answer");
            int n = Integer.parseInt(request.getParameter("n"));
            int i, j, k;

            switch (ans) {
                case "triangle1" -> {
                    while (n >= 1) {
                        j = 1;
                        while (j <= n) {
                            out.print(j);
                            j++;
                        }
                        out.println();
                        n--;
                    }
                }
                case "triangle2" -> {
                    while (n >= 1) {
                        j = 1;
                        while (j <= n) {
                            out.print("* ");
                            j++;
                        }
                        out.println();
                        n--;
                    }
                }
                case "triangle3" -> {
                    for (i = n; i >= 1; i--) {
                        for (j = i; j < n; j++) {
                            out.print("  ");
                        }
                        for (k = i; k >= 1; k--) {
                            out.print(k + " ");
                        }
                        out.println("");
                    }
                }
                case "triangle4" -> {
                    for (i = n; i >= 1; i--) {
                        for (j = i; j < n; j++) {
                            System.out.print("  ");
                        }

                        for (k = i; k >= 1; k--) {
                            out.print("* ");
                        }

                        out.println("");
                    }
                }
                case "triangle5" -> {
                    for (i = 1; i <= n; i++) {
                        for (j = 1; j < i; j++) {
                            out.print("  ");
                        }

                        for (k = i; k <= n; k++) {
                            out.print(k + " ");
                        }
                        out.println("");
                    }
                }
                case "triangle6" -> {
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
                }

                case "triangle7" -> {
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
