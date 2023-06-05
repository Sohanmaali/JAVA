//tabel_sum

import java.util.Scanner;
class TabelSum
{
	public static void main(String[]args)                                  
	{
		int n,i=1,ans,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		do
		{
			ans = n*i;
			sum+=ans;
			if(i<n)
			System.out.print(ans+" + ");
		i++;
		}while(i<=10);
		System.out.println(ans+" = "+sum);
	}
}