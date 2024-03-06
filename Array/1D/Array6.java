//how many time 150<250
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
		a[0]=104;
		a[1]=151;
		a[2]=170;
		a[3]=101;
		a[4]=102;
		for(i=0;i<a.length;i++)
	    System.out.println("\ta["+i+"]="+a[i]);
		int count=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]>150&&a[i]<250)
			
			{
				count++;
			}
		}
			System.out.print(count);
		
		
		
	}
}