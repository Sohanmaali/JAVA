import java.util.Scanner;
class CountNot
{
public static void main(String[]args)                                  
{
  	Scanner sc = new Scanner(System.in);
	int amo,n500,n200,n100,n50,n20,n10,n5,n2;
	
	System.out.println("Enter any amount");
	amo = sc.nextInt();
	
	n500= amo/500;
 	amo=amo%500;
	
	n200= amo/200;
	amo=amo%200;
	
	n100= amo/100;
	amo=amo%100;
	
	n50= amo/50;
	amo=amo%50;
	
	n20= amo/20;
	amo=amo%20;
	
	n10= amo/10;
	amo=amo%10;
	
	n5= amo/5;
	amo=amo%5;
	
	n2= amo/2;
	amo=amo%2;
	
	System.out.println("Not 500 = "+n500);
	System.out.println("Not 200 = "+n200);
	System.out.println("Not 100 = "+n100);
	System.out.println("Not 50 = "+n50);
	System.out.println("Not 20 = "+n20);
	System.out.println("Not 10 = "+n10);
	System.out.println("Not 5 = "+n5);
	System.out.println("Not 2 = "+n2);
	System.out.println("Not 1 = "+amo);	
}
}