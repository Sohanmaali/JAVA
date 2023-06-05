
//Even odd serice


import java.util.Scanner;
class EOserice
{
	public static void main(String[]args)                                  
	{
		int n,i=1,esum=0,osum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		System.out.println("First "+n+" even odd num serice and us sum");
		while (i<=n)
		{
			if(i%2==0)
			{
				esum+=i;
				System.out.print(i+" ");
			}
			i++;
		}
		i=1;
		System.out.println(" = "+esum);
		while (i<=n)
		{
			if(i%2!=0)
			{
				osum+=i;
				System.out.print(i+" ");
			}
			i++;
		
		}
		System.out.println(" = "+osum);
		
	}
}
