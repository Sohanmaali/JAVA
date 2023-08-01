class Test {

	public static void main(String[] args)
	{
		String s1 = new String("Sohan");
		String s2 = new String("maali");
		char ch[] = {'k','a','m','l'};
		int a = 10;
		
		// System.out.println(s1.charAt(2));
		
		//System.out.println(s1.length());
		
		/* if(s1==s2)  //refreance compare
		{
			System.out.println("HY");
		}
		else
		{
			
			System.out.println("BY");
		} */
		
		/* if(s1.equals(s2)) //value compare
		{
			System.out.println("HY");
		}
		else
		{
			
			System.out.println("BY");
		} */
	
		/* if(s1.equalsIgnoreCase(s3)) //value compare
		{
			System.out.println("HY");
		}
		else
		{
			
			System.out.println("BY");
		} */
		
		// System.out.println(s1.indexOf('h'));
		
		// System.out.println(s1.toLowerCase());
	
		// System.out.println(s1.toUpperCase());
		
		// System.out.println(s1.trim());
		
		// System.out.println(s1.substring(1));
		
		// System.out.println(s1.substring(1,4));

		// System.out.println(s1.subsequance(1,4));
		
		// System.out.println(ch.toString());
		
		// System.out.println(s1.isEmpty());
		
		/* s1 = s1.concat(s2);
		System.out.println(s1); */
		
		StringBuffer s3 = new StringBuffer(100);
		StringBuffer s4 = new StringBuffer("sohan");
		s3.append(s4);
		System.out.println(s3.capacity()); 
		
		
	}
}