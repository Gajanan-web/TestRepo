package JavaPackage;

public class Variable8 {

	int a = 10; //Global variable
	
   static int b = 25;  //Static variable
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c = 30;  //Local variable
		System.out.println(b);
		d();
		
		int h = 10;
		System.out.println(h++ + ++h + --h + h--);
		
		Variable8 v8 = new Variable8();
		System.out.println(v8.a);
		v8.a();
	}

	public static void d() {
		int e = 50;
		System.out.println(e);
		
	}
	public void a() {
		int g = 100;
		System.out.println();
	}
}
