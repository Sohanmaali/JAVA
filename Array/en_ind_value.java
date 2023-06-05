import java.util.Scanner;
class EnIndeValue
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("How many element you want to enter");
		int n = sc.nextInt();
	
		System.out.println("Enter element of array");
		
		for(int i = 0; i<n; a[i]= sc.nextInt(),i++);
		
		for(int i=0;i<n;a[i]+=5,i+=2);
		
		System.out.println("New value of array");
		for(int i = 0; i<n;System.out.println(a[i]),i++);
	}
}