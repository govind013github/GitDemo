package programcorejava;

public class Programtestloop14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] = {10,20,30,40};
		
	/*	for(int i=0;i<a.length;i++)                // Approach 1 - using 'for loop'.
		{
			System.out.println(a[i]);
		}
		*/
		
		for(int i :a) {
			System.out.println(i);                 //Approach 2 - using 'for-each' loop used to traverse array/collections.
		}
		
		

	}

}
