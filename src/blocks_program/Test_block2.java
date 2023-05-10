package blocks_program;

public class Test_block2 {
	
	//case 2 - Blocks(instance) - Here due to constructor chaining 2-constructor executed
	// but only one object created so instance block executed only once.
	
	Test_block2()
	{
		this(10);
		System.out.println("0-arg constructor");
	}
	
	Test_block2(int a)
	{
		System.out.println("1-arg constructor");
	}
	
	
	{
		System.out.println("instance block");
	}
	
	public static void main(String[] args) {
		Test_block2 m = new Test_block2();

	}

}

