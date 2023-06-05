//Base_Area_of_cylinder

import java.lang.String;
import java.lang.System;
import java.util.Scanner;
class ChoiceCy
{
	public static void main(String[]argd)
	{
		int choice;
		float ans,r,v,h;
		Scanner sc = new Scanner(System.in);
		System.out.println("Your choice are \n\t1 for Area of cylinder\n\t2 for Height of cylinder\n\t3 Surface Area of Cylinder\n\t4 later surface of cylinder\n\t5 of Volume of cylinder");
		System.out.println("Enter your choice");
		choice = sc.nextInt();
		
		switch (choice)
		{
			case 1:
				System.out.println("Enter redius of cylinder");
				r = sc.nextFloat();
				System.out.println("Enter volume of cylinder");
				v = sc.nextFloat();
				ans = 3.14f*r*r;
				System.out.println("Area of cylinder" +ans);
			case 2:
				System.out.println("Enter redius of cylinder");
				r = sc.nextFloat();
				System.out.println("Enter volume of cylinder");
				v = sc.nextFloat();
				ans = v/(3.14f*r*r);
				System.out.println("Volume of cylinder" +ans);
			case 3:
				System.out.println("Enter redias of Cylinder");
				r = sc.nextFloat();
				System.out.println("Enter High of Cylinder");
				h = sc.nextFloat();
				ans =(2*3.14f*r*h)+(2*3.14f*r*r);
				System.out.println("Surface Area of Cylinder = "+ans);
			case 4:
				System.out.println("Enter radius of cylinder");
				r = sc.nextFloat();
				System.out.println("Enter hight of cylinder");				
				h = sc.nextFloat();
				ans = 2*3.14f*r*h;
				System.out.println("later surface of cylinder" +ans);
			case 5:
				System.out.println("Enter redius of cylinder");
				r = sc.nextFloat();
				System.out.println("Enter hight of cylinder : ");
				h = sc.nextFloat();
				ans = 3.14f*(r*r)*h;
				System.out.print("Volume of cylinder : " +ans);
		}
	}
}