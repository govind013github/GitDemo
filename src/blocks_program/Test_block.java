package blocks_program;

public class Test_block {
	
	// case 1 : blocks (instance/static) program.
	
	Test_block()
	{
		System.out.println("0-arg constructor");
		System.out.println("0-arg constructor");
		System.out.println("0-arg constructor");
	}
	
	Test_block(int a)
	{
		System.out.println("1-arg constructor");
		System.out.println("1-arg constructor1");
		System.out.println("1-arg constructor2");
		
		
	}
	
	Test_block(int a,int b)
	{
		System.out.println("1-arg constructor");
		System.out.println("1-arg constructor1");
		System.out.println("1-arg constructor2");
		
		
	}
	
	static {
		System.out.println("static- block");
	}
	
	
	{
		System.out.println("instance-block");
		System.out.println("instance-block2");
		System.out.println("instance-block3");
	}
	
	public static void main(String[] args) {
		
           new 	Test_block();
           new 	Test_block(10);
           new 	Test_block(10,20);
           
           }

}
