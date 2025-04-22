package JavaPackage;

public class RelationalOperator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 300;
		int b = 300;
		
		if (a!=b)
		{
			System.out.println("a is not equal to b");
		}
		else 
		{
			System.out.println("a is equal to b");
		}
		
		String p = "Hello";
		String q = "HELLO";
		
		if(p==q)
		{
			System.out.println("p and q equal in first way");
		}
		else
		{
			System.out.println("p and q are not equal in first way");
		}
		if(p.equals(q))
		{
			System.out.println("p and q equal in first way");
		}
		else 
		{
			System.out.println("p and q are not equal in first way");
		}
		if(p.equalsIgnoreCase(q))
		{
			System.out.println("p and q are not equal in first way");
		}
		else 
		{
		System.out.println("p and q equal in first way");	
		}
	}

}
