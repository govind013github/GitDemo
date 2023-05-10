package methodsprogram;

public class Methodreturncase1 {
	
	//case 1 - when local and instance variables are having same names.
	
        int val1=10;                // instance variable
        int val2=20;

        void add(int val1,int val2) //local variable
        {
        	
        System.out.println(val1+val2);
        	
        Methodreturncase1 k =new Methodreturncase1();     // if there is same name for 'local/instance' variable 
                                                          // then represent instance data use object name.  
       	System.out.println(k.val1+k.val2);
        	
        	
        System.out.println(this.val1+this.val2);     // in the place of object its possible to use 'this' - keyword.
        
         }
        
	  public static void main(String[] args) {
	
		Methodreturncase1 g = new Methodreturncase1();
		g.add(100,200);
		
	}

}
