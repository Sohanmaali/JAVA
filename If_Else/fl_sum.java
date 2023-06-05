import java.util.Scanner;
class FlSum
{
public static void main(String[]args)                                  
{
	int num,first,last;
  	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter any five digit num ");
  	 num = sc.nextInt();
	 
	 last=num%10;
	 num=num/10;

	 first=num%10;
	 num=num/10;
	 
	 first=num%10;
	 num=num/10;
	 
	 first=num%10;
	 num=num/10;
	 
	 first=num%10;
	 num=num/10;
	
	int sum=first+last;
	int sqr =sum*sum;
	
	System.out.println("First num = "+first);
	System.out.println("Last num = "+last);
	System.out.println("Sum of first and last digit "+sum);
	System.out.println("Squar = "+sqr);

}
}