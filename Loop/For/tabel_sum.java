import java.util.Scanner;
class TabelSum
{
	public static void main(String[]args)                                  
	{
		int n,i,tab = 0,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		for(i=1;i<=10;i++)
		{
			tab = n * i;
			sum+=tab;
			if(i<10)
				System.out.print(tab+" + ");
			
		}
		System.out.println(tab+" = "+sum);
	}
}
