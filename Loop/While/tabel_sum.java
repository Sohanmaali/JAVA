import java.util.Scanner;
class TabelSum
{
	public static void main(String[]args)                                  
	{
		int n,i=1,tab = 0,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		while (i<=10)
		{
			tab = n * i;
			sum+=tab;
			if(i<10)
				System.out.print(tab+" + ");
			i++;
		}
		System.out.println(tab+" = "+sum);
	}
}
