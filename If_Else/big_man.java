//Check Elder man
import java.util.Scanner;

class Elder
{
	public static void main(String[]args)
	{
		int ram,mohan,kamal,raj;
	
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter Age of Ram ");
		ram = sc.nextInt();
	
		System.out.println("Enter Age of Mohan ");
		mohan = sc.nextInt();
	
		System.out.println("Enter Age of Kamal ");
		kamal = sc.nextInt();
	
		System.out.println("Enter Age of Raj ");
		raj = sc.nextInt();
		if(ram > mohan)
		{
			if(ram > kamal)
			{
				if(ram > raj)
				{
					System.out.println("Ram is Elder");
				}
				else
				{
					System.out.println("raj is Elder");
				}
			}
			else if(kamal > raj)
				{
					System.out.println("kamal is Elder");
				}
				else
				{
					System.out.println("raj is Elder");
				}
			
	    } 
		else
		{
			
		}
	}
}
