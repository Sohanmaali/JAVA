import java.io.*;

class Fibonacci {
    public static void main(String[] args) throws Exception
	{
        int n = 10; 
		FileOutputStream fos = new FileOutputStream("D:/JAVA/IO/File/fibonacci.txt");
	
		for (int i = 0; i < n; i++) 
		{
			int fibonacciNumber = calculateFibonacci(i);
            fos.write(fibonacciNumber);
        }
        System.out.println("Fibonacci series written to ");
    }

    public static int calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }
}
