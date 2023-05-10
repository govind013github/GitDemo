package programcorejava;

import java.util.Scanner;

public class Programtestloop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Program - To get input from users and apply if-else condition.
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the employee id");
		int eid=s.nextInt();                                  // here nextInt() method is used to parse input from user console.
		
		System.out.println("enter employee name");
		String ename=s.next();
		
		System.out.println("enter employee salary");
		double esalary=s.nextDouble();
		
		if (esalary>10000 && ename.startsWith("r"))
		{
			System.out.println("Very good employee.....");
			System.out.println(eid+" "+ename+" "+esalary);
		}
		else
		{
			System.out.println("Better employee.....");
			System.out.println(eid+" "+ename+" "+esalary);
		}
			
		
	}

}
