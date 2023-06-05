


//Check whether a number is positive, negative or zero using a switch case.


import java.util.Scanner;
class Convert
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		char ch,cha;
		int num;
		
		System.out.println("Enter any Alfabate charector ");
		ch = sc.next().charAt(0);
		
		num = (int)ch;
		
		int ans = ((ch>=65&&ch<=90)? 1:(ch>=97&&ch<=122)?2:3);
		
		switch(ans)
		{
			case 1:
			
				num=num+32;
				cha = (char)num;
				System.out.println("Lower case of "+ch+" = "+cha);
				
				break;
				
			case 2:
			
				num=num-32;
				cha = (char)num;
				System.out.println("Upper case of "+ch+" = "+cha);
				
				break;
				
			default:
			 
				System.out.println("Invalide input");
		}
	}
}
