import java.io.*;  

class Power
{  
	public static void main(String args[]) throws Exception
	{
		
		FileOutputStream fout=new FileOutputStream("D:/JAVA/IO/File/F1.txt");    
		
		for(int i = 1;i<=100;i++)
		{
			String s = Integer.toString(i*i);
			s += ", ";
			byte a[] = s.getBytes();
			fout.write(a);
		}
		fout.close();
		System.out.println("success...");	
	}
}