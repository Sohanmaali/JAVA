

////Student of choice using Swatch case

import java.util.Scanner;
class Choice
{
	public static void main(String[]args)                                  
	{
		int choice,sub1,sub2,sub3,sub4,st,sub;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("are you Student of \n\t1 For middel School\n\t2 Fot high school");
		System.out.println("Enter your choice");
		st = sc.nextInt();
		
		switch(st)
		{
			case 1:
			
				System.out.println("your subject are \n\t1 For Math\n\t2 For bio \n\t3 For for AG");
				System.out.println("Enter your choice");
				choice = sc.nextInt();
				switch (choice)
				{
					case 1:
						System.out.println("Enter marks of Math");
						sub1 = sc.nextInt();
				
						System.out.println("Enter marks of Science");
						sub2 = sc.nextInt();
	
						System.out.println("Enter marks of hindi");
						sub3 = sc.nextInt();
						
						System.out.println("Enter marks of English");
						sub4 = sc.nextInt();
						
						
						if(sub1<0||sub1>100||sub2<0||sub2>100||sub3<0||sub3>100||sub4<0||sub4>100)
						{
							System.out.println("Invalide Mark");
						}
						else if((sub1>=70 && sub2>=70 && sub3>=70&&sub4>=70))
						{
							System.out.println("Your are eligabel for Math Subject");
						}
						else
						{
							System.out.println("Your are not eligabel for Math Subject");
						}
						break;

					case 2:
						System.out.println("Enter marks of Math");
						sub1 = sc.nextInt();
				
						System.out.println("Enter marks of Science");
						sub2 = sc.nextInt();
	
						System.out.println("Enter marks of hindi");
						sub3 = sc.nextInt();
						
						System.out.println("Enter marks of English");
						sub4 = sc.nextInt();
						
						
						if(sub1<0||sub1>100||sub2<0||sub2>100||sub3<0||sub3>100||sub4<0||sub4>100)
						{
							System.out.println("Invalide Mark");
						}
						else if((sub1>=60 && sub2>=60 && sub3>=60&&sub4>=60))
						{
							System.out.println("Your are eligabel for Bio Subject");
						}
						else
						{
							System.out.println("Your are not eligabel for Bio Subject");
						}
						break;
					
					case 3:
						System.out.println("Enter marks of Math");
						sub1 = sc.nextInt();
				
						System.out.println("Enter marks of Science");
						sub2 = sc.nextInt();
	
						System.out.println("Enter marks of hindi");
						sub3 = sc.nextInt();
						
						System.out.println("Enter marks of English");
						sub4 = sc.nextInt();
						
						
						if(sub1<0||sub1>100||sub2<0||sub2>100||sub3<0||sub3>100||sub4<0||sub4>100)
						{
							System.out.println("Invalide Mark");
						}
						else if((sub1>=45 && sub2>=45 && sub3>=45&&sub4>=45))
						{
							System.out.println("Your are eligabel for BA Subject");
						}
						else
						{
							System.out.println("Your are not eligabel for BA Subject");
						}
						break;
					default :
					
						System.out.println("Your are not eligabel for ANY Subject");
					
				}
				break;
			
			case 2:
			
				System.out.println("your subject are \n\t1 For BCA\n\t2 For BSC \n\t3 For for BA");
				System.out.println("Enter your choice");
				sub = sc.nextInt();
				switch(sub)
				{
					case 1:
					{
						System.out.println("Enter marks of phycics");
						sub1 = sc.nextInt();
				
						System.out.println("Enter marks of chemistry");
						sub2 = sc.nextInt();
	
						System.out.println("Enter marks of math");
						sub3 = sc.nextInt();
						if(sub1<0||sub1>100||sub2<0||sub2>100||sub3<0||sub3>100)
						{
							System.out.println("Invalide Mark");
						}
						else if((sub1>=70 && sub2>=70 && sub3>=70))
						{
							System.out.println("Your are eligabel for BCA Subject");
						}
						else
						{
							System.out.println("Your are not eligabel for BCA Subject");
						}
						break;
					}
					case 2:
					{
						System.out.println("Enter marks of phycics");
						sub1 = sc.nextInt();
				
						System.out.println("Enter marks of chemistry");
						sub2 = sc.nextInt();
	
						System.out.println("Enter marks of bio");
						sub3 = sc.nextInt();
						if(sub1<0||sub1>100||sub2<0||sub2>100||sub3<0||sub3>100)
						{
							System.out.println("Invalide Mark");
						}
						else if((sub1>=65 && sub1>=65 && sub3>=65))
						{
							System.out.println("Your are eligabel for BSC Subject");
						}
						else
						{
							System.out.println("Your are not eligabel for BSC Subject");
						}
						break;
					}
					case 3:
					{
						System.out.println("Enter marks of History");
						sub1 = sc.nextInt();
				
						System.out.println("Enter marks of geography");
						sub2 = sc.nextInt();
	
						System.out.println("Enter marks of politech");
						sub3 = sc.nextInt();
						if(sub1<0||sub1>100||sub2<0||sub2>100||sub3<0||sub3>100)
						{
							System.out.println("Invalide Mark");
						}
						else if((sub1>=65 && sub2>=65 && sub3>=65))
						{
							System.out.println("Your are eligabel for BA Subject");
						}
						else
						{
							System.out.println("Your are not eligabel for BA Subject");
						}
						break;	
					}
				}	
				break;
			
			default :
					
				System.out.println("Your are not eligabel for ANY Subject");
		}
	}
}