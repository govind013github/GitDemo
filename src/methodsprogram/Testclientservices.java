package methodsprogram;

public class Testclientservices {

	public static void main(String[] args) {
		
		
		Services s=new Services();
		double bill=s.totalbill("pen", 10, 25);
        System.out.println("your total bill is " +bill);
        
       int orderid= Services.productorder("shirt", "pune", 999);
       System.out.println("your orderid is " +orderid);
	}

}
