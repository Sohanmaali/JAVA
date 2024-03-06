import java.util.*;
class Binarysearch
{
	public static void main(String args[])
    {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter  array length");
		int n=sc.nextInt();
		System.out.println("enter array elements");	  
		int a[] =new int[10];
		int i;
		System.out.println("actual Array elements are");
		for(i=0;i<n;i++)
		{  
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the itemto be Search");
		int item = sc.nextInt();
		
		Array ob = new Array();
		ob.binarysearch(a,item,n);
	}
	public void binarysearch(int b[],int item,1int n)
	{
		int beg,mid,end,found=0;
		beg=0;
		end = n-1;
		for(int i=0;i<n;i++)
		{
			mid = (beg+end)/2;
			if(item==b[mid])
			{
				found++;
				break;
			}
			else
			{
					if(item>mid)
					{
						beg=mid+1;
					}
					else
					{
						end =mid-1;
						
					}
			}
		}
		if(found!=0)
		{
			System.out.println("Element is present in Arrays");
			
		}
		else
		{
			System.out.println("Element is not present in Arrays");
		}
		
	}
}