import java.io.*;  

class Prime
{  
	public static void main(String args[]) throws Exception
	{
		FileOutputStream fout=new FileOutputStream("D:/JAVA/IO/File/F1.txt");    
		int count = 0;
		for(int i=2;;i++)
		{
			int temp = 0;
			for(int j = 2;j<i;j++)
			{
				if(i%j==0)
				{
					temp++;
				}
			}
			if(temp==0)
			{
				String s = Integer.toString(i);
				s+= ", ";
				byte a[]= s.getBytes();
				count++;
				fout.write(a);
			}
			if(count ==100)
			{
				break;
			}
		}
		
		FileInputStream fis = new FileInputStream("D:/JAVA/IO/File/F1.txt");
		while((int i = fis.read())!=-1) 
		{
           char c = (char)i;
            
            // prints
            System.out.print(c);
        }
	}
}