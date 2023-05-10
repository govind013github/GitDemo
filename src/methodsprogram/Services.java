package methodsprogram;

public class Services {

	
	double totalbill(String pname,double cost,int quantity)
	{
		double bill;
		bill=cost*quantity;
		return bill;
		
	}
	
	static int productorder(String name,String location,int cost) 
	{
		if(cost>100) {
			return 4567;
		}
		
		else {
			return 1234;
		}
	}
	
	
}
