import java.io.*;  

class PrimeCopy
{  
	public static void main(String args[]) throws Exception
	{
		
		FileOutputStream fout=new FileOutputStream("D:/JAVA/IO/File/F1_copy.txt");
		int i;
		
		FileInputStream fis = new FileInputStream("D:/JAVA/IO/File/F11.txt");
		while((i = fis.read())!=-1) 
		{
           // char c = (char)i;
            fout.write(i);
            // System.out.print(c);
        }
		fout.close();
		fis.close();
	}
}x