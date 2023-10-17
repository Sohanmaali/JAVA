
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class OneOperand extends HttpServlet {

    protected void prossesRequest(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html;charset = UTF-8");
        try (PrintWriter out = res.getWriter()) {
            int n = Integer.parseInt(req.getParameter("n"));
            if (req.getParameter("Factorial") != null) {

            } else if (req.getParameter("Pattern") != null) {
                pattern(n, out);
            } else if (req.getParameter("OddNumber") != null) {
                oddNumberSerice(n, out);
            } else if (req.getParameter("Palindrome") != null) {
                checkPalindrome(n, out);
            } else if (req.getParameter("PrimeNumber") != null) {
                primeNumber(n, out);
            } else if (req.getParameter("LeapYear") != null) {
                checkLeapYear(n, out);
            } else if (req.getParameter("Reverse") != null) {
                reverse(n, out);
            } else if (req.getParameter("DayName") != null) {
                dayName(n, out);
            } else if (req.getParameter("Electricity") != null) {
                calculateElectricity(n, out);
            } else if (req.getParameter("monthName") != null) {
                monthName(n, out);
            } else if (req.getParameter("Age Check") != null) {
                ageCheck(n, out);
            }
        }
    }

    public void ageCheck(int age, PrintWriter out) {
        if (age <= 0) {
            out.println("Invalid age !!!");
        } else if (age < 13) {
            out.println("child age");
        } else if (age < 20) {
            out.println("teen age");
        } else if (age < 60) {
            out.println("Young age");
        } else {
            out.println("Old age");
        }

    }

    public void checkPalindrome(int n, PrintWriter out) {
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

    public void Power(int n, PrintWriter out) {
        out.println(" " + Math.pow(5, 3));
    }

    public void calculateElectricity(int total, PrintWriter out) {
        float bill;
        if (total > 0 || total <= 100) {
            bill = total * 5f;
            out.println("Your bill is = " + bill);
        } else if (total > 100 || total <= 200) {
            bill = total * 7.50f;
            out.println("Your bill is = " + bill);
        } else if (total > 200 || total <= 300) {
            bill = total * 12.50f;
            out.println("Your bill is = " + bill);
        } else if (total > 300) {
            bill = total * 16f;
            out.println("Your bill is = " + bill);
        }
    }

    public void monthName(int num, PrintWriter out) {
        switch (num) {
            case 1 ->
                out.println("JANUARY");
            case 2 ->
                out.println("FEBRUARY");
            case 3 ->
                out.println("MARCH");
            case 4 ->
                out.println("APRIL");
            case 5 ->
                out.println("MAY");
            case 6 ->
                out.println("JUNE");
            case 7 ->
                out.println("JULY");
            case 8 ->
                out.println("AUGUST");
            case 9 ->
                out.println("SEPTEMBER");
            case 10 ->
                out.println("OCTOBER");
            case 11 ->
                out.println("NOVEMBE");
            case 12 ->
                out.println("DECEMBER");
            default ->
                out.println("INVALID INPUT");
        }
    }

    public void dayName(int num, PrintWriter out) {
        switch (num) {
            case 1 ->
                out.println("MONDAY");
            case 2 ->
                out.println("TUESDAY");
            case 3 ->
                out.println("WEDNSDAY");
            case 4 ->
                out.println("THRSADAY");
            case 5 ->
                System.out.println("FRIDAY");
            case 6 ->
                out.println("SATARDAY");
            case 7 ->
                out.println("SUNDAY");
            default ->
                out.println("INVALIDE INPUT !");
        }
    }

    public void reverse(int n, PrintWriter out) {
        int rev = 0;
        int temp = n;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        out.println(rev);
    }

    public void checkLeapYear(int n, PrintWriter out) {
        if ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0) {
            out.println("Enter year is leap year");
        } else {
            out.println("Enter year is Normal year");
        }
    }

    public void oddNumberSerice(int n, PrintWriter out) {
        for (int i = 1; i <= n; i++) {
            out.println(i * 2 - 1 + "<br>");
        }
    }

    public void pattern(int n, PrintWriter out) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                out.println("* ");
            }
            out.println("<br>");
        }
    }

    public void primeNumber(int n, PrintWriter out) {
        int count = 0, i;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            out.println("Prime number");
        } else {
            out.println("Not Prime number");
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
