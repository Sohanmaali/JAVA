import java.util.Scanner;
class Midil
{
public static void main(String[]args)                                  
{
	int num,mid;
  	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter any five digit num ");
  	 num = sc.nextInt();
	 
	 mid=num%10;
	 num=num/10;

	 mid=num%10;
	 num=num/10;
	 
	 mid =num%10;
	 num=num/10;
	 
	 int sqr=mid*mid;
	System.out.println("MId num = "+mid);
	System.out.println("Squar = "+sqr);

}
}