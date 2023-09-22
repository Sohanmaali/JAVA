import java.util.Scanner;
class Array
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array length:");
		int n = sc.nextInt();
		int a[] =new int[10];
		System.out.print("Enter the element of the occur");
		int i,j;
		for(i=0;i<n;i++)
		{
		  a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
		  System.out.println(a[i]);
		}
		
		int min=0,pos=0;
		for( i=0;i<n;i++)
		{ 
            min = a[i];
			pos = i;
		    for(j=i+1;j<n;j++)
			{
			  if(min>a[j])
			  {
				 min =a[j]; 
				 pos = j;
			  }
			
			}
		a[pos]=a[i];
		a[i]=min;
		System.out.println("\ta["+i+"]="+a[i]); 
		}
		
	}
}