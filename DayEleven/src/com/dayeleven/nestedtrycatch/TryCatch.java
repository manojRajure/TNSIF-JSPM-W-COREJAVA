package com.dayeleven.nestedtrycatch;

public class TryCatch {
	public static void check()
	{
		String str="TNS";
		int slenght=str.length();   //
		System.out.println("String lenght : "+ slenght);
		
		String anotherString=null;
		
		int y=6;
		try {
			
			try {
				System.out.println(str.charAt(y));
				
			}
			catch (StringIndexOutOfBoundsException e)
			{
				System.err.println("Index is out of bound "+e.getMessage());
			}
			System.out.println("String lenght : "+ anotherString.length());
		}
		catch (NullPointerException np) {
			System.err.println(np.getMessage());
		}
	}
}
