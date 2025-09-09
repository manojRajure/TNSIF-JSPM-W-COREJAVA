package com.dayFive.firstPackage;

public class Executor {

	public static void main(String[] args) {
				Base b1=new Base();
				b1.methodDefault();
				b1.methodProtected();
				b1.methodPublic();

				b1.varDefault=11;
				b1.methodDefault();
				
			
				
				b1.varProtected=21;
				b1.methodProtected();
				
				b1.varPublic=41;
				b1.methodPublic();

	}

}
