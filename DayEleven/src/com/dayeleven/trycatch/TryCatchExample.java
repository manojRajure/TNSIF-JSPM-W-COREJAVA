package com.dayeleven.trycatch;

public class TryCatchExample {
	
	static void performDivisio(int x, int y)
	{
		int z;
	
		try{
			System.out.println("i am in method ");
		
		 z=x/y;
		System.out.println("result of z :"+ z);
		
	} 
		catch(ArithmeticException e)
		{
			
			System.err.println("i am in catch block :"+e.getMessage());
			
		}
}

}
