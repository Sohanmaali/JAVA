import java.util.Scanner;
class FindNumber
{
	public static void main(String[]args)                                  
	{

		
		Scanner sc = new Scanner(System.in);
		
		int array[]= new int[5];
		
		for(int i=0;i<array.lenght;i++)
		{
			System.out.print("Enter "+i +" num of array : ");
			array[i]= sc.nextInt();
		}
		System.out.print("Enter Find element of array : ");
		int x = sc.nextInt();
		for(int i=0;i<array.lenght;i++)
		{
			if(array[i]==x)
			{
				System.out.println("Element "+x+" found in index = "+i);
			}
		}
	}
}