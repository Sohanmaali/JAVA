class Main{
	public static void main(String[] args)
	{
		int arr[] = new int[3];
		try
		{
			for(int i=0;i<args.length;i++)
			{
				arr[i]= Integer.parseInt(args[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException ref)
		{
			System.out.println("Array size most be equal or less then 3");
		}
		catch(NumberFormatException ref)
		{
			System.out.println(ref);
		}
		for(int x:arr)
		{
			System.out.println(x);
		}
	}
	
}