package programcorejava;

public class Local_variable {
	
	 public void division(){
		  int num1=10;           // local variable declared inside method
		  int num2=2;
		  int sub=num1-num2;
		  System.out.println(sub);
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Local_variable d = new Local_variable();
		d.division();
		
	}

}
