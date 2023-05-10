

package programcorejava;

import java.util.Scanner;

public class Programtestloop15 {
    //    program - Client has guess value=25 need to check the input from user matches or not.
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int guess=25;
		
		
		Scanner s =new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Enter the guess value");
			int num=s.nextInt();
			
			if(num>guess) {
				System.out.println("Guess value is greater");
			}
			else if(num<guess) {
				System.out.println("Guess value is smaller");
			}
			else {
				System.out.println("congratulation you guess value is correct");
				break;
			}
		}
		s.close();
	}

}
