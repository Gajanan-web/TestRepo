package JavaPackage;

public class Static3 {

	int roll;
	String name;
	static String college = "IIT Bombay";
	
	
	Static3 (int r, String n)
	{
		roll=r;
		name=n;
	}
	public void getResult() {
		// TODO Auto-generated method stub

		System.out.println(roll + "  " + name + "  " + "IIT Bombay");
	}

}
