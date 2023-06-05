


//WAP to squr of first n netural num


import java.util.Scanner;
class SqurSum
{
	public static void main(String[]args)                                  
	{
		int n,i=1,sum=0,num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		System.out.println("First "+n+" Squr num Sum");
		while (i<=n)
		{
			num = i*i;
			sum = sum+num;
			if(i<n)
			{
				System.out.print(num+" + ");
			}
			i++;			
		}
		System.out.print(num +" = " + sum);
	}
}
