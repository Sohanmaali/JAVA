
//WAP Fectoriyal Serices sum choice 
import java.util.Scanner;
class  Factorial_seri1_7
{
	public static void main(String[]args)                                  
	{
		int n,i=1,choice,j=2;
		float fect=1,sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Your choice are \n\t1 For 2/1! + 4/2! + 6/3! + 8/4! + 10/5!\n\t2 For 2/1! - 4/2! + 6/3! - 8/4!  + 10/5! \n\t3 For -2/1! + 4/2! - 6/3! + 8/4! + 10/5! ");
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
			
					sum=sum+(j/fect);
					if(i>1)
					{
						System.out.print(" + ");
					}
					System.out.print(j+"/"+i+"!");
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
						sum = sum - (j/fect);
						System.out.print(" -"+j+"/"+i+"!");
					}
					else
					{
						sum = sum + (j/fect);
						if(i>1)
							System.out.print(" + ");
						System.out.print(j+"/"+i+"!");
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
						sum=sum+(j/fect);
						
					}
					else
					{
						sum=sum-(j/fect);
					
						System.out.print(" - ");
						System.out.print(j+"/"+i+"!");
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

