//Even odd
import java.util.Scanner;
class Array
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array length:");
		int n = sc.nextInt();
		System.out.print("Array Element");
		int a[] =new int[5];
		
		
		int i;
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		for(i=0;i<a.length;i++)
	    System.out.println("\ta["+i+"]="+a[i]);
		int even=0,odd=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even++;
			}
			else 
			 odd++;
		}
         System.out.println("even="+even);
		  System.out.println("odd="+odd);
	}
}