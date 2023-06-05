
import java.util.Scanner; 
class Convert
{ 
 public static int convertBainari(int a)
 {
	 int rem,bai=0,i=1;
	 while(a>0)
	 {
		rem = a%2;
		bai=bai+rem*i;
		i*=10;
		a/=2;
	 }
	 return bai;
 }
 public static int convertOctal(int a)
 {
	 int rem,oct=0,i=1;
	 while(a>0)
	{
		rem = a%8;
		oct=oct+rem*i;
		i*=10;
		a/=8;
	}
	return oct;
 }

	public static void main(String[]args)
	{
	
		int con,a,choice;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Your choice are \n\t1 For Decimal to bainari convert\n\t2 For Decimal to Octal convert");
		choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Enter any number ");
				a = sc.nextInt();  
				con = convertBainari(a);
				System.out.println("Decimal to bainari = "+con);	
			break;
			case 2:
				System.out.println("Enter any number ");
				a = sc.nextInt();  
				con = convertOctal(a);
				System.out.println("Decimal to Octal = "+con);	
				break;
			default :
				System.out.println("Invalide Choice !");	
		}		
	}
}  