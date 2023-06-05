import java.util.Scanner;
class Mol
{
	public static void main(String[]args)                                  
	{
		int choice,choice1,choice3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("your choice are \n\t1 For Electronic\n\t2 For Cosmetic\n\t3Stesnari");
		System.out.println("Enter your choice");
		choice = sc.nextInt();
		
		switch(place)
		{
			case 1:
				
				System.out.println("your choice are \n\t1 For TV\n\t2 For MOBILE\n\t3 For AC");
				System.out.println("Enter your choice");
				choice1 = sc.nextInt();
				static (choice1)
				{
					case 1:
						System.out.println("your choice are \n\t1 For LG\n\t2 For SUMSUNG\n\t3 For CROMA");
						System.out.println("Enter your choice");
						choice3 = sc.nextInt();
						switch(choice3)
						{
							case 1:
								System.out.println("your choice are \n\t1 For 16 INC \n\t2 For 32 INC\n\t3 For 48 INC");
								System.out.println("Enter your choice");
								choice4 = sc.nextInt();
								switch(choice4)
								{
									case 1:
										System.out.println("your choice are \n\t1 For WIFI \n\t2 For CABEL");
										System.out.println("Enter your choice");
										choice5 = sc.nextInt();
										switch(choice5)
										{
											case 1:
												System.out.println("Price 15K ru");
												System.out.println("Presh \n\t1 For BOOK TV \n\t2 For Exit");
												choice6 = sc.nextInt();
												switch(choice6)
												{
													case 1:
														System.out.println("Congrachulation Your TV is booked");
														break;
													case 2:
														System.exti(0);
												}
												break;
											case 2:
												System.out.println("Price 10K ru");
												System.out.println("Presh \n\t1 For BOOK TV \n\t2 For Exit");
												choice6 = sc.nextInt();
												switch(choice6)
												{
													case 1:
														System.out.println("Congrachulation Your TV is booked");
														break;
													case 2:
														System.exti(0);
												}
													
										}
										break;
									case 2:
										System.out.println("your choice are \n\t1 For WIFI \n\t2 For CABEL");
										System.out.println("Enter your choice");
										choice5 = sc.nextInt();
										switch(choice5)
										{
											case 1:
												System.out.println("Price 15K ru");
												System.out.println("Presh \n\t1 For BOOK TV \n\t2 For Exit");
												choice6 = sc.nextInt();
												switch(choice6)
												{
													case 1:
														System.out.println("Congrachulation Your TV is booked");
														break;
													case 2:
														System.exti(0);
												}
												break;
											case 2:
												System.out.println("Price 10K ru");
												System.out.println("Presh \n\t1 For BOOK TV \n\t2 For Exit");
												choice6 = sc.nextInt();
												switch(choice6)
												{
													case 1:
														System.out.println("Congrachulation Your TV is booked");
														break;
													case 2:
														System.exti(0);
												}
													
										}
										break;
								}	break ;
						}
						
					break;
				}
				
			break;
		}
		
	}
}
