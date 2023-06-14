
import java.util.Scanner;
class Reverse
{
	int j=0;
	public int[] reverse(int a[],int n)
	{
		int min=a[n];
		if(n>=1)
		{	int temp = a[j];
			a[j]=a[n-1];
			a[n-1] = temp;
			a = this.reverse(a,n-1);
			return a;
		}	
		return a;	
	}
	public void takeElement()
	{
		Scanner sc = new Scanner (System.in);
		int a[] = new int [20];
		
		System.out.println("How many element you want to eneter");
		int n = sc.nextInt();
		
		System.out.println("Enter element of array");
		for(int i = 0; i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		a=this.reverse(a,n/2);
		
		System.out.println("Reverse of array");
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		Reverse ob = new Reverse();
		ob.takeElement();	
	}
}		
