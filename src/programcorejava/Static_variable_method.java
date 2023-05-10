package programcorejava;

public class Static_variable_method {
	
	static int num1=40;
	static int num2=60;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		System.out.println(Static_variable_method.num1+Static_variable_method.num2);
		Static_variable_method m = new Static_variable_method();
	    m.mulp();
	}
	
        void mulp() {
        	System.out.println(Static_variable_method.num1*Static_variable_method.num2);
        }
}


