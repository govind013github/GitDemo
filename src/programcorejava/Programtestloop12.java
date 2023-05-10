package programcorejava;

import java.util.Scanner;

public class Programtestloop12 {
	
	///Program - using 'For loop' execution -

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 Scanner e = new Scanner(System.in);
	 
	 System.out.println("Enter boy number");
	 int bno=e.nextInt();
	 
	 for(int i=0;i<=10;i++) 
	 {       if(i==bno)
			  break;                             // break  - stop the execution further once condition met.
	       System.out.println(i);
	 }
	 
	 System.out.println("Enter girl number");
	 int gno=e.nextInt();
	 
	 for(int i=0;i<=10;i++) 
	 {       if(i==gno)
			  continue;                        // continue - skips particular condition proceeds further execution
	       System.out.println(i);
	 }	
		
		
		
	}

}
