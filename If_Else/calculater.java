import java.util.Scanner;
class Calculater
{
	public static void main(String[]args)                                  
	{
		int choice;
		double a,b,ans;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("your choice are \n\t1 for Addition\n\t2 for substraction\n\t3 for area of multiplaction\n\t4 for division\n\t5 for modulas\n\t6 for Squar\n\t7 for Quabe");
	
		System.out.print("Enter your choice : ");
		choice = sc.nextInt();

		if(choice==1)
		{
			System.out.print("Enter first num : ");
			a = sc.nextDouble();
			System.out.print("Enter second num : ");
			b = sc.nextDouble();
			ans = a+b;
			System.out.print("\tAddition = "+ans);
		}
		else if(choice==2)
		{
			System.out.print("Enter first num : ");
			a= sc.nextDouble();
			System.out.print("Enter second num : ");
			b= sc.nextDouble();
			ans=a-b;
			System.out.print("\tsubstraction = "+ans);
		}
		else if(choice==3)
		{
			System.out.print("Enter first num : ");
			a = sc.nextDouble();
			System.out.print("Enter second num : ");
			b = sc.nextDouble();
			ans=a*b;
			System.out.print("\tmultiplaction = "+ans);
		}
		else if(choice==4)
		{
			System.out.print("Enter first num : ");
			a = sc.nextDouble();
			System.out.print("Enter second num : ");
			b= sc.nextDouble();
			ans=a/b;
			System.out.print("\tDivision = "+ans);	
		}
		else if(choice==5)
		{
			System.out.print("Enter first num : ");
			a = sc.nextDouble();
			System.out.print("Enter second num : ");
			b = sc.nextDouble();
			ans =a%b;
			System.out.print("\tModual = "+ans);
		}
		else if(choice==6)
		{
			System.out.print("Enter any num : ");
			a = sc.nextDouble();
			ans =a*a;
			System.out.print("\tsquar = "+ans);
		}
		else if(choice==7)
		{
			System.out.print("Enter any num : ");
			a = sc.nextDouble();
			ans =a*a*a;
			System.out.print("\tQuabe = "+ans);
		}
		else
		{
			System.out.println("Invalide choice");
		}
	}
}