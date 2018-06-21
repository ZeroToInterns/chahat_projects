
public class ArrayPractice {

	private int[] num;
	public ArrayPractice()
	{
		num = new int[10];
		for(int i = 0 ;i < num.length ; i++)
		{
			num[i] = (int) Math.random();
		}
	
	}
	
	public int sum()
	{
		int sum = 0;
		for(int i = 0 ; i < num.length; i++)
		{
			sum = sum + num[i];
		}
		return sum;
	}
	
	public int average()
	{
		int sum = this.sum();
		int size = num.length;
		int average = sum/size;
		return average;
	}
	
	public void create2DArray(int row, int column)
	{
		int[][] num = new int[row][column];
	}
	
	public int maximum()
	{
		int max = num[0];
		for( int i = 1 ; i < num.length ; i++)
		{
			if(max < num[i])
			{
				max = num[i];
			}
		}
		return max;
	}
	
}
