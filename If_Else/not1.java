import java.util.Scanner;
class CountNot
{
public static void main(String[]args)                                  
{
  	Scanner sc = new Scanner(System.in);
	int amo,not;
	
	System.out.println("Enter any amount");
	amo = sc.nextInt();
	
	not= amo/500;
 	amo=amo%500;
	if(not!=0)
	System.out.println("Not 500rs = "+not);
	
	not= amo/200;
	amo=amo%200;
	if(not!=0)
	System.out.println("Not 200rs = "+not);
	
	not= amo/100;
	amo=amo%100;
	if(not!=0)
	System.out.println("Not 100rs = "+not);
	
	not= amo/50;
	amo=amo%50;
	if(not!=0)
	System.out.println("Not 50s = "+not);
	
	not= amo/20;
	amo=amo%20;
	if(not!=0)
	System.out.println("Not 20rs = "+not);
	
	not= amo/10;
	amo=amo%10;
	if(not!=0)
	System.out.println("Not 10rs = "+not);
	
	not= amo/5;
	amo=amo%5;
	if(not!=0)
	System.out.println("Not 5rs = "+not);
	
	not= amo/2;
	amo=amo%2;
	if(not!=0)
	System.out.println("Not 2rs = "+not);

	if(amo!=0)
	System.out.println("Not 1rs = "+amo);

		
}
}