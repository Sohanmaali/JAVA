import java.util.Scanner;
class Pansa
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(sum<=100)
		{
			int a =(int) (Math.random()*6)+1;
			
			if(sum==99)
			{
				sum=26;
			}
			else if(sum==96)
			{
				sum=86;
			}
			else if(sum==90)
			{
				sum=68;
			}
			else if(sum==50)
			{
				sum=34;
			}
			else if(sum==35)
			{
				sum=5;
			}
			else if(sum==39)
			{
				sum=3;
			}
			else if(sum==28)
			{
				sum=77;
			}
			else if(sum==2)
			{
				sum=23;
			}
			else if(sum==7)
			{
				sum=29;
			}
			else if(sum==30)
			{
				sum=32;
			}
			else if(sum==22)
			{
				sum=41;
			}
			else if(sum==44)
			{
				sum=58;
			}
			else if(sum==54)
			{
				sum=69;
			}
			else if(sum==70)
			{
				sum=90;
			}
			else if(sum==80)
			{
				sum=83;
			}
			else if(sum==87)
			{
				sum=93;
			}
			if (sum==100)
			{
				break;
			}
			else if(sum==95&&(a==1||a==2||a==3||a==4||a==5))
			{	
				sum+=a;
			}
			else if(sum==98&&a==1||a==2)
			{
				sum+=a;
			}
			else if(sum>=0&&sum<95)
			{
				sum+=a;
			}
			System.out.println(a+" "+sum);
		}
		
		System.out.print("Congratulation you Win !");
	}
}


class Sanp
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Dice  Place");
		while(sum<=100)
		{
			int a =(int) (Math.random()*6)+1;
			sum = (sum==99?sum=26:(sum==96?sum=86:(sum==90?sum=68:(sum+=0))));
			sum = (sum==50?sum=34:(sum==35?sum=5:(sum==39?sum=3:(sum+=0))));
			sum = (sum==28?sum=77:(sum==2?sum=23:(sum==7?sum=29:(sum+=0))));
			sum = (sum==30?sum=32:(sum==22?sum=41:(sum==44?sum=58:(sum+=0))));
			sum = (sum==54?sum=69:(sum==70?sum=90:(sum==80?sum=83:(sum+=0))));
			sum = (sum==87?sum=93:(sum+=0));
			if (sum==100)
			{
				break;
			}
			sum = ((sum==95&&(a==1||a==2||a==3||a==4||a==5))?sum+=a:(sum+=0));
			sum = ((sum==98&&a==1||a==2)?sum+=a:(sum>=0&&sum<95?sum+=a:(sum+=0)));
			
			System.out.println(a+"       "+sum);
		}
		System.out.print("Congratulation you Win !");
	}
}



class TwoPlayer
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int sum1 = 0;
		int sum2 = 0;
		
		char turm;
		System.out.println("\tEnter Name of First player");
		String name1 = sc.nextLine();
		
		System.out.println("\tEnter Name of Second player");
		String name2 = sc.nextLine();
		
		do
		{
			do
			{
				System.out.println("\tTurm of "+name1+" \n\t");
				turm = sc.next().charAt(0);
				if(turm!='1')
				{
					System.out.println("\tNot your turm");
				}
			}while(turm!='1');
			
			switch(turm)
			{
				case '1':
				int a =(int) (Math.random()*6)+1;
				sum1 = (sum1==99?26:(sum1==96?86:(sum1==90?68:(sum1+=0))));
				sum1 = (sum1==50?34:(sum1==35?5:(sum1==39?3:(sum1+=0))));
				
				sum1 = (sum1==28?77:(sum1==2?23:(sum1==7?29:(sum1+=0))));
				sum1 = (sum1==30?32:(sum1==22?41:(sum1==44?58:(sum1+=0))));					
				sum1 = (sum1==54?69:(sum1==70?90:(sum1==80?83:(sum1+=0))));
				sum1 = (sum1==87?93:(sum1+=0));
				
				sum1 = ((sum1==95&&(a==1||a==2||a==3||a==4||a==5))?sum1+=a:(sum1+=0));
				sum1 = ((sum1==98&&a==1||a==2)?sum1+=a:(sum1>=0&&sum1<95?sum1+=a:(sum1+=0)));
				
				System.out.println("\tDice  Place\n\t");
				System.out.println("\t"+a+"       "+sum1);
				System.out.println("__________________________________________\n");
			
				if (sum1==100)
				{
					break;
				}
				do
				{	
					System.out.println("\tTurm of "+name2+"\n\t");
					turm = sc.next().charAt(0);
					if(turm!='2')
					System.out.println("\tNot your turm");
				}while(turm!='2');
		
				case '2':
					int b =(int) (Math.random()*6)+1;
					sum1 = (sum1==99?26:(sum1==96?86:(sum1==90?68:(sum1+=0))));
				sum1 = (sum1==50?34:(sum1==35?5:(sum1==39?3:(sum1+=0))));
				sum1 = (sum1==28?77:(sum1==2?23:(sum1==7?29:(sum1+=0))));
				sum1 = (sum1==30?32:(sum1==22?41:(sum1==44?58:(sum1+=0))));					
				sum1 = (sum1==54?69:(sum1==70?90:(sum1==80?83:(sum1+=0))));
				sum1 = (sum1==87?93:(sum1+=0));
				
					sum2 = ((sum2==95&&(b==1||b==2||b==3||b==4||b==5))?sum2+=b:(sum2+=0));
					sum2 = ((sum2==98&&b==1||b==2)?sum2+=b:(sum2>=0&&sum2<95?sum2+=b:(sum2+=0)));
				
					System.out.println("\tDice  Place\n\t");
					System.out.println("\t"+b+"       "+sum1);
					System.out.println("__________________________________________\n");
				
				if (sum2==100)
				{
					break;
				}
			}
		}while(sum1!=100&&sum2!=100);
		
		if(sum1==100)
		{
			System.out.print("Congratulation "+name1+" You Win !");
		}
		else if (sum2==100)
		{
			System.out.print("Congratulation "+name2+" You Win !");
		}
	}
}

class Dice1
//not compilde
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int sum1 = 0;
		int sum2 = 0;
		
		char turm;
		System.out.println("\tEnter Name of First player");
		String name1 = sc.nextLine();
		
		System.out.println("\tEnter Name of Second player");
		String name2 = sc.nextLine();
		
		do
		{
			do
			{
				System.out.println("\tTurm of "+name1+" \n\t");
				turm = sc.next().charAt(0);
				if(turm!='1')
				{
					System.out.println("\tNot your turm");
				}
			}while(turm!='1');
			
			switch(turm)
			{
				case '1':
				int a =(int) (Math.random()*6)+1;
				
				switch(sum1)
				{
					case 99:
						sum1=26;
						System.out.println("\tSnake Bite");
						break;
						
					case 96:
						sum1=86;
						System.out.println("\tSnake Bite");
						break;
						
					case 50:
						sum1 = 34;
						System.out.println("\tSnake Bite");
						break;
					
					case 35:
						sum1 = 5;
						System.out.println("\tSnake Bite");
						break;
					
					case 39:
						sum1 = 3;
						System.out.println("\tSnake Bite");
						break;
					
					case 28:
						sum1 = 77;
						System.out.println("\tClambing lader");
						break;
					
					case 2:
						sum1 = 23;
						System.out.println("\tClambing lader");
						break;
					
					case 7:
						sum1 = 29;
						System.out.println("\tClambing lader");
						break;
					
					case 54:
						sum1 = 69;
						System.out.println("\tClambing lader");
						break;
					
					case 70:
						sum1 = 90;
						System.out.println("\tClambing lader");
						break;
					
					case 80:
						sum1 = 83;
						System.out.println("\tClambing lader");
						break;
					
					case 87:
						sum1 = 93;
						System.out.println("\tClambing lader");
						break;
						
					case 95:
						if(sum1+a<=100)
							sum1+=a;
						break;
					case 98:
						if(sum1+a<=100)
							sum1+=a;
						break;
						
					default:
						sum1+=a;
				}

				System.out.println("\tDice  Place\n\t");
				System.out.println("\t"+a+"       "+sum1);
				System.out.println("__________________________________________\n");
			
				if (sum1==100)
				{
					break;
				}
				do
				{	
					System.out.println("\tTurm of "+name2+"\n\t");
					turm = sc.next().charAt(0);
					if(turm!='2')
					System.out.println("\tNot your turm");
				}while(turm!='2');
		
				case '2':
					int b =(int) (Math.random()*6)+1;
					
					switch(sum1)
					{
						case 99:
							sum2=26;
							System.out.println("\tSnake Bite");
							break;
						
						case 96:
							sum2=86;
							System.out.println("\tSnake Bite");
							break;
						
						case 50:
							sum2 = 34;
							System.out.println("\tSnake Bite");
							break;
					
						case 35:
							sum2 = 5;
							System.out.println("\tSnake Bite");
							break;
					
						case 39:
							sum2 = 3;
							System.out.println("\tSnake Bite");
							break;
					
						case 28:
							sum2 = 77;
							System.out.println("\tClambing lader");
							break;
					
						case 2:
							sum2 = 23;
							System.out.println("\tClambing lader");
							break;
					
						case 7:
							sum2 = 29;
							System.out.println("\tClambing lader");
							break;
					
						case 54:
							sum2 = 69;
							System.out.println("\tClambing lader");
							break;
					
						case 70:
							sum2 = 90;
							System.out.println("\tClambing lader");
							break;
					
						case 83:
							sum2 = 83;
							System.out.println("\tClambing lader");
							break;
					
						case 87:
							sum2 = 93;
							System.out.println("\tClambing lader");
							break;
					
						case 90:
							sum2 = 68;
							System.out.println("\tClambing lader");
							break;
					
						case 95:
							if(sum2+b<=100)
								sum2+=b;
							break;
						case 98:
							if(sum2+b<=100)
								sum2+=b;
							break;
						
						default:
						sum2+=b;
					}								
					System.out.println("\tDice  Place\n\t");
					System.out.println("\t"+b+"       "+sum1);
					System.out.println("__________________________________________\n");
				if (sum2==100)
				{
					break;
				}
			}
			if (sum2==100||sum1==100)
				{
					break;
				}
		}while(sum1!=100&&sum2!=100);
		
		if(sum1==100)
		{
			System.out.print("Congratulation "+name1+" You Win !");
		}
		else if (sum2==100)
		{
			System.out.print("Congratulation "+name2+" You Win !");
		}
	}
}