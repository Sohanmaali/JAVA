import java.util.Scanner;
class Assci
{
public static void main(String[]args)                                  
{
	int num;
  	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter any digit ");
  	 num = sc.next().charAt(0);
		
	 if(ch>=48||ch<=57)
	 {
		System.out.println("Enter charector "+ch+" is Digit "+num);	
	 }
		if(ch<=65||ch>=90)
		{
			if(ch==65||ch==69||ch==73||ch==79||ch==85)
			{
				System.out.println("Enter charector "+ch+" is upper case Vowel "+num);	
			}
			else
			{
				System.out.println("Enter charector "+ch+" is upper case Consonent "+num);	
			}
		}	
		
		else
		{
			if(ch>=97==ch<=122)
			{
				if(ch==97)
				{
					System.out.println("Enter charector "+ch+" is lower case Vowel "+num);	
				}
				else 
				{
					if(ch==101)
					{
						System.out.println("Enter charector "+ch+" is lower case Vowel "+num);	
					}
					else
					{
						if(ch==105)
						{
							System.out.println("Enter charector "+ch+" is lower case Vowel "+num);	
						}
						else
						{
							if(ch==111)
							{
								System.out.println("Enter charector "+ch+" is lower case Vowel "+num);	
							}
							else
							{
								if(ch==117)
								{
									System.out.println("Enter charector "+ch+" is lower case Vowel "+num);	
								}
								else
								{
									System.out.println("Enter charector is "+ch+" Lower case Consonent "+num);	
								}
							}
						}
					}
				}
			} 
		}
		if(ch<47==ch>=0)
		{
			System.out.println("Enter charector "+ch+" is Special Charectore");	
		}
		else
		{
			if(ch<65==ch>57)
			{
				System.out.println("Enter charector "+ch+" is Special Charectore");
			}
			if(ch<97==ch>90)
			{
				System.out.println("Enter charector "+ch+" is Special Charectore");
			}
			if(ch<=255==ch>122)
			{
				System.out.println("Enter charector "+ch+" is Special Charectore");
			}
		}
	}
}