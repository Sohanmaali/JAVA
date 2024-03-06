import java.util.Scanner;
class Test
 {
   public static void main(String args[])
    {
	  Scanner sc=new Scanner (System.in);
	  int a[][]=new int[5][5];
	  System.out.println("Enter dimension of matrix");
	  int m=sc.nextInt();
	  int n=sc.nextInt();
	  System.out.println("Enter the  elements matrix ");
	  int i,j;
	  int max=0,max2=0;
	  for(i=0;i<m;i++)
	   {
		 for(j=0;j<n;j++)
	     {		 
	      a[i][j]=sc.nextInt();	 	   
	     }
	   }
	    System.out.println("actual matrix are");
	    for(i=0;i<m;i++)
	    {
          for(j=0;j<n;j++)
		  {
            System.out.print("\t"+a[i][j]);			 
          }
		  System.out.println("");
	    }
	    for(i=0;i<m;i++)
	    {
          for(j=0;j<n;j++)
		  {
			  if(max<a[i][j])
			  {
			     max2=max;
				 max=a[i][j]; 
			  }
              else if(a[i][j]<max&&max2<a[i][j])
              {
			     max2=a[i][j];
			  }			
          }
	    }
	    System.out.println("1st max element"+max);
	    System.out.println("2nd max element"+max2);
	}
 }	 
	   