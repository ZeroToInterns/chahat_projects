
public class Tester {

	public static void main(String[] args) {
       Soduko s1 = new Soduko();
       char[][] table = {{'.', '.', '.', '1', '4', '.', '.', '2', '.'},
       {'.', '.', '6', '.', '.', '.', '.', '.', '.'},
       {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
       {'.', '.', '1', '.', '.', '.', '.', '.', '.'},
       {'.', '6', '7', '.', '.', '.', '.', '.', '9'},
       {'.', '.', '.', '.', '.', '.', '8', '1', '.'},
       {'.', '3', '.', '.', '.', '.', '.', '.', '6'},
       {'.', '.', '.', '.', '.', '7', '.', '.', '.'},
       {'.', '.', '.', '5', '.', '.', '.', '7', '.'}};
       
       System.out.println(s1.sudoku2(table));
	}

}
