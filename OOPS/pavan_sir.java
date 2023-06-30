import java.util.Scanner;
class Student {
    private String studentName;
    private int[][] semesterMarks;
	
	public void setMark(int x[][],int i,int n)
	{
		this.semesterMarks = x;
	}
	public int[][] getMark()
	{
		return semesterMarks;
	}
}
class Main 
{
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        Student[] students = new Student[100];
		
		int mark[][] = new int[2][5];
		int mark1[][] = new int[2][5];
		int physics,chemistry,math,hindi,english;
		
		for(int i=0;i<2;i++)
		{
			students[0] = new Student();
			for(int j=0;j<5;j++)
			{
				mark[i][j] = sc.nextInt(); 
			}
		}
		
		students[0].setMark(mark,0,5);
		mark1= students[0].getMark();
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(mark1[i][j]+" "); 
			}
			System.out.println(" ");
		}
    }
}
