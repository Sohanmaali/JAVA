import java.util.Scanner; 
class box 
    {
        int width;
        int height;
        int length;
        int volume;
		public void volume(int height, int length, int width) 
        {
            volume = width*height*length;
        } 
    } 
class Test
{
	public static void display(Test k)
	{
		System.out.println("Hello Display");
		//this.show();
	}
	
	public void show()
	{
		System.out.println("Hello Show");
	}
	/*
	public void pc()
	{
		System.out.println("Hello PC");
	}
	*/
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		Test ob = new Test();
		 display(ob);
	
        box obj = new box();
        obj.height = 1;
        obj.length = 5;
        obj.width = 5; 
        obj.volume(3,2,1);
        System.out.println(obj.volume);        
	}
}