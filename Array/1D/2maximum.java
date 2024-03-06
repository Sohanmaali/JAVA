import java.util.Scanner;
class Third
{
	public static void main(String arga[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the length");
		int n=sc.nextInt();
		int a[] =new int[5];
		int i;
        for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Element are:-");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		int max =a[0];
		int index=0;
        for(i=1;i<n;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				index=i;
			}
		}
		System.out.println("a["+index+"]="+max);
		int max2 =a[0];
		index=0;
		for(i=1;i<n;i++)
		{
			if(max2<a[i]&&max>a[i])
			{
				max2=a[i];
				index=i;
			}
		}
		System.out.println("a["+index+"]="+max2);
		
	}
}