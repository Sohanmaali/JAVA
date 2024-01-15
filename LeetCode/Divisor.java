public class Divisor {
     public int divide(int dividend, int divisor) {

          return dividend / divisor;
     }

     public static void main(String[] args) {
          Divisor d = new Divisor();
          System.out.println(d.divide(-2147483648, -1));
     }
     // public static int returnNegativeValue(int inputValue) {
     // return -inputValue;
     // }

     // public static void main(String[] args) {
     // int positiveValue = 42;
     // int negativeValue = returnNegativeValue(positiveValue);

     // System.out.println("Original value: " + positiveValue);
     // System.out.println("Negative value: " + negativeValue);
     // }
}