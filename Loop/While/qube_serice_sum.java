

//WAP to Qube of first n num sum
import java.util.Scanner;
class QubeSum
{
	public static void main (String[]args)
	{
		int n, i=1,qube=0,sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		while(i<=n)
		{
			qube = i*i*i;
			sum+=qube;
			if(i<n)
			{
				System.out.print(qube+" + ");
			}
			i++;
		}
		System.out.println(qube+" = "+sum);
	}
}