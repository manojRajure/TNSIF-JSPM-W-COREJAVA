package com.daysix.usingfinal;
final class FinalClass{
	void show() {
		System.out.println("Final class can not be inherited");
	}
}

//The type demo cannot subclass the final class FinalClass
//class demo extends FinalClass{
//	
//}
public class FinalClassDemo {
	
	public static void main(String[] args) {
		FinalClass fc=new FinalClass();
		fc.show();
	}

}
