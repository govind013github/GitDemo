package programcorejava;

import java.util.Scanner;

// Assignment 3 - Take year from end user and check whether year is leap year or not.

public class Programtestloop6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner d = new Scanner(System.in);
		
		System.out.println("Enter the year");
		int year=d.nextInt();
		
		if(((year % 4 == 0) && (year % 100!= 0)) ||(year % 400 == 0))
		 System.out.println("Specified year is a leap year");
	    else
	         System.out.println("Specified year is not a leap year");
		
		
		
	}

}

