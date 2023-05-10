package constructor_program;
//=============================== Problem - with method argument implementation.


/*public class Constru_maths {
	
	void add(int num1,int num2) 
	{System.out.println(num1+num2);
	}
	
	void mul(int num1,int num2) 
	{System.out.println(num1*num2);
	}
	
	void div(int num1,int num2) 
	{System.out.println(num1%num2);
	}
   public static void main(String[] args) {
		Constru_maths G = new Constru_maths();
		G.add(10, 20);
		G.mul(8, 4);
		G.div(60, 2);
	}
}*/
//================================ solution - Using constructor.

public class Constru_maths{
	
  int num1;
  int num2;
  
  Constru_maths(int num1,int num2) {
	  this.num1=num1;
	  this.num2=num2;
  }
	
  void add() 
	{System.out.println(num1+num2);
	}
	
	void mul() 
	{System.out.println(num1*num2);
	}
	
	void div() 
	{System.out.println(num1%num2);
	}
	
	 public static void main(String[] args) {
			Constru_maths G = new Constru_maths(30,10);
			G.add();
			G.mul();
			G.div();
		}
}