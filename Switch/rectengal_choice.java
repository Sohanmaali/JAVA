
//not complite
import java.lang.String;
import java.lang.System;
import java.util.Scanner;
class ChoiceCy
{
	public static void main(String[]argd)
	{
		int choice;
		float ans,l,w;
		Scanner sc = new Scanner(System.in);
		System.out.println("Your choice are \n\t1 perimeter of rectangle\n\t2 length of rectangle\n\t3 Circuference of rectengale\n\t4 width of rectangle\n\tArea Of Rectengal");
		System.out.println("Enter your choice");
		choice = sc.nextInt();
		
		switch (choice)
		{
			case 1:
				System.out.println("Enter lenth of rectangle");
				l = sc.nextFloat();
				System.out.println("Enter width of rectangle");
				w = sc.nextFloat();
				ans=l*w;
				System.out.println("perimeter of rectangle "+ans);
				
			case 2:
				System.out.println("Enter redias of Cylinder");
				r = sc.nextFloat();
				System.out.println("Enter High of Cylinder");
				h = sc.nextFloat();
				ans =(2*3.14f*r*h)+(2*3.14f*r*r);
				System.out.println("Surface Area of Cylinder = "+ans);
			case 3:
				System.out.println("Enter radius of cylinder");
				r = sc.nextFloat();
				System.out.println("Enter hight of cylinder");				
				h = sc.nextFloat();
				ans = 2*3.14f*r*h;
				System.out.println("later surface of cylinder" +ans);
			case 4:
				System.out.println("Enter redius of cylinder");
				r = sc.nextFloat();
				System.out.println("Enter hight of cylinder : ");
				h = sc.nextFloat();
				ans = 3.14f*(r*r)*h;
				System.out.print("Volume of cylinder : " +ans);
		}
	}
}