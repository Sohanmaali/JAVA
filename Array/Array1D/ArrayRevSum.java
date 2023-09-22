import java.util.Scanner;
class Array
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array length:");
		int n = sc.nextInt();
		System.out.println("Array Element");
		int a[] =new int[10];
		int i,j,k,sum=0;
		
		for( i=0;i<n;i++)
		a[i]=sc.nextInt();
		System.out.println("Actual Array:");
	    for(j=0;j<n/2;j++)
		{
			int tem =a[j];
			a[j] = a[n-j-1];
			a[n-j-1]=tem;
		}
		for(i=0;i<n;i++)
	    System.out.println("\ta["+i+"]="+a[i]);
		for(k=0;k<n;k++)
		{
			sum = a[i]+a[j];
			System.out.println(sum);
		}
	}
}
class Abc 
{
	public static void main(String args[])
	{
		int temp=0,i;
		int a[ ] =new int [5];
		a[0]=9;
		a[1]=5;
		a[2]=8;
		a[3]=6;
		a[4]=7;
		for(i=0;i<a.length/2;i++)
		{
			temp = a[i];
		    a[i] =a[a.length-i-1];
			a[a.length-i-1]=temp;
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}