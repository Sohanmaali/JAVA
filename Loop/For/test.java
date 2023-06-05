import java.util.Scanner;
class Test
{
  public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		 double negativeInfinity = Double.NEGATIVE_INFINITY;  
		//for( ; ; );                                    // error unrechebal stetus
			
		//for( ; ;System.out.println("Hello") );         //infainight loop
		
		//for( i=1;i<=10;++i,System.out.println(i));     //1-10
		
		//for( i=1;i<=10;i++,System.out.println(i));     //2-11
		
		//for( i=1;i>=10;++i,System.out.println(i));     //null
		
		//for( i=1;i<=10;System.out.println(i++));       //1-10
		
		//for( i=1;i<=10;System.out.println(++i));      //2-11
		
	   //for( i=1;i<=10;++i);;
	   
	   //System.out.println(Math.pow(4,2));
	   
	   //System.out.println(Math.max(4,2));
	   
	   //System.out.println(Math.sqrt(46));
	   //System.out.println(Math.negateExact(10)); //-10
	   //System.out.println(Math.toIntExact(10)); //
	  // System.out.println(Math.decrementExact(10)); //
	   //System.out.println(Math.cbrt(9)); //
	  // System.out.println(Math.abs(10+25.63)); //
	   System.out.println(Math.round(negativeInfinity)); //
	   
	}
}