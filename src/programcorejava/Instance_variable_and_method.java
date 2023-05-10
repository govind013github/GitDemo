package programcorejava;

public class Instance_variable_and_method {
	
	int num1=10;             //instance area
	int num2=20;
	

	public static void main(String[] args) {
		
		//static area
		Instance_variable_and_method e = new Instance_variable_and_method();
		System.out.println(e.num1+e.num2);
		e.add();

	}
       void add() {
    	   //instance area
    	   System.out.println(num1+num2);
       }
}
