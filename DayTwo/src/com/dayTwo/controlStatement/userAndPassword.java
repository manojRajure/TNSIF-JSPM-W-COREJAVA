package com.dayTwo.controlStatement;

public class userAndPassword {
	public static void main(String[] args) {
		String username="manoj";
		String password="manoj123";
		
		if(username=="manoj" && password=="manoj123") {
			System.out.println("Thank You for Login");
		}else {
			if(username!="manoj") {
				System.out.println("Username is not Correct ! Try Again");
				
			}else{
				System.out.println("Password is not Correct ! try Again");
			}
		}
	}

}
