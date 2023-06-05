import java.util.Scanner;
class Division
{
public static void main(String[]args)                                  
{
	int py,ch,math,total;
	double per;
  	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter marks of phycis");
  	 py = sc.nextInt();
	 
	 System.out.println("Enter marks of chemistry");
  	 ch = sc.nextInt();
	 
	 System.out.println("Enter marks of mathes");
  	 math = sc.nextInt();
	 
		if(py<33&&ch<33&&math<33)
		{		
			System.out.println("Fail in All sub");
		}
		else if((py<33&&ch<33)||(py<33&&math<33)||(ch<33&&math<33))
		{		
			if(py<33&&ch<33)
			{
				System.out.println("Fail in physics,chemistry");
			}
			else if(py<33&&math<33)
			{
				System.out.println("Fail in physics,mathes");
			}
			else if(ch<33&&math<33)
			{
				System.out.println("Fail in chemistry,mathes");
			}
		}
		else if(py<33||ch<33||math<33)
		{
			if(py<33)
			{
				System.out.println("Fail in physics");
			}
			else if(ch<33)
			{
				System.out.println("Fail in chemistry");
			}
			else
			{
				System.out.println("Fail in mathes");
			}
		}
}
}