import java.util.Scanner;
class CheckChar
{
public static void main(String[]args)                                  
{
	char ch;
  	Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter any Char ");
  	 ch = sc.next().charAt(0);
	 
	 if(ch>=47&&ch<=56)
	 {
		System.out.println("Enter charector "+ch+" is Digit ");	
	 }
	else if(ch>='A'&&ch<='Z')
	{
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("Enter charector is vowel");	
		}
		else
		{
			System.out.println("Enter charector "+ch+" is upper case Consonent ");	
		}
	}
	else if(ch>='a'&&ch<='z')
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("Enter charector "+ch+" is lower case Vowel ");	
		}
		else
		{
			System.out.println("Enter charector is "+ch+" Lower case Consonent ");	
		}
	}		
	else
	{
		System.out.println("Enter charector "+ch+" is Special Charectore");	
	}
}
}