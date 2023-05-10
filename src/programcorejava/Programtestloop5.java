package programcorejava;

import java.util.Scanner;

//Assignment no 2 - Take 2 no from users and print bigger number.

public class Programtestloop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner s = new Scanner(System.in);
		
		System.out.println("enter num1");
		int enum1=s.nextInt();                                  // here nextInt() method is used to parse input from 
		                                                    //user console for int type similary for string and other.	
		System.out.println("enter num2");
     	int enum2=s.nextInt();
     	
     	if(enum1 > enum2)
     	
     	{
     		System.out.println(enum1);	
     	}
     	else
     	{
     		System.out.println(enum2);
     	}
		
	
}
}