import java.util.Scanner;
class DigitToWord
{
public static void main(String[]args)                                  
{
	int choice;
  	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter any num 0-9");
  	 choice = sc.nextInt();
	 switch (choice)
	 {
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOURE");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		case 6:
			System.out.println("SIX");
			break;
		case 7:
			System.out.println("SEVEN");
			break;
		case 8:	
			System.out.println("EIGHT");
			break;
		case 9:
			System.out.println("NINE");
			break;
		case 0:
			System.out.println("ZERO");
			break;
		default:
	
		System.out.println("INVALIDE INPUT !");
	}								
	}
}
