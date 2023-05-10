package constructor_program;

// example 1- to understand purpose of constructor.

public class Constru_emp1 {
	
	int eid;                        // instance variable (as converted below from local)
	String ename;
	double salary;
    String company;
	String address;
	
	
	Constru_emp1(int eid,String ename,double salary,String company,String address)   //here its local variable.
	{
		//Assign the local data to instance data(using this-keyword)
		
		this.eid=eid;
		this.ename=ename;
		this.salary=salary;
		this.company=company;
		this.address=address;	
	}
	
	
	void status() {
		if (salary>50000) {
			System.out.println("Very Good employee...");
		}
		else {
			System.out.println("Good employee");
		}
	}
	

	public static void main(String[] args) {
		
		Constru_emp1 t1=new Constru_emp1(101,"Govind",60000,"tcs","pune");
		t1.status();
		
		Constru_emp1 t2=new Constru_emp1(201,"Rahul",40000,"tcs","pune");
		t2.status();

	}

}
