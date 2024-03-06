import java.util.Scanner;
class ShortArray
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[6];
		
		System.out.println("Enter element of array ");
		for(int i=0;i<a.length;a[i] = sc.nextInt(),i++);
		
		System.out.println("");
		
		System.out.println("How do you want to Short the array :");
		
		System.out.println("\t1 for Asending Order\n\t2 for disending order");
		
		int choice = sc.nextInt();
		int temp;
		switch(choice)
		{
			case 1:
				for(int i=0;i<a.length;i++)
				{
					for(int j = i+1;j<a.length;j++)
					{
						if(a[i]>a[j])
						{
							temp = a[i];
							a[i] = a[j];
							a[j] = temp;
						}
					}
				}
				for(int i=0;i<a.length;System.out.println(a[i]),i++);
				break;
				
			case 2:
				for(int i=0;i<a.length;i++)
				{
					for(int j = i+1;j<a.length;j++)
					{
						if(a[i]<a[j])
						{
							temp = a[i];
							a[i] = a[j];
							a[j] = temp;
						}
					}
				}
				for(int i=0;i<a.length;System.out.println(a[i]),i++);
				break;
		}
	}
}