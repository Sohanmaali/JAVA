import java.util.Scanner; 

class Frequency
{
	public void takeElement(Frequency k)
	{
		Scanner sc = new Scanner (System.in);
		int a[] = new int [10];
		
		System.out.println("How many element you want to eneter");
		int n = sc.nextInt();
		
		System.out.println("Enter element of array");
		for(int i = 0; i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("eneter frequency element");
		int x = sc.nextInt();
		System.out.println("Actual array Element are ");
		for(int i = 0; i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		k.frequ(a,n,x);
	}
	public void frequ(int a[],int n,int x)
	{
		int count =1;
		for(int i = 0;i<n;i++)
		{
			if(a[i]!=-1)
				for(int j=i+1;j<n;j++)
			if(a[i]==a[j])
			{
				count++;
				a[i+1]=-1;
			}
		}
		System.out.println("\nFrequency of "+x+" = "+count);
	}
	public static void main(String args[])
	{
		Frequency ob = new Frequency();
		ob.takeElement(ob);
	}
}