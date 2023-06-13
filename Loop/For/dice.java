import java.util.Scanner;
class Dice
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
		
		/*do
		{
			do
			{
				
				System.out.println("\tTurm of "+name1+" \n\tcontinue for 1 Exit For e");
				turm = sc.next().charAt(0);
				if(turm=='e'||turm=='E')
				{
					System.exit(0);
				}
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
				
				sum1 = ((sum1==95&&(a>=1&&a<=5))?sum1+=a:(sum1+=0));
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
					System.out.println("\tTurm of "+name2+"\n\tcontinue for 2 Exit For e");
					
					turm = sc.next().charAt(0);
					if(turm=='e'||turm=='E')
					{
						System.exit(0);
					}
					
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
				
					sum2 = ((sum2==95&&(b>=1&&b<=5))?sum2+=b:(sum2+=0));
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
		*/
		
		do
		{
			do
			{
				
				System.out.println("\tTurm of "+name1+" \n\tcontinue for 1 Exit For e");
				turm = sc.next().charAt(0);
				if(turm=='e'||turm=='E')
				{
					System.exit(0);
				}
				if(turm!='1')
				{
					System.out.println("\tNot your turm");
				}				
				
			}while(turm!='1');
			
			switch(turm)
			{
				int a =(int) (Math.random()*6)+1;
				
				sum1 = (sum1==87?93:(sum1+=0));
				//snack part start
				switch(sum1)
				{
					case '99':
						sum1=26;
						break;
					case '96':
						sum1=86;
						break;
					case '90':
						sum1=68;
						break;
					case '50':
						sum1=34;
						break;
					case '35':
						sum1=5;
						break;
					case '39':
						sum1=3;
						break;
					//snack part End
				
				
					//climbe part start
					case '28':
						sum1=77;
						break;
					case '2':
						sum1=23;
						break;
					case '7':
						sum1=29;
						break;
					case '30':
						sum1=32;
						break;
					case '22':
						sum1=41;
						break;
					case '44':
						sum1=58;
						break;
					case '54':
						sum1=69;
						break;
					case '70':
						sum1=90;
						break;
					case '83':
						sum1=83;
						break;
					case '87':
						sum1=93;
						break;
					case '0':
						sum1+=a;
					case '95' 
						sum1 = (a>=1&&a<=5)?sum1+=a:(sum1+=0));
						break;
					case '98'
				sum1 = (a==1||a==2)?sum1+=a:(sum1>=0&&sum1<95?sum1+=a:(sum1+=0)));
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