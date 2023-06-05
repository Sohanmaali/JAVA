import java.util.Scanner;
class CheckCon
{
	public static void main(String[]args)
	{
		char ch;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any alfabate ");
		ch=sc.next().charAt(0);
		switch (ch)
		{
			case 'A':
			
				System.out.print("Enter alfabate is Vowel ");
				break;
			
			case 'E':
			
				System.out.print("Enter alfabate is Vowel ");
				break;
			
			case 'I':
			
				System.out.print("Enter alfabate is Vowel ");
				break;
			
			case 'O':
			
				System.out.print("Enter alfabate is Vowel ");
				break;
			
			case 'U':
			
				System.out.print("Enter alfabate is Vowel ");
				break;
			
			default:
			
				System.out.print("Enter alfabate is C ");
			
		}	
	}
}