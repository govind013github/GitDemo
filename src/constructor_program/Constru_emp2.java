package constructor_program;

public class Constru_emp2 {

	//Here at project-level modifications done with data.
	
	int eid;                        // instance variable (as converted below from local)
	String ename;
	double salary;
   public static final String company = "TCS";   //use 'public static final' for common data shared.
   public static final String address = "Pune";    
	
	
	Constru_emp2(int eid,String ename,double salary)   //here its local variable.
	{
		//Assign the local data to instance data(using this-keyword)
		
		this.eid=eid;
		this.ename=ename;
		this.salary=salary;
			
	}
	
	
	void status() {
		if (salary>50000) {
			System.out.println("Very Good employee...");
			System.out.println(eid+" "+ename+" "+company+" "+address);
		}
		else {
			System.out.println("Good employee");
			System.out.println(eid+" "+ename+" "+company+" "+address);
		}
	}
	
	
	
		public static void main(String[] args) {
		
		Constru_emp2 t1=new Constru_emp2(101,"Govind",60000);
		t1.status();
		
		Constru_emp2 t2=new Constru_emp2(201,"Rahul",40000);
		t2.status();
	}

}
