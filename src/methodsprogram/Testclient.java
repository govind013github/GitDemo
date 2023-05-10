package methodsprogram;

public class Testclient {

	public static void main(String[] args) {
		
		Operations t=new Operations();
		t.wish();
		t.add(10, 40);
		
		Operations.login("Govind", "Govind123");
		Operations.Courseinfo("Govind", "java");
	    Operations.disp(20,'K',true,5.5);
	}

}
