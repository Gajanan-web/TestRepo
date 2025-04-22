package JavaPackage;

public class Static7 {
	
	String a;
	int b ;
	static  int c = 4;
	
	public static void a()
	{
		System.out.println("Hello");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Static7 s7 = new Static7();
		s7.a = "Selenium";
		s7.b = 5;
		c = 10;
		
		System.out.println(s7.a + "  " + s7.b + " " + c);
		a();
		
	}

}
