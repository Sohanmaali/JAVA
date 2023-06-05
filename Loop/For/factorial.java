
// Fectorial
import java.util.Scanner;
class Factoriyal
{
  public static void main(String[]args)
	{
		int n=5,fact,i;
		Scanner sc = new Scanner(System.in);
		for( i=1,fact=1; i<=n;fact*=i,i++);
			//fact*=i;
		System.out.println("Fact = "+fact);
	}
}		
