package JavaPackage;

public class UnaryOperator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 10;
		
		System.out.println(a++);  //10 , 11
		System.out.println(a++ + ++a); // 11 , 12 + 13 , 13 = 24
		System.out.println(a + ++a);  // 13  + 14 , 14 = 27
		System.out.println(b++ + b--);  //10 , 11  + 11 , 10 = 21
		System.out.println(b++ + b--);  //10 , 11 + 11 , 10 = 21
		System.out.println(b + b-- + b++);// 10 + 10 , 09  +  09 , 10  = 29
	}

}
