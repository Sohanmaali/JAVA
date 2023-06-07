import java.util.Scanner; 

class ElementSum
{
	public int takeElement(ElementSum k)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int [5];
		int n = 5;
		System.out.println("Enter element of arrray");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int x = k.elementSum(a,n);
		return x;
	}
	public int elementSum(int b[],int n)
	{
		int sum=0;
		System.out.print("Array elements");
		for(int i=0;i<n;i++)
		{
			System.out.print(b[i]+" ");
			sum+=b[i];
		}
		
		return sum;
	} 
	public static void main(String args[])
	{
		ElementSum ob = new ElementSum();
		System.out.println("\nsum = "+ob.takeElement(ob));
	}
}