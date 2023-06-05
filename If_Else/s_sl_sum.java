import java.util.Scanner;
class FlSum
{
public static void main(String[]args)                                  
{
	int num,second,slast;
  	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter any five digit num ");
  	 num = sc.nextInt();
	 
	 slast=num%10;
	 num=num/10;

	 slast=num%10;
	 num=num/10;
	 
	 second =num%10;
	 num=num/10;
	 
	 second=num%10;
	 num=num/10;

	int sum=second+slast;
	int sqr =sum*sum;
	
	System.out.println("second num = "+second);
	System.out.println("second Last num = "+slast);
	System.out.println("Sum of first and last digit "+sum);
	System.out.println("Squar = "+sqr);

}
}