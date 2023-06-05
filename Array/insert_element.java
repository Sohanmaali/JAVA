import java.util.Scanner;
class InsertElement
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		
		System.out.println("How many element you want to enter");
		int n = sc.nextInt();
		int j,i,x;
		System.out.println("Enter element of array");
		
		for( i = 0; i<n; a[i]= sc.nextInt(),i++);
		
		System.out.println("Enter index");
		int index= sc.nextInt();
		
		System.out.println("Enter Value");
		int value= sc.nextInt();
		
		for(i=n;i>=index;i--)
		{
			a[i+1]=a[i];
			
			if(index==i)
			{
				a[index]=value;
			}
		}
		
		System.out.println("New value of array");
		for( i = 0; i<=n;System.out.println(a[i]),i++);
	}
}