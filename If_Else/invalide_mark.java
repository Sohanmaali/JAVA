
import java.util.Scanner;
class Test
{
  public static void main(String[]args)
  {
    int py,ch,math,hindi,english,total;
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter an Integer value ");
    py=sc.nextInt();
	if(py<0||py>100)
	{
		System.out.println("Invalide mark !\nPlease Enter valide mark");
		System.out.println("Enter mark of py");
		py=sc.nextInt();
		if(py<0||py>100)
		{
			System.out.println("Invalide mark !");
		}
		else
		{
			System.out.println("Enter mark of ch ");
			ch=sc.nextInt();
			if(ch<0||ch>100)
			{
				System.out.println("Invalide mark !\nPlease Enter valide mark");
				System.out.println("Enter mark of ch");
				ch=sc.nextInt();
				if(ch<0||ch>100)
				{
					System.out.println("Invalide mark !");
				}
				else
				{
					System.out.println("Enter mark of math ");
					math=sc.nextInt();
					if(math<0||math>100)
					{
						System.out.println("Invalide mark !\nPlease Enter valide mark");
						System.out.println("Enter mark of math");
						math=sc.nextInt();
						if(math<0||math>100)
						{
							System.out.println("Invalide mark !");
						}
						else
						{
							System.out.println("Enter mark of Hindi ");
							hindi=sc.nextInt();
							if(hindi<0||hindi>100)
							{
								System.out.println("Invalide mark !\nPlease Enter valide mark");
								System.out.println("Enter mark of hindi");
								hindi=sc.nextInt();
								if(hindi<0||hindi>100)
								{
									System.out.println("Invalide mark !");
								}
								else
								{
									System.out.println("Enter mark of english");
									english=sc.nextInt();
									if(english<0||english>100)
									{
										System.out.println("Invalide mark !\nPlease Enter valide mark");
										System.out.println("Enter mark of hindi");
										english=sc.nextInt();
										if(english<0||english>100)
										{
											System.out.println("Invalide mark !");
										}
										else
										{
											total=py+ch+math+hindi+english;
											System.out.println(total);

										}
									}
									else
									{
										total=py+ch+math+hindi+english;
											System.out.println(total);
									}
								}
							}
							else
							{
								System.out.println("Enter mark of english");
								english=sc.nextInt();
								if(english<0||english>100)
								{
									System.out.println("Invalide mark !\nPlease Enter valide mark");
									System.out.println("Enter mark of hindi");
									english=sc.nextInt();
									if(english<0||english>100)
									{
										System.out.println("Invalide mark !");
									}
									else
									{
										total=py+ch+math+hindi+english;
										System.out.println(total);
									}
								}
								else
								{
									total=py+ch+math+hindi+english;
									System.out.println(total);
								}
							}
						}
					}
					else
					{
						System.out.println("Enter mark of Hindi ");
						hindi=sc.nextInt();
						if(hindi<0||hindi>100)
						{
							System.out.println("Invalide mark !\nPlease Enter valide mark");
							System.out.println("Enter mark of hindi");
							hindi=sc.nextInt();
							if(hindi<0||hindi>100)
							{
								System.out.println("Invalide mark !");
							}
							else
							{
								System.out.println("Enter mark of english");
								english=sc.nextInt();
								if(english<0||english>100)
								{
									System.out.println("Invalide mark !\nPlease Enter valide mark");
									System.out.println("Enter mark of hindi");
									english=sc.nextInt();
									if(english<0||english>100)
									{
										System.out.println("Invalide mark !");
									}
									else
									{
										total= py+ch+math+hindi+english;
									}
								}
							}
						}
						else
						{
							System.out.println("Enter mark of english");
							english=sc.nextInt();
							if(english<0||english>100)
							{
								System.out.println("Invalide mark !\nPlease Enter valide mark");
								System.out.println("Enter mark of hindi");
								english=sc.nextInt();
								if(english<0||english>100)
								{
									System.out.println("Invalide mark !");
								}
								else
								{
									total= py+ch+math+hindi+english;
								}
							}
							else
							{
								total= py+ch+math+hindi+english;
							}
						}
					}
				}
			}
		else
		{
			System.out.println("Enter mark of math ");
			math=sc.nextInt();
			if(math<0||math>100)
			{
				System.out.println("Invalide mark !\nPlease Enter valide mark");
				System.out.println("Enter mark of math");
				math=sc.nextInt();
				if(math<0||math>100)
				{
					System.out.println("Invalide mark !");
				}
				else
				{
					System.out.println("Enter mark of Hindi ");
					hindi=sc.nextInt();
					if(hindi<0||hindi>100)
					{
						System.out.println("Invalide mark !\nPlease Enter valide mark");
						System.out.println("Enter mark of hindi");
						hindi=sc.nextInt();
						if(hindi<0||hindi>100)
						{
							System.out.println("Invalide mark !");
						}
						else
						{
							System.out.println("Enter mark of english");
							english=sc.nextInt();
							if(english<0||english>100)
							{
								System.out.println("Invalide mark !\nPlease Enter valide mark");
								System.out.println("Enter mark of english");
								english=sc.nextInt();
								if(english<0||english>100)
								{
									System.out.println("Invalide mark !");
								}
								else
								{
									total=py+ch+math+hindi+english;
									System.out.println(total);
								}
							}
							else
							{
								total=py+ch+math+hindi+english;
									System.out.println(total);
							}
						}
					}
					else
					{
						System.out.println("Enter mark of english");
						english=sc.nextInt();
						if(english<0||english>100)
						{
							System.out.println("Invalide mark !\nPlease Enter valide mark");
							System.out.println("Enter mark of english");
							english=sc.nextInt();
							if(english<0||english>100)
							{
								System.out.println("Invalide mark !");
							}
							else
							{
								total=py+ch+math+hindi+english;
								System.out.println(total);
							}
						}
						else
						{
							total=py+ch+math+hindi+english;
							System.out.println(total);
						}
					}
				}
			}
			else
			{
				System.out.println("Enter mark of Hindi ");
				hindi=sc.nextInt();
				if(hindi<0||hindi>100)
				{
					System.out.println("Invalide mark !\nPlease Enter valide mark");
					System.out.println("Enter mark of hindi");
					hindi=sc.nextInt();
					if(hindi<0||hindi>100)
					{
						System.out.println("Invalide mark !");
					}
					else
					{
						System.out.println("Enter mark of english");
						english=sc.nextInt();
						if(english<0||english>100)
						{
							System.out.println("Invalide mark !\nPlease Enter valide mark");
							System.out.println("Enter mark of english");
							english=sc.nextInt();
							if(english<0||english>100)
							{
								System.out.println("Invalide mark !");
							}
							else
							{
								total= py+ch+math+hindi+english;
							}
						}
					}
				}
				else
				{
					System.out.println("Enter mark of english");
					english=sc.nextInt();
					if(english<0||english>100)
					{
						System.out.println("Invalide mark !\nPlease Enter valide mark");
						System.out.println("Enter mark of english");
						english=sc.nextInt();
						if(english<0||english>100)
						{
							System.out.println("Invalide mark !");
						}
						else
						{
							total= py+ch+math+hindi+english;
						}
					}
				}
			}
		}
		}
	}
	else
	{
		System.out.println("Enter mark of ch ");
			ch=sc.nextInt();
			if(ch<0||ch>100)
			{
				System.out.println("Invalide mark !\nPlease Enter valide mark");
				System.out.println("Enter mark of ch");
				ch=sc.nextInt();
				if(ch<0||ch>100)
				{
					System.out.println("Invalide mark !");
				}
				else
				{
					System.out.println("Enter mark of math ");
					math=sc.nextInt();
					if(math<0||math>100)
					{
						System.out.println("Invalide mark !\nPlease Enter valide mark");
						System.out.println("Enter mark of math");
						math=sc.nextInt();
						if(math<0||math>100)
						{
							System.out.println("Invalide mark !");
						}
						else
						{
							System.out.println("Enter mark of Hindi ");
							hindi=sc.nextInt();
							if(hindi<0||hindi>100)
							{
								System.out.println("Invalide mark !\nPlease Enter valide mark");
								System.out.println("Enter mark of hindi");
								hindi=sc.nextInt();
								if(hindi<0||hindi>100)
								{
									System.out.println("Invalide mark !");
								}
								else
								{
									System.out.println("Enter mark of english");
									english=sc.nextInt();
									if(english<0||english>100)
									{
										System.out.println("Invalide mark !\nPlease Enter valide mark");
										System.out.println("Enter mark of english");
										english=sc.nextInt();
										if(english<0||english>100)
										{
											System.out.println("Invalide mark !");
										}
										else
										{
											total=py+ch+math+hindi+english;
											System.out.println(total);

										}
									}
									else
									{
										total=py+ch+math+hindi+english;
											System.out.println(total);
									}
								}
							}
							else
							{
								System.out.println("Enter mark of english");
								english=sc.nextInt();
								if(english<0||english>100)
								{
									System.out.println("Invalide mark !\nPlease Enter valide mark");
									System.out.println("Enter mark of english");
									english=sc.nextInt();
									if(english<0||english>100)
									{
										System.out.println("Invalide mark !");
									}
									else
									{
										total=py+ch+math+hindi+english;
										System.out.println(total);
									}
								}
								else
								{
									total=py+ch+math+hindi+english;
									System.out.println(total);
								}
							}
						}
					}
					else
					{
						System.out.println("Enter mark of Hindi ");
						hindi=sc.nextInt();
						if(hindi<0||hindi>100)
						{
							System.out.println("Invalide mark !\nPlease Enter valide mark");
							System.out.println("Enter mark of hindi");
							hindi=sc.nextInt();
							if(hindi<0||hindi>100)
							{
								System.out.println("Invalide mark !");
							}
							else
							{
								System.out.println("Enter mark of english");
								english=sc.nextInt();
								if(english<0||english>100)
								{
									System.out.println("Invalide mark !\nPlease Enter valide mark");
									System.out.println("Enter mark of english");
									english=sc.nextInt();
									if(english<0||english>100)
									{
										System.out.println("Invalide mark !");
									}
									else
									{
										total= py+ch+math+hindi+english;
									}
								}



							}
						}
						else
						{
							System.out.println("Enter mark of english");
							english=sc.nextInt();
							if(english<0||english>100)
							{
								System.out.println("Invalide mark !\nPlease Enter valide mark");
								System.out.println("Enter mark of english");
								english=sc.nextInt();
								if(english<0||english>100)
								{
									System.out.println("Invalide mark !");
								}
								else
								{
									total= py+ch+math+hindi+english;
								}
							}
							else
							{
								total= py+ch+math+hindi+english;
							}
						}
					}
				}
			}
		else
		{
			System.out.println("Enter mark of math ");
			math=sc.nextInt();
			if(math<0||math>100)
			{
				System.out.println("Invalide mark !\nPlease Enter valide mark");
				System.out.println("Enter mark of math");
				math=sc.nextInt();
				if(math<0||math>100)
				{
					System.out.println("Invalide mark !");
				}
				else
				{
					System.out.println("Enter mark of Hindi ");
					hindi=sc.nextInt();
					if(hindi<0||hindi>100)
					{
						System.out.println("Invalide mark !\nPlease Enter valide mark");
						System.out.println("Enter mark of hindi");
						hindi=sc.nextInt();
						if(hindi<0||hindi>100)
						{
							System.out.println("Invalide mark !");
						}
						else
						{
							System.out.println("Enter mark of english");
							english=sc.nextInt();
							if(english<0||english>100)
							{
								System.out.println("Invalide mark !\nPlease Enter valide mark");
								System.out.println("Enter mark of english");
								english=sc.nextInt();
								if(english<0||english>100)
								{
									System.out.println("Invalide mark !");
								}
								else
								{
									total=py+ch+math+hindi+english;
									System.out.println(total);
								}
							}
							else
							{
								total=py+ch+math+hindi+english;
									System.out.println(total);
							}
						}
					}
					else
					{
						System.out.println("Enter mark of english");
						english=sc.nextInt();
						if(english<0||english>100)
						{
							System.out.println("Invalide mark !\nPlease Enter valide mark");
							System.out.println("Enter mark of english");
							english=sc.nextInt();
							if(english<0||english>100)
							{
								System.out.println("Invalide mark !");
							}
							else
							{
								total=py+ch+math+hindi+english;
								System.out.println(total);
							}
						}
						else
						{
							total=py+ch+math+hindi+english;
							System.out.println(total);
						}
					}
				}
			}
			else
			{
				System.out.println("Enter mark of Hindi ");
				hindi=sc.nextInt();
				if(hindi<0||hindi>100)
				{
					System.out.println("Invalide mark !\nPlease Enter valide mark");
					System.out.println("Enter mark of hindi");
					hindi=sc.nextInt();
					if(hindi<0||hindi>100)
					{
						System.out.println("Invalide mark !");
					}
					else
					{
						System.out.println("Enter mark of english");
						english=sc.nextInt();
						if(english<0||english>100)
						{
							System.out.println("Invalide mark !\nPlease Enter valide mark");
							System.out.println("Enter mark of english");
							english=sc.nextInt();
							if(english<0||english>100)
							{
								System.out.println("Invalide mark !");
							}
							else
							{
								total= py+ch+math+hindi+english;
							}
						}
					}
				}
				else
				{
					System.out.println("Enter mark of english");
					english=sc.nextInt();
					if(english<0||english>100)
					{
						System.out.println("Invalide mark !\nPlease Enter valide mark");
						System.out.println("Enter mark of english");
						english=sc.nextInt();
						if(english<0||english>100)
						{
							System.out.println("Invalide mark !");
						}
						else
						{
							total= py+ch+math+hindi+english;
						}
					}
					else
					{
						total= py+ch+math+hindi+english;
						System.out.println(total);
					}
				}
			}
		}
	}
	}
}