
import java.util.Scanner;
class Reverse
{
	int j=0;
	int a[] = new int [20];
	public void reverse(int a[],int n)
	{
		if(n/2>=1)
		{	int temp = a[j];
			a[j]=a[n];
			a[n] = temp;
			j++;
			this.reverse(a,n-1);
		}	
	}
	public void takeElement()
	{
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("How many element you want to eneter");
		int n = sc.nextInt();
		//j=n;
		System.out.println("Enter element of array");
		for(int i = 0; i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		this.reverse(a,n-1);
		
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
