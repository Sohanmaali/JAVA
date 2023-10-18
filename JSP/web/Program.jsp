<%-- Document : Program Created on : 18-Oct-2023, 4:49:13 pm Author : DELL --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>JSP Page</title>
  </head>
  <body>
    <button id="Factorial" onclick="factorial()">Factorial</button>

    <button id="Power" onclick="power()">Power</button>

    <!-- <button onclick="()" id="Calculater" value="Calculater">Calculater</button> -->
    
    <button onclick="cube()" id="Cube" value="Cube">Cube</button>Fibonacci</button>

    <button onclick="cartoon()" id="PreetiCartoon" value="PreetiCartoon">PreetiCartoon</button>

    <button onclick="voting()" id="Voting" value="Voting">Voting</button>
    
    <button onclick="leapyear()" id="LeapYear" value="LeapYear">LeapYear</button>
    
    <button onclick="checkEvenOdd()" id="CheckEvenOdd" value="CheckEvenOdd">CheckEvenOdd</button>
    
    <button onclick="hcf()" id="HCF" value="HCF">HCF</button>
    
    <button onclick="reverse()" id="HCF" value="Reverse">Reverse</button>
    
    <button onclick="primeNumber()" id="HCF" value="PrimeNumber">PrimeNumber</button>
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
        <input type="submit" value="Power" />
      </form>
    </div>

    <div id="Cube1" style="display: none">
      <form action="">
        <input type="text" id="valuen1" name="first" />

        <input type="submit" value="cube" />
      </form>
    </div>

    <div id="fibbonacci1" style="display: none">
      <form action="">
        <input type="text" id="valuen1" name="first" />
        <!-- <input type="text" id="valuen2" name="second" /> -->
        <input type="submit" value="fibbonacci" />
      </form>
    </div>

    <div id="cartoon1" style="display: none">
      <form action="">
        <input type="text" id="valuen1" name="first" />
        <!-- <input type="text" id="valuen2" name="second" /> -->
        <input type="submit" value="cartoon" />
      </form>
    </div>

    <div id="Voting1" style="display: none">
      <form action="">
        <input type="text" id="valuen1" name="first" />
        <!-- <input type="text" id="valuen2" name="second" /> -->
        <input type="submit" value="voting" />
      </form>
    </div>

    <div id="LeapYear1" style="display: none">
      <form action="">
        <input type="text" id="valuen1" name="first" />
        <!-- <input type="text" id="valuen2" name="second" /> -->
        <input type="submit" value="LeapYear" />
      </form>
    </div>

    <div id="CheckEvenOdd1" style="display: none">
      <form action="">
        <input type="text" id="valuen1" name="first" />
        <!-- <input type="text" id="valuen2" name="second" /> -->
        <input type="submit" value="checkEvenOdd" />
      </form>
    </div>

    <div id="HCF1" style="display: none">
      <form action="">
        <input type="text" id="valuen1" name="first" />
        <input type="text" id="valuen2" name="second" />
        <input type="submit" value="hcf" />
      </form>
    </div>

    <div id="Reverse1" style="display: none">
      <form action="">
        <input type="text" id="valuen1" name="first" />
        <!-- <input type="text" id="valuen2" name="second" /> -->
        <input type="submit" value="reverse" />
      </form>
    </div>

    <div id="PrimeNumber1" style="display: none">
      <form action="">
        <input type="text" id="valuen1" name="first" />
        <!-- <input type="text" id="valuen2" name="second" /> -->
        <input type="submit" value="primeNumber" />
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
