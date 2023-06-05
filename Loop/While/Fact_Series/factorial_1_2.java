
//WAP Fectoriyal Serices sum  
/*
		1!/1 + 2!/2 + 3!/3 + 4!/4 + 5!/5
		1!/1 - 2!/2 + 3!/3 - 4!/4  + 5!/5
		-1!/1 + 2!/2 - 3!/3 + 4!/4 - 5!/5
*/
import java.util.Scanner;
class Factorial_seri1_2
{
	public static void main(String[]args)                                  
	{
		int n,i=1,choice;
		double sum=0,fect=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Your choice are \n\t1 For 1!/1 + 2!/2 + 3!/3 + 4!/4 + 5!/5\n\t2 For 1!/1 - 2!/2 + 3!/3 - 4!/4  + 5!/5 \n\t3 For -1!/1 + 2!/2 - 3!/3 + 4!/4 - 5!/5 ");
		System.out.print("Enter Your Choice : ");
		choice = sc.nextInt();
		switch (choice)
		{
			case 1:
				System.out.println("Enter any num");
				n = sc.nextInt();
		
				while (i<=n)
				{
					fect=fect*i;
			
					sum=sum+(fect/i);
					if(i>1)
					{
						System.out.print(" + ");
					}
					System.out.print(i+"!/"+i);
			
					i++;
				}
				System.out.println(" + !"+n+"/"+n+" = "+sum);
				break;
			case 2:
				System.out.println("Enter any num");
				n = sc.nextInt();
		
				while (i<=n)
				{
					fect*=i;
					if(i%2==0)
					{
						sum = sum - (fect/i);
						System.out.print(" - !"+i+"/"+i);
					}
					else
					{
						sum = sum + (fect/i);
						if(i>1)
							System.out.print(" + ");
						System.out.print(i+"!/"+i);
					}
					i++;
				}
				System.out.println(" = "+sum);
				
				break;
			case 3:
				
				System.out.println("Enter any num");
				n = sc.nextInt();

				while (i<=n)
				{
					fect*=i;
					if(i%2==0)
					{
						sum=sum+(fect/i);
						System.out.print(" - "+i+"!/"+i);
					}
					else
					{
						sum-=fect/i;
						if(i>1)
						{
							System.out.print(" + ");
						}
						System.out.print(i+"!/"+i);
					}
					i++;
				}
				System.out.println(" = "+sum);
				break;
			default :
				System.out.println("Invalide choice !");
		}
	}
}

