import java.util.Scanner;
class MyProject
{
	
  public static void main(String[]args)
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Your choice are ");
		System.out.println("\t 1 For Mainu\n\t 2 For Exit");
		choice = sc.nextInt();
		do
		{
			switch(choice)
			{
				case 1:
					System.out.println("Your choice are ");
					System.out.println("\t 3 For Seven Star Hotel\n\t 4 For Five Star Hotel\n\t 5 For Three Star Hotel\n\t 2 For Exit");
					choice = sc.nextInt();
					case 3:
					System.out.println("Your choice are ");
					System.out.println("\t 6 Hotel Bagwan Pelesh \n\t 7 Hotel SiyaRama Pelesh\n\t 8 Hotel Sabariya Pelesh\n\t 2 For Exit\n1 For Mainu");
					choice = sc.nextInt();
					break;
				
				case 2:
					System.exit(0);
				
			}
			
		}while(choice!=2);
	}
}