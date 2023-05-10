package programcorejava;

import java.util.Scanner;

public class Programtestloop7 {
	
	// Assignment 4- Take the username and password from enduser and
	//                check the condition login success or fail

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter username");
		String uname = s.next();
		
		System.out.println("Enter password");
		String upassword = s.next();
		
		
		if(uname.equals("Govind013") && upassword.equals("Govind123"))
			
		System.out.println("Login sucessfull");
		
		else{
			System.out.println("Login failed : please enter correct username or password");
		}
	
		
		
		
	}

}
