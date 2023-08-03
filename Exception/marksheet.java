class MarkSheetNumberException extends Exception
{
	public MarkSheetNumberException(){}
	
	public MarkSheetNumberException(String msg)
	{
		super(msg);
	}
}

class ValidMark
{
	int arr[];
	public ValidMark(){}
	
	public ValidMark(int arr[])
	{
		this.arr  = arr;
	}
	
	public void validMark(int i)throws MarkSheetNumberException
	{
		
		if (arr[i]>100)
		{
			throw new MarkSheetNumberException ("Mark not be greater then 100");
		}
		else if(arr[i]<0)
		{
			throw new MarkSheetNumberException ("Mark not be less then 0");
		}
		else
		{
			System.out.println("Marks of "+(i+1)+" subject : "+arr[i]);
		}
	}
}
class Test
{
	public static void main(String[]args)
	{
		int arr [] = new int [50];
		var i = 0;
		try 
		{
			for(;i<args.length && i<arr.length;i++)
			{
				arr[i]= Integer.parseInt(args[i]);
			}
			ValidMark ob = new ValidMark(arr);
			for(var j=0;j<i;j++)
			{
				ob.validMark(j);
			}	
		}
		catch(NumberFormatException | MarkSheetNumberException e)
		{  
			System.out.println(e.getMessage());  
		}   
	}
}