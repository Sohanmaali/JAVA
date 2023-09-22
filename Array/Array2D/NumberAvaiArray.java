//Array number Available
import java.util.Scanner;
class Array
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] =new int[5];
		int i;
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		for(i=0;i<a.length;i++)
	    System.out.println("\ta["+i+"]="+a[i]);
	    System.out.print("Scearching Element :");
		int n = sc.nextInt();
		int sam=n;
		boolean b=false;
		for(i=0;i<a.length;i++)
		{
			if(sam==a[i])
			{
				b=true;
			}
		}
			if(b)
			{
				System.out.println("Yes number is Available");
			}
			else
				System.out.println("Not Available");
		
		
		
	}
}