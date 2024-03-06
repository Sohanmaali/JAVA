import java.util.Scanner;
class Test2
{
	public static void main(String args[])
	{ 
	    Scanner sc= new Scanner (System.in);
		 int i ,t=0;
		System.out.println("How many element you want to enter:");
		int n = sc.nextInt();
		int a[]= new int[n];
		
		System.out.println("Enter element in array:");
	    for( i=0;i<n;i++)
	    a[i]= sc.nextInt(); 
	     
	    int min=a[0];
	    System.out.println("\tArray element are:");		
		for( i=0;i<n;i++)
		{
			if(min<=a[i])
							
			min=a[i];
		}
		System.out.println("max element is  "+min);
		int min2 = a[0];
		int index=0;
		for(i=1 ; i<n ; i++)
	    {
           	if(min2>=a[i])			
			min2=a[i];
		}
		System.out.println(" first minimum element is  "+min2);			
	    for(i=0 ; i<n ; i++)
		{
			if(min>a[i]&&min2<a[i])
			{
				min = a[i];
			}
		}
		  System.out.println(" second minimum element is  "+min);
	}		   
}