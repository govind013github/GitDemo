package programcorejava;     

//Assignment no 1- ratanit - Take 20 numbers and print the even number.

public class Programtestloop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=20;
		System.out.println("List of even numbers from 1 to "+number+": ");  
		for(int i=0;i<=number;i++)
		{
			
			if(i%2==0) {
				System.out.println(i+"");
				
			}
		}
				
		
	}

}
