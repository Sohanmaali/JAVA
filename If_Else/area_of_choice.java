

//Area of choice using If Else


import java.util.Scanner;
class Choice
{
public static void main(String[]args)                                  
{
	int choice;
	float a,b,ans;
  	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your choice \n1 for area of circle\n2 for area of rectangale\n3 for area of trangale");
	
  	 choice = sc.nextInt();

	if(choice==1)
	{
		System.out.println("Enter redius of circle");
		a= sc.nextFloat();
		ans=3.14f*a*a;
		System.out.println("Area of circle = "+ans);
	}
	 else if(choice==2)
	{
		System.out.println("Enter lenth of rectangale");
		a= sc.nextFloat();
		
		System.out.println("Enter width of rectangale");
		b= sc.nextFloat();
		
		ans=a*b;
		System.out.println("Area of rectangale = "+ans);
	}
	else if(choice==3)
	{
		System.out.println("Enter base of trangale");
		a= sc.nextFloat();
		
		System.out.println("Enter hight of trangale");
		b= sc.nextFloat();
		
		ans = (a*b)/2;
		System.out.println("Area of trangale = "+ans);
	}
	else 
	{
	System.out.println("Invalide input");	
	}
}
}