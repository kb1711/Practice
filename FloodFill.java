
public class FloodFill {
	public static void main(String[] args) {
		char[][] scr ={{'.','.','.','.','.','.','.','X','X','X','X','X','X','X','X','X','X','.','.'},
		{'.','.','.','.','.','.','.','X','.','.','.','.','.','.','.','.','X','.','.'},
		
		{'.','.','.','.','.','.','.','X','.','.','.','.','.','.','.','.','X','.','.'},
		
		{'.','.','X','X','X','X','X','X','.','.','.','.','.','.','.','.','X','.','.'},
		
		{'.','.','X','.','.','.','.','.','.','.','.','.','.','.','.','.','X','.','.'},
		
		{'.','.','X','.','.','.','.','.','.','.','.','.','.','.','.','.','X','.','.'},
		
		{'.','.','X','.','.','.','.','.','.','.','.','X','X','X','X','X','X','.','.'},
		
		{'.','.','X','.','.','.','.','.','.','.','.','X','.','.','.','.','.','.','.'},
		
		{'.','.','X','X','X','X','.','.','X','X','X','X','.','.','.','.','.','.','.'},
		
		{'.','.','.','.','.','X','X','X','X','.','.','.','.','.','.','.','.','.','.',}};
		fill(scr,10,5);
	}

	private static void fill(char[][] scr, int i, int j) {
		//for()
	}
}
