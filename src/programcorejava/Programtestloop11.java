package programcorejava;

import java.util.Scanner;

public class Programtestloop11 {
	
	
	// Assignment 3 - using switch -- Take the day from user 
	// mond-friday - weekday focus on work AND sat sund - weekend enjoy

		
		public static void main(String[] args)
	    {
			
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter the number for day");
	        int day=s.nextInt();
	        String dayString11;
	  
	        // switch statement with int data type
	        switch (day) {
	        case 1:
	            dayString11 = "Monday";
	            System.out.println("Weekday focus on work");
	            break;
	        case 2:
	            dayString11 = "Tuesday";
	            System.out.println("Weekday focus on work");
	            break;
	        case 3:
	            dayString11 = "Wednesday";
	            System.out.println("Weekday focus on work");
	            break;
	        case 4:
	            dayString11 = "Thursday";
	            System.out.println("Weekday focus on work");
	            break;
	        case 5:
	            dayString11 = "Friday";
	            System.out.println("Weekday focus on work");
	            break;
	        case 6:
	            dayString11 = "Saturday";
	            System.out.println("Weekend enjoy part");
	            break;
	        case 7:
	            dayString11 = "Sunday";
	            System.out.println("Weekend enjoy party");
	            break;
	        default:
	            dayString11 = "Invalid day";
	        }
	        System.out.println(dayString11);
	    }
			
			
		}
		
		
	


