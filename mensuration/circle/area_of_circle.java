//Area of Circle


import java.util.Scanner;
import java.lang.String;
import java.lang.klSystem;
class AreaOfCircle
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Redius of circle");
		float r = sc.nextFloat();

		float A=3.14f*r*r;

		System.out.println("Area of circle = "+A);
	}
}
