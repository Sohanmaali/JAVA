<%-- Document : Program Created on : 18-Oct-2023, 4:49:13 pm Author : DELL --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>JSP Page</title>
    </head>
    <body>
        <button id="Factorial" onclick="factorial()" name="fibob">Factorial</button>

        <button id="Power" onclick="power()" name="powerb">Power</button>

        <!-- <button onclick="()" id="Calculater" value="Calculater">Calculater</button> -->

        <button onclick="cube()" id="Cube" value="Cube">Cube</button>

        <button onclick="fibbonacci()" id="fibbonacci" value="fibbonacci">
            Fibonacci
        </button>

        <button onclick="cartoon()" id="PreetiCartoon" value="PreetiCartoon">
            PreetiCartoon
        </button>

        <button onclick="voting()" id="Voting" value="Voting">Voting</button>

        <button onclick="leapyear()" id="LeapYear" value="LeapYear">
            LeapYear
        </button>

        <button onclick="checkEvenOdd()" id="CheckEvenOdd" value="CheckEvenOdd">
            CheckEvenOdd
        </button>

        <button onclick="hcf()" id="HCF" value="HCF">HCF</button>

        <button onclick="reverse()" id="HCF" value="Reverse">Reverse</button>

        <button onclick="primeNumber()" id="HCF" value="PrimeNumber">
            PrimeNumber
        </button>
        <br /><br />

        <div id="factorial1" style="display: none">
            <form action="">
                <input type="text" id="valuen1" name="first" />
                <span id="factorialsub">
                    <input type="submit" value="Factorial" name="factsub" />
                </span>
            </form>
        </div>

        <div id="power1" style="display: none">
            <form action="">
                <input type="text" id="valuen1" name="first" />
                <input type="text" id="valuen2" name="second" />
                <input type="submit" value="Power" name="Power" />
            </form>
        </div>

        <div id="Cube1" style="display: none">
            <form action="">
                <input type="text" id="valuen1" name="first" />

                <input type="submit" value="cube" name="cube" />
            </form>
        </div>

        <div id="fibbonacci1" style="display: none">
            <form action="">
                <input type="text" id="valuen1" name="first" />
                <!-- <input type="text" id="valuen2" name="second" /> -->
                <input type="submit" value="fibbonacci" name="fibbonacci" />
            </form>
        </div>

        <div id="cartoon1" style="display: none">
            <form action="">
                <input type="text" id="valuen1" name="first" />
                <!-- <input type="text" id="valuen2" name="second" /> -->
                <input type="submit" value="cartoon" name="cartoon" />
            </form>
        </div>

        <div id="Voting1" style="display: none">
            <form action="">
                <input type="text" id="valuen1" name="first" />
                <!-- <input type="text" id="valuen2" name="second" /> -->
                <input type="submit" value="voting" name="voting" />
            </form>
        </div>

        <div id="LeapYear1" style="display: none">
            <form action="">
                <input type="text" id="valuen1" name="first" />
                <!-- <input type="text" id="valuen2" name="second" /> -->
                <input type="submit" value="LeapYear" name="LeapYear" />
            </form>
        </div>

        <div id="CheckEvenOdd1" style="display: none">
            <form action="">
                <input type="text" id="valuen1" name="first" />
                <!-- <input type="text" id="valuen2" name="second" /> -->
                <input type="submit" value="checkEvenOdd" name="checkEvenOdd" />
            </form>
        </div>

        <div id="HCF1" style="display: none">
            <form action="">
                <input type="text" id="valuen1" name="first" />
                <input type="text" id="valuen2" name="second" />
                <input type="submit" value="hcf" name="hcf" />
            </form>
        </div>

        <div id="Reverse1" style="display: none">
            <form action="">
                <input type="text" id="valuen1" name="first" />
                <!-- <input type="text" id="valuen2" name="second" /> -->
                <input type="submit" value="reverse" name="reverse" />
            </form>
        </div>

        <div id="PrimeNumber1" style="display: none">
            <form action="">
                <input type="text" id="valuen1" name="first" />
                <!-- <input type="text" id="valuen2" name="second" /> -->
                <input type="submit" value="primeNumber" name="primeNumber" />
            </form>
        </div>

        <script>
            function power() {
                power1.style.display = "inline";
                PrimeNumber1.style.display = "none";
                factorial1.style.display = "none";
                // power1.style.display = "none";
                Reverse1.style.display = "none";
                HCF1.style.display = "none";
                CheckEvenOdd1.style.display = "none";
                LeapYear1.style.display = "none";
                Voting1.style.display = "none";
                cartoon1.style.display = "none";
                fibbonacci1.style.display = "none";
                Cube1.style.display = "none";
            }
            function factorial() {
                factorial1.style.display = "inline";
                PrimeNumber1.style.display = "none";
                // factorial1.style.display = "none";
                power1.style.display = "none";
                Reverse1.style.display = "none";
                HCF1.style.display = "none";
                CheckEvenOdd1.style.display = "none";
                LeapYear1.style.display = "none";
                Voting1.style.display = "none";
                cartoon1.style.display = "none";
                fibbonacci1.style.display = "none";
                Cube1.style.display = "none";
            }
            function cube() {
                Cube1.style.display = "inline";
                PrimeNumber1.style.display = "none";
                factorial1.style.display = "none";
                power1.style.display = "none";
                Reverse1.style.display = "none";
                HCF1.style.display = "none";
                CheckEvenOdd1.style.display = "none";
                LeapYear1.style.display = "none";
                Voting1.style.display = "none";
                cartoon1.style.display = "none";
                fibbonacci1.style.display = "none";
                // Cube1.style.display = "none";
            }
            function fibbonacci() {
                fibbonacci1.style.display = "inline";
                PrimeNumber1.style.display = "none";
                factorial1.style.display = "none";
                power1.style.display = "none";
                Reverse1.style.display = "none";
                HCF1.style.display = "none";
                CheckEvenOdd1.style.display = "none";
                LeapYear1.style.display = "none";
                Voting1.style.display = "none";
                cartoon1.style.display = "none";
                // fibbonacci1.style.display = "none";
                Cube1.style.display = "none";
            }
            function cartoon() {
                cartoon1.style.display = "inline";
                PrimeNumber1.style.display = "none";
                factorial1.style.display = "none";
                power1.style.display = "none";
                Reverse1.style.display = "none";
                HCF1.style.display = "none";
                CheckEvenOdd1.style.display = "none";
                LeapYear1.style.display = "none";
                Voting1.style.display = "none";
                // cartoon1.style.display = "none";
                fibbonacci1.style.display = "none";
                Cube1.style.display = "none";
            }
            function voting() {
                Voting1.style.display = "inline";
                PrimeNumber1.style.display = "none";
                factorial1.style.display = "none";
                power1.style.display = "none";
                Reverse1.style.display = "none";
                HCF1.style.display = "none";
                CheckEvenOdd1.style.display = "none";
                LeapYear1.style.display = "none";
                // Voting1.style.display = "none";
                cartoon1.style.display = "none";
                fibbonacci1.style.display = "none";
                Cube1.style.display = "none";
            }

            function leapyear() {
                LeapYear1.style.display = "inline";
                PrimeNumber1.style.display = "none";
                factorial1.style.display = "none";
                power1.style.display = "none";
                Reverse1.style.display = "none";
                HCF1.style.display = "none";
                CheckEvenOdd1.style.display = "none";
                // LeapYear1.style.display = "none";
                Voting1.style.display = "none";
                cartoon1.style.display = "none";
                fibbonacci1.style.display = "none";
                Cube1.style.display = "none";
            }

            function checkEvenOdd() {
                CheckEvenOdd1.style.display = "inline";
                PrimeNumber1.style.display = "none";
                factorial1.style.display = "none";
                power1.style.display = "none";
                Reverse1.style.display = "none";
                HCF1.style.display = "none";
                // CheckEvenOdd1.style.display = "none";
                LeapYear1.style.display = "none";
                Voting1.style.display = "none";
                cartoon1.style.display = "none";
                fibbonacci1.style.display = "none";
                Cube1.style.display = "none";
            }

            function hcf() {
                HCF1.style.display = "inline";
                PrimeNumber1.style.display = "none";
                factorial1.style.display = "none";
                power1.style.display = "none";
                Reverse1.style.display = "none";
                // HCF1.style.display = "none";
                CheckEvenOdd1.style.display = "none";
                LeapYear1.style.display = "none";
                Voting1.style.display = "none";
                cartoon1.style.display = "none";
                fibbonacci1.style.display = "none";
                Cube1.style.display = "none";
            }

            function reverse() {
                Reverse1.style.display = "inline";
                PrimeNumber1.style.display = "none";
                factorial1.style.display = "none";
                power1.style.display = "none";
                // Reverse1.style.display = "none";
                HCF1.style.display = "none";
                CheckEvenOdd1.style.display = "none";
                LeapYear1.style.display = "none";
                Voting1.style.display = "none";
                cartoon1.style.display = "none";
                fibbonacci1.style.display = "none";
                Cube1.style.display = "none";
            }

            function primeNumber() {
                PrimeNumber1.style.display = "inline";
                factorial1.style.display = "none";
                power1.style.display = "none";
                Reverse1.style.display = "none";
                HCF1.style.display = "none";
                CheckEvenOdd1.style.display = "none";
                LeapYear1.style.display = "none";
                Voting1.style.display = "none";
                cartoon1.style.display = "none";
                fibbonacci1.style.display = "none";
                Cube1.style.display = "none";
            }
        </script>
    </body>
</html>
<% String s = request.getParameter("first"); 
    if (s != null && !s.equals("")) { 
        int a = Integer.parseInt(s); 
        int b= 0;
        if(request.getParameter("cube") != null){
            int result = a*a*a;
            out.print(result);
        } else if (request.getParameter("fibbonacci") != null){ 
            int x=-1,y=1,result =0; 
            for(int i=1;i<=a;i++){ 
                result = x+y;
                x=y;
                y=result;
                out.print(result +" "); 
            }
        }else if(request.getParameter("voting") != null){
            if(a<=18){ 
                out.print("Not eligival for voting"); 
            } else{ 
                out.print(" eligival for voting");
            } 
        } else if(request.getParameter("LeapYear") != null){ 
            if((a%100!=0&&a%4==0)||a%400==0){
                out.print("Leap Year"); 
            } else{ 
                out.print("Normal Year");
            }
        }else if(request.getParameter("checkEvenOdd") != null){
            if(a%2==0){ 
                out.print("Even Number");
            } else{ 
                out.print("Odd Number");
            }
        }
       
         else if(request.getParameter("reverse") != null){
            int result =0;
            while(a>0){ 
                result =(result*10)+(a%10); 
                a/=10; 
            }
            out.println(result);
        } else if(request.getParameter("primeNumber") != null){
            int result =0;
            for(int i=1;i<=a;i++){ 
                if(a%i==0){ 
                    result++;
                } 
            }
            if(result ==2){   
                out.println("prime number"); 
             }else{ 
                out.println("not a prime number"); 
            } 
        } 
       
        else if (request.getParameter("cartoon") != null){
            for(int i=1;i<=a;i++){
                for(int j=1;j<=i;j++){
                    out.print("* "); 
                } 
                out.print("<br>"); 
            }
        } else if (request.getParameter("factsub") != null){
            int fact =1;
            for(int i=1;i<=a;i++){
                fact*=i;
            }
            out.print(fact); 
        }
    }
%>
