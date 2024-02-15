public class Compund_Intrest {
     public static void main(String[] args) {
          double p = 6000, r = 9;
          int t = 2;
          double ans = p * (Math.pow((1 + r / 100), t));
          System.out.println("Ans = " + (ans - p));
     }
}
