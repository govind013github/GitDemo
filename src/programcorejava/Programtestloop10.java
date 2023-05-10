package programcorejava;

import java.util.Scanner;

public class Programtestloop10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner g = new Scanner(System.in);
		System.out.println("Enter student name");
		String sname = g.nextLine();
		
		Scanner m = new Scanner(System.in);
		System.out.println("Enter english subject marks");
		double emarks = m.nextDouble();
		
		System.out.println("Enter maths subject marks");
		double mmarks = m.nextDouble();
	
		System.out.println("Enter science subject marks");
		double smarks = m.nextDouble();	
		
		
		
	   double total = emarks+mmarks+smarks;
	   double avg = (total / 3.0);
	   double percentage = (total / 300.0) * 100;
		
		
		if(percentage>=70) {
	     System.out.println("Congrats for receving Grade A");
		
		}
		
		

		else if (percentage>60 || percentage<69) {
			System.out.println("Congrats for receving Grade B");	
		}
		else if (percentage>50 || percentage<59) {
			System.out.println("Congrats for receving Grade C");	
		}
		else if (percentage>40 || percentage<49) {
			System.out.println("Congrats for receving Grade D");	
		}
		else {
			System.out.println("sorry you are failed");
		}
		
		
		System.out.println(sname+" "+" "+" "+"Total ="+" "+avg+" "+"your percentage = "+percentage);
		
	}

}
