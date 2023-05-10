





package programcorejava;

import java.util.Scanner;

public class Programtestloop9 {
	
	//Assignment -Take the number from end user check it is positive or negative and print its odd or even
	//using nested if-else condition
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner d = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number=d.nextInt();
	
	
		if (number>0)
		{	
		if (number%2==0){
			System.out.println("Num is even and positive");
		}
		else {
			System.out.println("Num is odd and negative");
		}
		}
		else {
			System.out.println("Please enter non-zero number");
		}

		
	}

}
