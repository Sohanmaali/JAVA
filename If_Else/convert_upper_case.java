import java.util.Scanner;
class Convert
{
public static void main(String[]args)                                  
{
	char ch;

  	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter any lower charector");
  	 ch = sc.next().charAt(0);
	 int num = (int) ch;
	 
	 if(num>=97||num<=122)
	 {
		num=num-32;
		char al = (char) num;
		System.out.println("Upper case of "+ch+" = "+al);
	else 
	{
		System.out.println("Please Enter lower Case Alfabate");
	}
}
}