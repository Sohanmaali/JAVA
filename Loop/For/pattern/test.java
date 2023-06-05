import java.util.Scanner;
class Test
{

	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int row = sc.nextInt();
		int i,j;
		/*while(i<=3)
		{
			int j=1;
			while(j<=5)
			{
				System.out.println(i+" "+j);
				j++;
			}
			i++;
			//System.out.print("\n");
		}
		*/
	/*	while(i<=2)
		{
			int j=1;
			while(j<=2)
			{
				int	k=1;
				while(k<=5)
				{
					System.out.println(i+" "+j+" "+k);
					k++;
				}
				j++;
			}
			i++;
			//System.out.print("\n");
		}
	
	*/
		/*for(int i=1;i<=row;i++)
		{
			//char ch = (char)i;
			System.out.print(i+" = "+(char)i);
			
			System.out.print("\n");
		}*/
		//System.out.print(10/0);
		
	/*	int a=2,b=3,c=5,d=4;
		int e = a-b+c;             //4
		System.out.println(e);
		e = a+b-c;                  //0
		System.out.println(e);
		e = a*b*c/d;                //7
		System.out.println(e);
		e = a+b-c/d;                //4
		System.out.println(e);
		e = a+b-c*d;                //-15
		System.out.println(e);
		*/
	
	/*for (i=1;i<=5;i++)
	{
		if(i>2)
		{
			break;           //  1  2
		}
		System.out.print(i+" ");
	}
	*/
	/*for (i=1;i<=5;i++)
	{
		System.out.print(i+" ");
		if(i<=4)
		{
			continue;           //  1 2 3 4 5
		}
		
	}*/
	
	/*for (i=1;i<=5;i++)
	{
		
		if(i<=4)
		{
			System.out.print(i++ +" ");
			continue;           //  1 3 
		}
		
	}*/
	
	/*for (i=1;i<=5;i++)
	{
		for (int j=1;j<=3;j++)
		{
			System.out.println(i +" "+j);
			if(j>1)
			{
				
				break;          //  1 1 1 2 2 1 2 2 3 1 3 2 4 1 4 2 5 1 5 2
			}
		}
	}*/
	/*for(i=1;;)
	{
		System.out.println(i++);
		if(i>=10)			// 1 to 9
		{
			break;
		}
	}*/
	/*for(i=1;;)
	{
		System.out.println(i++);
		if(i<=5)			// 1 
		{
			break;
		}
	}*/
	
	/*for(i=1;;)
	{
		System.out.println(i++);
		if(i>=5)			// 1 to 4
		{
			break;
		}
	}*/
	
	/*for (i=1;i<=10;i++)
	{
		System.out.println(i);
		if(i>=10)
		{
			break;
			continue;
			
		}
	}*/
	
	/*for (i=1;i<=10;i++)
	{
		for (int j=1;;)
		{
			System.out.print(j++);
			if(j>3)
			{
				break;			
			}
		}
		System.out.println();
	}*/
	
	/*for(i=2;i<2;)
	{
		for(j=1;;)
		{
			j=i+j;
			System.out.println(j);
			if(i>=8)			// null
			{
				break;
			}
		}
	}*/
	
	/*for(i=1;i<=3;i++);
	{
		System.out.println(i);
		if(i<2)						// error
		{
			break;
		}
	}
	*/
	
	/*for(i=0;;i++)
	{
		
		if(i==4)						// 0 to 3
		{
			break;
		}
		System.out.println(i);
	}*/
	
	/*for(i=0;i<=2;i++)
	{
		for(j=1;j<=3;j++)
		{
			if(j==2)						// 1 1 1 
			break;
			System.out.println(j);
		}
		
	}*/
	
	/*for(i=1;i<=5;i++)
	{
		for(j=1;j<=5;j++)
		{
			if(i==1&&j==2)						// null 
			break;
		}
	}
	*/
	
		/*for(i=1;i<=3;i++)
		{
			for(j=0;j<=3;j++)
			{
				if(i==1&&j==2)	
				break;						//1 0, 1 1, 2 0, 2 1, 2 2, 2 3, 3 0, 3 1, 3 2, 3 3
				System.out.print(i+" "+j+" ");
			}
		}
    */
	
	/*	for(i=1;i<=5;i++)
		{
			if(i==5)						// 5 
			break;
		}
		System.out.print(i);
		*/
		
		/*for(i=1;i<5;i++)
		{
			for(j=1;j<=3;j++)
			{
				System.out.print(i+" "+j+" ");
				if(i==2)	
				break;						//1 1, 1 2, 1 3, 2 1, 3 1, 3 2, 3 3, 4 1, 4 2, 4 3
			}
		} */
		
		/*for(i=1;i<20;i++)
		{
			if(i==6)						// 1 2 3 4 5
				break;	
			System.out.print(i+" ");
		}*/
		
	/*	for(i=1;i<10;i++)
		{
			for(j=1;j<=10;j++)
			{
				if(i%3==0)						// 1 1 1 2 1 3 1 4 1 5 1 6 1 7 1 8 1 9 1 10 2 1 2 2 2 3 2 4 2 5 2 6 2 7 2 8 2 9 2 10 4 1 4 2 4 3 4 4 4 5 4 6 4 7 4 8 4 9 4 10 5 1 5 2 5 3 5 4 5 5 5 6 5 7 5 8 5 9 5 10 
												// 7 1 7 2 7 3 7 4 7 5 7 6 7 7 7 8 7 9 7 10 8 1 8 2 8 3 8 4 8 5 8 6 8 7 8 8 8 9 8 10
					break;	
				System.out.print(i+" "+j+" ");
			}
		}*/
		
	/*	for(i=1;i<=5; i++)
		{
			for(j=1;j<5-i;j++)
			{
				System.out.print("-");
			}
			for(j=1;j<5-i;j++)
			{
				System.out.print("-");
			}
			
			System.out.print("\n");
		}*/
		/*for(i=0;i<=2;i++)
		{
			for(j=0;j<=3;j++)
			{
				if(j==2)
					break;
				System.out.print(j+" ");
			}
			
		}*/
		//----------------------continue----------------------
		
		/*	for(j=1;j<=10;j++)
			{
				if(j<=4)
					continue;			// 5 6 7 8 9 10
				System.out.print(j+" ");
			}
			*/
		/*for(i=1;i<=10;i++)
		{
			for(j=1;j<=10;j++)  		//i 	j
			{							//1   1->10
				if(i>=2&&j>=1)
					continue;
				System.out.println(i+" "+j+" ");
			}
			
		}*/
		/*for(i=1;i<=10;i++)
		{
			if(4<i)
				continue;			// 1->4
			System.out.println(i+" ");
		}
		*/
		/*for(i=1;i<=5;i++);
		{
			System.out.println(i);
			for(j=1;j<=i;j++)  		
			{		
				System.out.println(i+" "+j+" ");	//	i 	j
				if(j<=2)                            //  6   1->6
					continue;
			}
		}
		*/
		/*
			for(j=1;j<=1;j++)  		
			{		
				if(j<=2)                            
					continue;
			}
			System.out.println(j+" ");		//2
			*/
			
		/*	for(j=8;j>=5;j--)  		
			{	
				for(i=1;i<=3;i++)
				{
					System.out.println(j+" ");
					if(j>=2)                            
					continue;
					System.out.println(i+" ");     //888 777 666 555
				}
			}
			*/
			
		/*	for(i=1;i<=3;i++)  		
			{	
				for(j=1;j<=3;j++)
				{
					if(i>2)    
					{                        
						continue;
						System.out.println(j+" ");   //error: unreachable statement
					}
					System.out.println(j+" "); 
				}
			}
			*/
	/*	for(i=1;i<=5;i++)  		
		{	
			System.out.println(i+" ");
			for(j=1;j<=i;j++)
			{
				System.out.println(i+" "+j+" "); 
				if(i==j)    
				{                        // right
					continue;					   
				}
			}
		}
		*/
		/* for(i=1;i<=8;i++)  		
		{	
			if(i==3)                       
				continue;
			System.out.println(i++ +" ");   // 1 4 6 8
		}	
		*/
	/*	for(i=1;i<=10;i++)  		
		{	
			if(i==8)                       
				continue;
			else
			System.out.println(++i +" ");   // 2 4 6 8 10	
		}
		*/
	
	/*for(i=1;i<=8;i++)  		
	{	
		for(j=1;j<=3;j++)
		{			
			System.out.println(i +" "+j);   // 	
			if(j>=2)                       
			continue;
		}		
	}*/
	/*for(i=1;i<=10;i++)  		
 	{
		for(j=10;j>=i;j--)
		{			  	
			if(i>=4)                     
			continue;
			System.out.println(i +" "+j);
		}
    }	*/	
	/*i=6;
	j=9;
	i=i^j;
	j=i^j;
	i=i^j;
	System.out.println("I = "+i+" J = "+j);
	*/
	/*if(row==(row/2)*2)
		System.out.println("Even ");
	else
		System.out.println("odd");
	*/
	}
}