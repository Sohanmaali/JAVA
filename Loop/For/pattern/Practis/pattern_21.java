/*
      1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1
*/
import java.util.Scanner;

class Pattern_21 {

  // Pascle trangle
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any num");
    int row = sc.nextInt();
    int ans;
    for (int i = 0; i < row; i++) {
      ans = 1;
      for (int j = 0; j <= row - i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j <= i; j++) {
        System.out.print(ans + " ");
        ans = ans * (i - j) / (j + 1);
      }
      System.out.println();
    }
    /* for(int i=0;i<row;i++)
		{
			ans = 1;
			
			for(int j=0;j<=i;j++)
			{
				if(row-i+1&&j<=row+1) 
				{
				System.out.print(ans+" ");
				ans = ans*(i-j)/(j+1);
				}				
			}
			System.out.println();
		} */
  }
}
