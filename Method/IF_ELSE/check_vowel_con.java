import java.util.Scanner; 

class VowelConso
{
	public void vowelConsonent()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two number ");
		char ch = sc.next().charAt(0);
		
		if(ch=='a')
		{
			System.out.println("Enter cha is vowel");
		}
		if(ch=='e')
		{
			System.out.println("Enter cha is vowel");
		}
		if(ch=='i')
		{
			System.out.println("Enter cha is vowel");
		}
		if(ch=='o')
		{
			System.out.println("Enter cha is vowel");
		}
		if(ch=='u')
		{
			System.out.println("Enter cha is vowel");
		}
		else
		{
			System.out.println("Enter cha is consonent");
		}
	}
	public static void main(String args[])
	{
		VowelConso ob = new VowelConso();
		ob.vowelConsonent();
	}
}
