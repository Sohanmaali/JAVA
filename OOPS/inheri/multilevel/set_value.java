class Alfa
{
	int x;
	public void setvalue(int x)
	{
		
		this.x=x;
	}
	public void showx()
	{
		System.out.println("Value of X = "+x);
	}
	class Sohan
	{
		public void show()
		{
			System.out.println("Hy i am sohan");
		}
	}
}
class Beta extends Alfa
{
	int y;

	public void setvalue(int x,int y)
	{
		this.setvalue(x);
		this.y=y;
	}
	public void showy()
	{
		this.showx();
		System.out.println("Value of Y = "+y);
	}
}
class Gama extends Beta
{
	int z;
	public void setvalue(int x,int y,int z)
	{
		this.setvalue(x,y);
		this.z=z;
	}
	public void showZ()
	{
		this.showy();
		System.out.println("Value of Z = "+z);
	}
}
class Main
{
	public static void main(String args[])
	{
		Gama obj = new Gama();
		obj.setvalue(5,7,9);
		obj.showZ();
		Alfa ob = new Alfa();
		Alfa. Sohan ob1 = ob.new Sohan();
		ob1.show();
	}
}