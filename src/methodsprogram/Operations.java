package methodsprogram;

//Program - Method using arguments.

public class Operations {   

  //instance method - Access using object name.
	
	void wish() {
		System.out.println("Good morning");
	}
	
   void add(int num1,int num2) {
	 int sum;
	 sum= num1+num2;
	 System.out.println("Addition is"+sum);
	}
   
    //static method - Access using class-name.
    
   static void login(String username,String password) {
	   
	   if(username.equals("Govind")&& password.equals("Govind123")) {
		   System.out.println("Login is successful"+" "+username);
		  }
	   else {
		   System.out.println("Login fails"+username);
	   }
	  
	 }
	   
	static void Courseinfo(String name,String course) {
		if(course.equals("java")) {
			System.out.println("Hi"+" "+name+" "+course+" "+"facility is ratan and fees is 3000");
		}
		else if(course.equals("selenium")) {
			System.out.println("Hi"+" "+name+" "+course+" "+"facility is rahul shety and fees is 500");
		}
	   
		else {
			System.out.println("sorry course not available");
		}
	}

	static void disp(int a,char ch,boolean e,double h ) {
		System.out.println("Accepted values"+" "+a+" "+ch+" "+e+" "+h);
	}
   
   
   
}
