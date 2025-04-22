package JavaPackage;

public class BreakStatement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				if(i == 2 && j == 2) 
				{
					break;
			    }
				System.out.println(i + "   " + j);
		}

			System.out.println("Control came out from loop");
	}

		
}
}
