package methodsprogram;

// if appplication contains both local and instance variables then it returns local value. But
// to return instance data we use "this-keyword"

public class Methodreturncase2 {
	
	int a=10;                     // instance variable
	
	int m1(int a)                 // local variable 
	{ 
		return this.a;
	}
	
	

	public static void main(String[] args) {
		
		Methodreturncase2 t=new Methodreturncase2();
		int result=t.m1(200);
		System.out.println("output is "+result);
           
	}

}
