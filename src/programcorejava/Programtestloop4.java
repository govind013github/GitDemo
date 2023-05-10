

package programcorejava;

public class Programtestloop4 {
	
	//program - print sum of first 10 numbers.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int i,number=10,sum=0;
		
		for(i=1;i<=number;i++) {
			
			sum += i;		//Augmented assignment or other logic -> sum=sum+i;
		}
		
		System.out.println("Sum of First 10 Natural Numbers is = " + sum);
	}

}
