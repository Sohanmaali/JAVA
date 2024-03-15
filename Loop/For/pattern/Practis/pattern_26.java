/*
 I
 IN
 IND
 INDI
 INDIA
 INDI
 IND
 IN
 I
 

*/
import java.util.Scanner;

class Pattern_26 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    char a[] = { 'I', 'N', 'D', 'I', 'A' };
    int x = 1;
    for (int i = 1; i < a.length << 1; i++) {
      for (int j = 0; j < x; j++) {
        System.out.print(a[j]);
      }
      x = (i < a.length ? ++x : --x);
      System.out.println("");
    }
  }
}
