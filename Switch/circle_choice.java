

////Area of choice using Swatch case

import java.util.Scanner;
class CircleChoice
{
	public static void main(String[]args)                                  
	{
		int choice;
		float r,ans;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("your choice are \n\t1 for area of circle\n\t2 Diameter for of circle\n\t3  for circumference of circle");
		System.out.print("Enter your choice : "); 
		choice = sc.nextInt();
		switch (choice)
		{
			case 1:
			{
				System.out.print("Enter redius of circle");
				r = sc.nextFloat();
				ans = 3.14f*r*r;
				System.out.print("Area of circle = "+ans);
				break;
			}
			case 2:
			{
				System.out.print("Enter redius of circle rectangle");
				r = sc.nextFloat();
				ans = 2*r;
				System.out.print("Diameter for of circle = "+ans);
				break;
			}
			case 3:
			{
				System.out.print("Enter redius of circle : ");
				r = sc.nextFloat();
				ans = 2*3.14f*r;
				System.out.print("Diameter for of circle = "+ans);
				break;
			}
			default :
				System.out.print("Invalise choise!");
		}
	}
}