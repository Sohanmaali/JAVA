import java.util.Scanner;
class Main{
	public static void main(String[] args)
	{
		int arr[] = new int[30];
		int invalide = 0;
		int valide = 0;
	
		for(int i=0;i<args.length;i++)
		{
			try
			{
				arr[i]= Integer.parseInt(args[i]);
				valide++;
			}
			catch(NumberFormatException ref1)
			{
				invalide++;
			}
		}		
		System.out.println("Valide num = "+valide);
		System.out.println("invalide num = "+invalide);
		
	}
	
}