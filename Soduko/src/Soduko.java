import java.util.HashSet;


public class Soduko {

	boolean sudoku2(char[][] grid) {

	    HashSet check = new HashSet();
	    for(int i = 0; i <=  6; i = i+3)
	    {
	        for(int j = 0; j <= 6 ; j = j+3)
	        {
	            for(int l = i; l <= i + 2; l++)
	            {
	                for(int k = j ; k <= j + 2; k++)
	                {
	                    if(Character.isDigit(grid[l][k]))
	                    {
	                        if(check.add(grid[l][k]))
	                        {
	                            // do nothing
	                        }
	                        else
	                        {
	                            return false;
	                        }
	                    }
	                }
	            }
	            check.clear();
	        }
	    }
	    return true;
	}


}
