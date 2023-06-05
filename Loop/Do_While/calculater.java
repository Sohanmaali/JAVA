import java.util.Scanner;
class Calculater
{
	public static void main(String[]args)                                  
	{
		int choice;
		double a,b,ans;
		char op;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("your choice are \n\t1 for Addition\n\t2 for substraction\n\t3 for area of multiplaction\n\t4 for division\n\t5 for modulas\n\t6 for Squar\n\t7 for Quabe");
	
			System.out.print("Enter your choice : ");
	
			choice = sc.nextInt();

			switch(choice)
			{
				case 1:
				
					System.out.println("Enter first num");
					a = sc.nextDouble();
					System.out.println("Enter second num");
					b = sc.nextDouble();
					ans = a+b;
					System.out.println("Addition = "+ans);
					break;
				
				case 2:
				
					System.out.println("Enter first num");
					a= sc.nextDouble();
					System.out.println("Enter second num");
					b= sc.nextDouble();
					ans=a-b;
					System.out.println("substraction = "+ans);
					break;
				
				case 3:
			
					System.out.println("Enter first num");
					a = sc.nextDouble();
					System.out.println("Enter second num");
					b = sc.nextDouble();
					ans=a*b;
					System.out.println("multiplaction = "+ans);
					break;
			
				case 4:
			
					System.out.println("Enter first num");
					a = sc.nextDouble();
					System.out.println("Enter second num");
					b= sc.nextDouble();
					ans=a/b;
					System.out.println("Division = "+ans);	
					break;
			
				case 5:
			
					System.out.println("Enter first num");
					a = sc.nextDouble();
					System.out.println("Enter second num");
					b = sc.nextDouble();
					ans =a%b;
					System.out.println("Modual = "+ans);
					break;
			
				case 6:
				
					System.out.print("Enter any num : ");
					a = sc.nextDouble();
					ans =a*a;
					System.out.print("\tsquar = "+ans);
					break;
			
				case 7:
				
					System.out.print("Enter any num : ");
					a = sc.nextDouble();
					ans =a*a*a;
					System.out.print("\tQuabe = "+ans);
			}	
			System.out.print("Do you want to prform anadar operation y/n : ");
			op = sc.next().charAt(0);
	}while(op=='y'||op=='Y');
	}
}