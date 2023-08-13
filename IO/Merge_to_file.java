import java.io.*;  

class MergeFile
{  
	public static void main(String args[]) throws Exception
	{
		
		FileOutputStream fout=new FileOutputStream("D:/JAVA/IO/File/Merge_F1_F2.txt", true);
		int i;
		
		FileInputStream fis = new FileInputStream("D:/JAVA/IO/File/F1.txt");
		FileInputStream fis_1 = new FileInputStream("D:/JAVA/IO/File/F2.txt");
		while((i = fis.read())!=-1) 
		{
            fout.write(i);
        }
		fis.close();
		while((i = fis_1.read())!=-1) 
		{
            fout.write(i);
        }
		fis_1.close();
		fout.close();
	}
}