class Main{
	public static void main(String[] args)
	{
		int arr[] = new int[3];
		int size = 0;
		int i = 0;
		try
		{
			for(;i<args.length;i++)
			{
				arr[i]= Integer.parseInt(args[i]);
				size++;
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
		for(int j=0;j<i;j++)
		{
			System.out.println(arr[j]);
		}
	}
	
}