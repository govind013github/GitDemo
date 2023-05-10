package blocks_program;

public class Test_block {
	
	// case 1 : blocks (instance/static) program.
	
	Test_block()
	{
		System.out.println("0-arg constructor");
	}
	
	Test_block(int a)
	{
		System.out.println("1-arg constructor");
	}
	
	static {
		System.out.println("static- block");
	}
	
	
	{
		System.out.println("instance-block");
	}
	
	public static void main(String[] args) {
		
           new 	Test_block();
           new 	Test_block(10);
           }

}
