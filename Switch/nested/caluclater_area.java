import java.util.Scanner;
class ClcArea
{
	public static void main(String[]args)                                  
	{
		int choice,ch1;
		double a,b,ans;
		char op;
		Scanner sc = new Scanner(System.in);
		System.out.println("Your choice are\n\t1 for calculater\n\t2 for area");
		System.out.print("Enter your choice : ");
	
		choice = sc.nextInt();
		
		switch(choice)
		{
			case 1:
				System.out.println("\tyour choice are \n\t\t+ for Addition\n\t\t- for substraction\n\t\t* for area of multiplaction\n\t\t/ for division\n\t\t% for modulas");
	
				Loop:
				System.out.print("Enter your choice : ");
				
				op = sc.next().charAt(0);

				switch(op)
				{
					case '+':
			
						System.out.println("Enter first num");
						a = sc.nextDouble();
						System.out.println("Enter second num");
						b = sc.nextDouble();
						ans = a+b;
						System.out.println("Addition = "+ans);
						if(ans>0)
						 goto Loop ;
			
					case '-':
			
						System.out.println("Enter first num");
						a= sc.nextDouble();
						System.out.println("Enter second num");
						b= sc.nextDouble();
						ans=a-b;
						System.out.println("substraction = "+ans);
						break;
			
					case '*':
				
						System.out.println("Enter first num");
						a = sc.nextDouble();
						System.out.println("Enter second num");
						b = sc.nextDouble();
						ans=a*b;
						System.out.println("multiplaction = "+ans);
						break;
				
					case '/':
				
						System.out.println("Enter first num");
						a = sc.nextDouble();
						System.out.println("Enter second num");
						b= sc.nextDouble();
						ans=a/b;
						System.out.println("Division = "+ans);	
						break;
			
					case '%':
			
						System.out.println("Enter first num");
						a = sc.nextDouble();
						System.out.println("Enter second num");
						b = sc.nextDouble();
						ans =a%b;
						System.out.println("Modual = "+ans);
				}
				break;
			case 2:
			
				System.out.println("\tyour choice are \n\t\t1 for area of circle\n\t\t2 for area of rectangale\n\t\t3 for area of trangale");
	
				ch1 = sc.nextInt();
				switch (ch1)
				{
					case 1:
				
						System.out.println("Enter redius of circle");
						a = sc.nextFloat();
						ans = 3.14f*a*a;
						System.out.println("Area of circle = "+ans);
						break;
			
					case 2:
			
						System.out.println("Enter lenth of rectangale");
						a = sc.nextFloat();
						System.out.println("Enter width of rectangale");
						b = sc.nextFloat();
						ans = a*b;
						System.out.println("Area of rectangale = "+ans);
						break;
			
					case 3:
			
						System.out.println("Enter base of trangale");
						a = sc.nextFloat();
						System.out.println("Enter hight of trangale");
						b = sc.nextFloat();
						ans = (a*b)/2;
						System.out.println("Area of trangale = "+ans);
						break;
				}
				default :
				System.out.println("Invalide  Input ");
		}
	}
	
}

