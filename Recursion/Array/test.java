
class OuterClass 

{
	public int outer_x = 10;
	int outer_y = 20;
	private int outer_private = 30;

	public class nestedClass 
	{
		public void display()
		{
			System.out.println("outer_x = " + outer_x);
			System.out.println("outer_private = "+ outer_private);
			OuterClass out = new OuterClass();
			System.out.println("outer_y = " + out.outer_y);
		}
	}	
}
class Test
{
	public static void main(String[] args)
	{
		OuterClass ob1 = new OuterClass();
		ob1.nestedClass ob = new ob1.nestedClass();
		ob.display();
	}
}