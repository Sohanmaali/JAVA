
//program to check whether a triangle is Equilateral, Isosceles or Scalene

import java.util.Scanner;
class Trangale
{
	public static void main(String[]args)                                  
	{
		float side1,side2,side3;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter three sides of triangle: ");
		side1 = sc.nextFloat();
		side2 = sc.nextFloat();
		side3 = sc.nextFloat();
	 
		if(side1==side2 && side2==side3) 
		{
			System.out.println("Equilateral triangle.");
		}
		else if(side1==side2 || side1==side3 || side2==side3) 
		{
			System.out.println("Isosceles triangle.");
		}
		else 
		{
		System.out.println("Scalene triangle.");
		}
	}
}