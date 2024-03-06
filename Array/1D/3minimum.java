import java.util.Scanner;
class Third
{
	public static void main(String arga[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the length");
		int n=sc.nextInt();
		int a[] =new int[5];
		int i,min =a[0],min2 =a[0],min3 =a[0],index=0;
        for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Element are:-");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		 min =a[0];
		 index=0;
        for(i=1;i<n;i++)
		{
			if(min>a[i])
			{
				min=a[i];
				index=i;
			}
		}
		System.out.println("minimum ="+"a["+index+"]="+min);
		index=0;
		for(i=1;i<n;i++)
		{
			if(min2>a[i]&&min>a[i])
			{
				min2=a[i];
				index=i;
			}
		}
		System.out.println("second minimum ="+"a["+index+"]="+min2);
		/*index=0;
		for(i=1;i<n;i++)
		{
			if(a[i]<max2&&a[i]>max3&&max>a[i])
			{
				max3=a[i];
				index=i;
			}
		}
		System.out.println("a["+index+"]="+max3);*/
	}
}