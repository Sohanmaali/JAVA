import java.util.ArrayList;
import java.util.Arrays;

// class MyException extends Throwable
// {

 	// MyException ()
	// {

	// }
	// MyException(String msg)
	// {
		// super(msg);
	// }
// }

// class Main{

    // public static void main(String args[])
	// {
		
		 // String result1 = String.join("-", "Java", "is", "awesome");
        // System.out.println(result1);  // Output: Java-is-awesome

		
		// try
		// {
			// int a= Integer.parseInt(args[0]);
			// if (a>100)
			// {
				// throw new MyException ("value not 100");
			// }
			// else if(a<0)
			// {
				// throw new MyException ("value not 0");
			// }
			// else
			// {
				// System.out.println("Value"+a);
			// }
		// }
		// catch(MyException e)
		// {
			// // System.out.println(e);
			// System.out.println(e.getMessage());
		// // }
    // }
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
 // class Test {
  // static {
  //   try {
  //     int x = 10 / 0;
  //     System.out.println("hello sohan");
  //   } catch (ArithmeticException e) {
  //     System.out.println(e);
  //   } finally {
  //     System.out.println("\"hello finally\"");
  //   }
  // }
// }

// class Test {
	
	// public static void main(String[] args) {
		// // System.out.println("main");
		// // try{
			// // // int x=10/0;
			// // throw new Exception("Sohan");
		// // }
		// // catch(Exception e)
		// // {
			// // System.out.println("CAtch");
		// // }
		// // finally{
			// // return;
		// // }
		// // System.out.println("fghjk");
	// }
// }

// Functional interface for calculator operations
// abstract class Calculator {
   // abstract int calculate(int a, int b);
// }

// // CalculatorApp class that uses lambda expressions
 // class CalculatorApp {
    // public static void main(String[] args) {
        // Calculator addition = (a, b) -> a + b;
        // Calculator subtraction = (a, b) -> a - b;
        // Calculator multiplication = (a, b) -> a * b;

        // int operand1 = 5;
        // int operand2 = 3;

        // System.out.println("Addition: " + calculate(addition, operand1, operand2));
        // System.out.println("Subtraction: " + calculate(subtraction, operand1, operand2));
        // System.out.println("Multiplication: " + calculate(multiplication, operand1, operand2));
    // }
// }


// class Test {
	
	// public static void main(String[] args) throws Exception{
		// // Test t = new Test();
		// // t.m(2);
		// // if(true)
		// throw new Exception("Sohan");
	// }
	// // public void m(float ...i){
		// // for(float x:i)
		// // System.out.println("   "+x);
	// // }
// }

class Test{
	public static void main(String[] args) {
		String s = "abcseab";
		System.out.println((5+10)*(5+10)/5-10);
	}

}
