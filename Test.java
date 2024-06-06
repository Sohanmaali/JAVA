import java.util.Scanner;

public class Test {

	// public static void main(String arg[]) {

		// int arr[] = { 0, 1, 4, 0, 3, 0, 4, 0 };
		// for (int i : arr)
			// System.out.print(i + "  ");
		// int x = 0;
		// for (int i = 0; i < arr.length - 1; i++) {
			// if (arr[i] == arr[i + 1]) {
				// arr[x] = arr[i];
				// x++;
			// }
		// }
		// while (x < arr.length) {
		// arr[x] = 0;
		// x++;
		// }
		// System.out.println("\n============================");
		// for (int i : arr)
			// System.out.print(i + "  ");
	// }
	
	// public static void main(String arg[]) {
		// int  num = 38;
		// int sum =0;
		// do{
		// sum =0;
			// while(num>0)
			// {
				
				// sum+=num%10;
				// num/=10;
			// }
			// num = sum;
		// }while(num>=10);
		// System.out.println("Sum = "+ sum);
	// }
	// public static void main(String arg[]) {
		// int  arr[] ={1,0,3,5,5,7};
		// int n=10;
		// for(int i=0;i<n;i++)
		// {
			// boolean flag = true;
			// for(int j=0;j<arr.length;j++)
			// {
				// if(i==arr[j])
				// {
					// flag = false;
					// break;
				// }
			// }
			// if(flag) System.out.print(i+"  ");
		// }
	// }
	
	
	public static void main(String[] args) {
		String str = "aabbdee";
		int c=0;
		for (int i=0;i<str.length();i++)
		{
			c=1;
			char ch = str.charAt(i);
			
			for(int j=i+1;j<str.length();j++)
			{
				if(ch ==str.charAt(j))
				{
					str = str.substring(0,j)+str.substring(j+1);
					c++;
				}
			}
			System.out.println(str.charAt(i)+" occurred "+ c);
		}
	}	
}
