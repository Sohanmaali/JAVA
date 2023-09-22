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
		
		int m=0,temp=0;
		for( i=0;i<n;i++)
		{ 
            m=i;
		    for(j=i+1;j<n;j++)
			{
			  if(a[m]<a[j])
			  {
				 m=j; 
			  }
			
			    temp=a[m];
				a[m]=a[j];
				a[j]=temp;
			}
		}
		
		for(i=0;i<n;i++)
		System.out.println("\ta["+i+"]="+a[i]); 
	}
}