
//WAP Fectoriyal Serices sum choice 
import java.util.Scanner;
class  Factorial_seri1_6
{
	public static void main(String[]args)                                  
	{
		int n,i=1,choice,j=2;
		float fect=1,sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Your choice are \n\t1 For 1!/2 + 2!/4 + 3!/6 + 4!/8 + 5!/10\n\t2 For 1!/2 - 2!/4 + 3!/6 - 4!/8  + 5!/10 \n\t3 For -1!/2 + 2!/4 - 3!/6 + 4!/8 + 5!/10 ");
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
			
					sum=sum+(fect/j);
					if(i>1)
					{
						System.out.print(" + ");
					}
					System.out.print(i+"!/"+j);
					i++;
					j=j+2;;
				}
				System.out.println(" = "+sum);
				break;
				
			case 2:
				System.out.println("Enter any num");
				n = sc.nextInt();
		
				while (i<=n)
				{
					fect*=i;
					if(i%2==0)
					{
						sum = sum - (fect/j);
						System.out.print(" -"+i+"!/"+j);
					}
					else
					{
						sum = sum + (fect/j);
						if(i>1)
							System.out.print(" + ");
						System.out.print(i+"!/"+j);
					}
					i++;
					j = j+2;
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
						sum=sum+(fect/j);
						System.out.print(" + "+i+"!/"+j);
					}
					else
					{
						sum=sum-(fect/j);
				
						System.out.print(" - ");
				
						System.out.print(i+"!/"+j);
					}

					i++;
					j=j+2;
				}
				System.out.println(" = "+sum);
			
				break;
			default :
			System.out.println("Invalide choice !");
		}
	}
}

