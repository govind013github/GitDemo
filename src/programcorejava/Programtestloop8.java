package programcorejava;

import java.util.Scanner;

public class Programtestloop8 {
	
	//Assignment 6 - Take the day from enduser
	// mon tue wed : print the discount 5%
	// thus frid : print the discount 4%
	// sat sund : print the discount 3%
	// when enter incorrect info give proper error msg.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the day");
		String day=s.nextLine();
		
		
		if (day.equals("monday")|| day.equals("tuesday")|| day.equals("wednesday")) {
			
			System.out.println("Discount is 5%");
			
			
		}
		else if(day.equals("thursday")|| day.equals("friday")) {
			System.out.println("Discount is 4%");
		
			}
		else if(day.equals("saturday")|| day.equals("sunday")) {
			System.out.println("Discount is 3%");
		
			}
		else {
			System.out.println("Entered day is incorrect : please enter correct day");

		}
		}
		
		
		
		
	}


