
import java.util.Scanner;
class Test
{
  public static void main(String[]args)
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of student");
	
	int choice = sc.nextInt();
	boolean flag= false;
	do
	{
		switch(choice)
		{
			case 1:
				System.out.println("\t 5 For SOHAN \t\t\t 3 For KAPIL \t\t\t 4 For VINOD \t\t\t 1 For Meanu \t\t\t 2 For Exit");
				choice = sc.nextInt();
				flag =false;
				break;
			case 2:
				//System.exit(0);
		}
		switch(choice)
		{
			case 3:
				System.out.println("KAPIL");
				System.out.println("1 For Meanu \t\t\t 2 For Exit");
				choice = sc.nextInt();
				flag =false;
				break;
				
				case 5:
				System.out.println("SOHAN");
				System.out.println("1 For Meanu \t\t\t 2 For Exit");
				choice = sc.nextInt();
				flag =false;
				break;
				
			case 4:
				System.out.println("VINOD");
				System.out.println("1 For Meanu \t\t\t 2 For Exit");
				choice = sc.nextInt();
				flag =false;
				break;
		}
		
	}while(flag);
	System.out.println("hello Sohan........");
  }
}