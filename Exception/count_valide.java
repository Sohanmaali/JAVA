import java.util.Scanner;
class Main{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[50];
		int invalide = 0;
		int valide = 0;

		for(int i=0;i<args.length && i<arr.length;i++)
		{
			try
			{
				arr[valide]= Integer.parseInt(args[i]);
				valide++;
			}
			catch(NumberFormatException ref1)
			{
				invalide++;
			}
			catch(ArrayIndexOutOfBoundsException ref)
			{
				System.out.println("Array size most be equal or less then 3");
			}
		}		
		for(int j=0;j<valide;j++)
		{
			System.out.println(arr[j]);
		}
		System.out.println("Valide num = "+valide);
		System.out.println("invalide num = "+invalide);	
	}	
}