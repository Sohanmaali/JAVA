

////Trable of choice using Swatch case

import java.util.Scanner;
class Trable
{
	public static void main(String[]args)                                  
	{
		int place,ac,time,choice,go,book;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("your choice are \n\t1 For Harda\n\t2 For Indore");
		System.out.println("Enter your choice");
		place = sc.nextInt();
		
		switch(place)
		{
			case 1:
				System.out.println("your choice for Bus \n\t1 For YADAV\n\t2 For BAGWAN\n\t3 For PARAG");
				System.out.println("Enter your choice");
				choice = sc.nextInt();
				switch(choice)  
				{
					case 1: // YADAV BUS START
						System.out.println("your choice for Bus \n\t1 For AC\n\t2 For NON AC");
						System.out.println("Enter your choice");
						ac = sc.nextInt();
						switch (ac)
						{
							case 1: //AC BUS
								System.out.println("your choice acording Buses Time \n\t1 bus Time 6.30AM\n\t2 bus Time 9.30AM");
								time = sc.nextInt();
								switch (time)
								{
									
									case 1:
										System.out.println("Pres \n\t1 For book bus MP 41 AV 7896\n\t2 For book bus no MP 41 AV 8963");
										book = sc.nextInt();
										switch (book)
										{
											case 1:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 7896");
												break;
											case 2:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 8963");
											default :
												break;									
										}
										break;
									case 2:
										System.out.println("Pres \n\t1 For book bus MP 41 AV 4560\n\t2 bus no MP 41 AV 9010");
										book = sc.nextInt();
										switch (book)
										{
											case 1:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 4560");
												break;
											case 2:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 9010");
											default :
												break;									
										}
										break;
								}
								break;    //AC BUS END
			
							case 2:  //NON AC BUS
								System.out.println("your choice acording Buses Time \n\t1 bus Time 6.45AM\n\t2 bus Time 9.45AM");
								time = sc.nextInt();
								switch (time)
								{
									
									case 1:
										System.out.println("Pres \n\t1 For book bus MP 41 AV 1020\n\t2 For book bus MP 41 AV 2025");
										book = sc.nextInt();
										switch (book)
										{
											case 1:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 1020");
												break;
											case 2:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 2025");
											default :
												break;									
										}
										break;
									case 2:
										System.out.println("Pres \n\t1 For book bus MP 41 AV 7080\n\t2 bus no MP 41 AV 9585");
										book = sc.nextInt();
										switch (book)
										{
											case 1:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 7080");
												break;
											case 2:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 9585");
											default :
												break;									
										}
								}
							break;  //NON AC BUS END
								
									
						}
					break; // YADAV BUS END
					case 2:    // BAGWAN BUS START
						System.out.println("your choice for Bus \n\t1 For AC\n\t2 For NON AC");
						System.out.println("Enter your choice");
						ac = sc.nextInt();
						switch (ac)
						{
							case 1: //AC BUS
								System.out.println("your choice acording Buses Time \n\t1 bus Time 7.30AM\n\t2  bus Time 10.30AM");
								time = sc.nextInt();
								switch (time)
								{
									
									case 1:
										System.out.println("Pres \n\t1 For book bus MP 41 AV 1213\n\t2 For book bus no MP 41 AV 1415");
										book = sc.nextInt();
										switch (book)
										{
											case 1:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 1213");
												break;
											case 2:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 1415");
											default :
												break;									
										}
										break;
									case 2:
										System.out.println("Pres \n\t1 For book bus MP 41 AV 2021\n\t2 bus no MP 41 AV 2526");
										book = sc.nextInt();
										switch (book)
										{
											case 1:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 2021");
												break;
											case 2:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 2526");
											default :
												break;									
										}
										break;
								}
								break;    //AC BUS END YADAV
			
							case 2:  //NON AC BUS START BAGWAN
								System.out.println("your choice acording Buses Time \n\t1 bus Time 6.45AM\n\t2 bus Time 9.45AM");
								time = sc.nextInt();
								switch (time)
								{
								
									case 1:
										System.out.println("Pres \n\t1 For book bus MP 41 AV 3031\n\t2 For book bus no MP 41 AV 3536");
										book = sc.nextInt();
										switch (book)
										{
											case 1:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 3031");
												break;
											case 2:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 3536");
											default :
												break;									
										}
										break;
									case 2:
										System.out.println("Pres \n\t1 For book bus MP 41 AV 7080\n\t2 bus no MP 41 AV 9585");
										book = sc.nextInt();
										switch (book)
										{
											case 1:
												System.out.println(" Congrachulation Your Bus is Book Your Bus no MP 41 AV 7080");
												break;
											case 2:
												System.out.println(" Congrachulation Your Bus is Book Your Bus no MP 41 AV 9585");
											default :
												break;									
										}
										break;
								}
							break;  // BAGWAN NON AC BUS END	
						}
					break; // BAGWAN BUS END
					case 3:    // PARAG BUS START
						System.out.println("your choice for Bus \n\t1 For AC\n\t2 For NON AC");
						System.out.println("Enter your choice");
						ac = sc.nextInt();
						switch (ac)
						{
							case 1: //AC BUS
								System.out.println("your choice acording Buses Time \n\t1 bus Time 8.30AM\n\t2 bus Time 11.30AM");
								time = sc.nextInt();
								switch (time)
								{
									
									case 1:
										System.out.println("Pres \n\t1 For book bus MP 41 AV 9192\n\t2 for book bus no MP 41 AV 8182");
										book = sc.nextInt();
										switch (book)
										{
											case 1:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 9192");
												break;
											case 2:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 8182");
											default :
												break;									
										}
										break;
									case 2:
										System.out.println("Pres \n\t1 For book bus MP 41 AV 5678\n\t2 For book bus no MP 41 AV 1234");
										book = sc.nextInt();
										switch (book)
										{
											case 1:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 5678");
												break;
											case 2:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 1234");
											default :
												break;									
										}
										break;
								}
								break;    //AC BUS END PARAG
			
							case 2:  //NON AC BUS START PARAG
								System.out.println("your choice acording Buses Time \n\t1 bus Time 6.45AM\n\t2 bus Time 9.45AM");
								time = sc.nextInt();
								switch (time)
								{
									
									case 1:
										System.out.println("Pres \n\t1 For book bus MP 41 AV 3031\n\t2 bus no MP 41 AV 3536");
										book = sc.nextInt();
										switch (book)
										{
											case 1:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 3031");
												break;
											case 2:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 3536");
											default :
												break;									
										}
										break;
									case 2:
										System.out.println("Pres \n\t1 For book bus MP 41 AV 7080\n\t2 For book bus no MP 41 AV 9585");
										book = sc.nextInt();
										switch (book)
										{
											case 1:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 7080");
												break;
											case 2:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 9585");
											default :
												break;									
										}
										break;
								}
							break;  // PARAG NON AC BUS END	
						}
					break; // PARAG BUS END
				}
				break;
			case 2:
				System.out.println("your choice for Bus \n\t1 For YADAV\n\t2 For BAGWAN\n\t3 For PARAG");
				System.out.println("Enter your choice");
				choice = sc.nextInt();
				switch(choice)  
				{
					case 1: // YADAV BUS START
						System.out.println("your choice for Bus \n\t1 For AC\n\t2 For NON AC");
						System.out.println("Enter your choice");
						ac = sc.nextInt();
						switch (ac)
						{
							case 1: //AC BUS
								System.out.println("your choice acording Buses Time \n\t1 bus Time 6.40AM\n\t2 bus Time 9.40AM");
								time = sc.nextInt();
								switch (time)
								{
									
									case 1:
										System.out.println("Pres \n\t1 For book bus MP 41 AV 7896\n\t2 For book bus no MP 41 AV 8963");
										book = sc.nextInt();
										switch (book)
										{
											case 1:
												System.out.println("Congrachulation Your Bus ticket is Book Your Bus no MP 41 AV 7896");
												break;
											case 2:
												System.out.println("Congrachulation Your Bus ticket is Book Your Bus no MP 41 AV 8963");
											default :
												break;									
										}
										break;
									case 2:
										System.out.println("Pres \n\t1 For book bus MP 41 AV 4560\n\t2 bus no MP 41 AV 9010");
										book = sc.nextInt();
										switch (book)
										{
											case 1:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 4560");
												break;
											case 2:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 9010");
											default :
												break;									
										}
										break;
								}
								break;    //AC BUS END
			
							case 2:  //NON AC BUS
								System.out.println("your choice acording Buses Time \n\t1 bus Time 6.45AM\n\t2 bus Time 9.45AM");
								time = sc.nextInt();
								switch (time)
								{
									
									case 1:
										System.out.println("Pres \n\t1 For book bus MP 41 AV 1020\n\t2 For book bus no MP 41 AV 2025");
										book = sc.nextInt();
										switch (book)
										{
											case 1:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 1020");
												break;
											case 2:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 2025");
											default :
												break;									
										}
										break;
									case 2:
										System.out.println("Pres \n\t1 For book bus MP 41 AV 7080\n\t2 bus no MP 41 AV 9585");
										book = sc.nextInt();
										switch (book)
										{
											case 1:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 7080");
												break;
											case 2:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 9585");
											default :
												break;									
										}
								}
							break;  //NON AC BUS END
								
						}
					break; // YADAV BUS END
					case 2:    // BAGWAN BUS START
						System.out.println("your choice for Bus \n\t1 For AC\n\t2 For NON AC");
						System.out.println("Enter your choice");
						ac = sc.nextInt();
						switch (ac)
						{
							case 1: //AC BUS
								System.out.println("your choice acording Buses Time \n\t1 bus Time 7.30AM\n\t2 bus Time 10.30AM");
								time = sc.nextInt();
								switch (time)
								{
									
									case 1:
										System.out.println("Pres \n\t1 For book bus MP 41 AV 1213\n\t2 bus no MP 41 AV 1415");
										book = sc.nextInt();
										switch (book)
										{
											case 1:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 1213");
												break;
											case 2:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 1415");
											default :
												break;									
										}
										break;
									case 2:
										System.out.println("Pres \n\t1 For book bus MP 41 AV 2021\n\t2 bus no MP 41 AV 2526");
										book = sc.nextInt();
										switch (book)
										{
											case 1:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 2021");
												break;
											case 2:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 2526");
											default :
												break;									
										}
										break;
								}
								break;    //AC BUS END YADAV
			
							case 2:  //NON AC BUS START BAGWAN
								System.out.println("your choice acording Buses Time \n\t1 bus Time 6.45AM\n\t2 bus Time 9.45AM");
								time = sc.nextInt();
								switch (time)
								{
									
									case 1:
										System.out.println("Pres \n\t1 For book bus MP 41 AV 3031\n\t2 bus no MP 41 AV 3536");
										book = sc.nextInt();
										switch (book)
										{
											case 1:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 3031");
												break;
											case 2:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 3536");
											default :
												break;									
										}
										break;
									case 2:
										System.out.println("Pres \n\t1 For book bus MP 41 AV 7080\n\t2 bus no MP 41 AV 9585");
										book = sc.nextInt();
										switch (book)
										{
											case 1:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 7080");
												break;
											case 2:
												System.out.println("Congrachulation Your Bus is Book Your Bus no MP 41 AV 9585");
											default :
												break;									
										}
										break;
								}
							break;  // BAGWAN NON AC BUS END	
						}
					break; // BAGWAN BUS END
					case 3:    // PARAG BUS START5
						System.out.println("your choice for Bus \n\t1 For AC\n\t2 For NON AC");
						System.out.println("Enter your choice");
						ac = sc.nextInt();
						switch (ac)
						{
							case 1: //AC BUS
								System.out.println("your choice acording Buses Time \n\t1 bus Time 8.30AM\n\t bus Time 11.30AM");
								time = sc.nextInt();
								switch (time)
								{
									
									case 1:
										System.out.println("Pres \n\t1 For book bus MP 41 AV 1999\n\t2 bus no MP 41 AV 2000");
										book = sc.nextInt();
										switch (book)
										{
											case 1:
												System.out.println("Congrachulation Your Bus is Book Bus no MP 41 AV 1999");
												break;
											case 2:
												System.out.println("Congrachulation Your Bus is Book Bus no MP 41 AV 2000");
											default :
												break;									
										}
										break;
									case 2:
										System.out.println("Pres \n\t1 For book bus MP 41 AV 1990\n\t2 bus no MP 41 AV 1991");
										book = sc.nextInt();
										switch (book)
										{
											case 1:
												System.out.println("Congrachulation Your Bus is Book Bus no MP 41 AV 1990");
												break;
											case 2:
												System.out.println("Congrachulation Your Bus is Book Bus no MP 41 AV 1991");
											default :
												break;									
										}
										break;
								}
								break;    //AC BUS END PARAG
			
							case 2:  //NON AC BUS START PARAG
								System.out.println("your choice acording Buses Time \n\t1 bus Time 6.45AM\n\t bus Time 9.45AM");
								time = sc.nextInt();
								switch (time)
								{
									
									case 1:
										System.out.println("Pres \n\t1 For book bus MP 41 AV 2008\n\t2 bus no MP 41 AV 2004");
										book = sc.nextInt();
										switch (book)
										{
											case 1:
												System.out.println("Congrachulation Your Bus is Book Bus no MP 41 AV 2008");
												break;
											case 2:
												System.out.println("Congrachulation Your Bus is Book Bus no MP 41 AV 2004");
											default :
												break;									
										}
										break;
									case 2:
										System.out.println("Pres \n\t1 For book bus MP 41 AV 2002\n\t2 bus no MP 41 AV 2001");
										book = sc.nextInt();
										switch (book)
										{
											case 1:
												System.out.println("Congrachulation Your Bus is Book Bus no MP 41 AV 2002");
												break;
											case 2:
												System.out.println("Congrachulation Your Bus is Book Bus no MP 41 AV 2001");
											default :
												break;									
										}
										break;
								}
							break;  // PARAG NON AC BUS END	
						}
					break; // PARAG BUS END
				}
				break;
		}
	}
}
