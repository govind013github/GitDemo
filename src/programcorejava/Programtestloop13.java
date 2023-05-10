package programcorejava;

import java.util.Scanner;

public class Programtestloop13 {
	
	//Assignment 4 For loop - In app take the pin =1234
	//take pin from end user
	//if the both pin matched - print pin is valid stop the execution.
	//if the pin unmatched - take pin again
	//Take 4 attempt of pin or bye account has been blocked

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int pin = 1234;

        for (int passAttempts = 0; passAttempts < 4; passAttempts++) 
        {
            System.out.print("\nEnter Your 4 digit Password: ");
            Scanner input = new Scanner(System.in);
            int inputPass = input.nextInt();

            if (!(inputPass==pin)) 
            {
                System.out.println("\nWrong Password Try Again");
            } 
            
            else
            {
                System.out.println("\nWelcome! to online shopping");
                break;
            }
        
        }
}
}