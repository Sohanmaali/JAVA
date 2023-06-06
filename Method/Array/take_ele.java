import java.util.Scanner; 

class Test
{
	public void takeElement()
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
		System.out.println("Element of Array");
		for(int i = 0; i<n;i++)
		{
			System.out.println(a[i]+" ");
		}
		
	}
	public static void main(String args[])
	{
		Test ob = new Test();
		ob.takeElement();
	}
}