package JavaPackage;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = {{1,4,5,9},{2,3,5,7},{6,7,8,9}};
		
		//Total number of rows.
		
		int row = a.length ;
		System.out.println("Total rows : " + row);
		
		//Total number of column.
		int columns = a[0].length ;
		//System.out.println("Total columns : " + columns);
		
		// Print all data in matrix form
		
		for (int i = 0; i < row ; i++) {
			
			for ( int j = 0; j < columns; j++) {
				System.out.print(a[i][j] + " ");
		}
		System.out.println() ;
	}

}
}
