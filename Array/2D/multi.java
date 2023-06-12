import java.util.Scanner;

class MultiMetrix 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[20][20];
		int b[][] = new int[20][20];
		int x[][] = new int[20][20],k;
		
		System.out.println("Enter size of First Metrix row");
		int r = sc.nextInt();

		System.out.println("Enter size of First Metrix Colom");
		int c = sc.nextInt();

		
		System.out.println("Enter size of Second metrix row");
		int r1 = sc.nextInt();

		System.out.println("Enter size of Second metrix Colom");
		int c1 = sc.nextInt();

		if (r == c1) 
		{
			System.out.println("Enter Element of First Metrix : ");

			for (int i = 0; i < r; i++) 
			{
				for (int j = 0; j < c; j++) 
				{
					a[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter Element of Second metrix : ");

			for (int i = 0; i < r1; i++)
			{
				for (int j = 0; j < c1; j++)
				{
					b[i][j] = sc.nextInt();
				}
			}

			System.out.println("\nActual First Matrix element are");
			for (int i = 0; i < r; i++)
			{
				for (int j = 0; j < c; j++)
				{
					System.out.print("\t" + a[i][j] + " ");
				}
				System.out.println();
			}

			System.out.println("\nActual Second Matrix element are");
			for (int i = 0; i < r1; i++)
			{
				for (int j = 0; j < c1; j++)
				{
					System.out.print("\t" + b[i][j] + " ");
				}
				System.out.println();
			}
			/* Multiplaction of Matrix */
			for (int i = 0; i < r; i++)
			{
				for (int j = 0; j < c1; j++)
				{
					for (k = 0,x[i][j] = 0; k < c; k++)
					{
						x[i][j] += a[i][k] * b[k][j];
					}
				}
			}
			
			System.out.println("\nMultiplaction of Two Metrix-->");

			for (int i = 0; i < r; i++) 
			{
				for (int j = 0; j < c1; j++) 
				{
					System.out.print("\t" + x[i][j] + " ");
				}
				System.out.println("");
			}
		}
		else
		{
			System.out.println("Multiplaction not possible");
		}
	}
}