// class MyException extends Exception
// {
///**
 * @param args
 */
 	MyException ()
// 	{

// 	}
// 	MyException(String msg)
// 	{
// 		super(msg);
// 	}
// }

// class Main{

//     public static void main(String args[])
// 	{
// 		try
// 		{
// 			int a= Integer.parseInt(args[0]);
// 			if (a>100)
// 			{
// 				throw new MyException ("value not 100");
// 			}
// 			else if(a<0)
// 			{
// 				throw new MyException ("value not 0");
// 			}
// 			else
// 			{
// 				System.out.println("Value"+a);
// 			}
// 		}
// 		catch(MyException e)
// 		{
// 			// System.out.println(e);
// 			System.out.println(e.getMessage());
// 		}
//     }
// }
// class Superclass {

//   // Method in the superclass that throws NullPointerException
//   void method() throws NullPointerException {
//     // Code that may throw NullPointerException
//     throw new NullPointerException();
//   }
// }

// public class Test extends Superclass {

//   // Overriding method in the subclass that throws RuntimeException
//   @Override
//   void method() throws RuntimeException {
//     // Code that may throw RuntimeException
//     throw new RuntimeException();
//   }

//   public static void main(String args[]) {}
// }

/**
 * Test
 */
public class Test {
  static {
    try {
      int x = 10 / 0;
      System.out.println("hello sohan");
    } catch (ArithmeticException e) {
      System.out.println(e);
    } finally {
      System.out.println("\"hello finally\"");
    }
  }

  public static void main(String[] args) {
    System.out.println("main");
  }
}
