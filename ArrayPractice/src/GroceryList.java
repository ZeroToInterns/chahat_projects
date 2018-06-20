public class GroceryList
{
	private String[] groceryList;
	
	public GroceryList()
	{
		groceryList = new String[50];
	}
	
	public GroceryList(int length)
	{
		groceryList = new String[length];
	}
	
	public GroceryList(String[] list)
	{
		groceryList = new String[list.length];
		
		for(int i = 0 ; i < list.length; i++)
		{
			groceryList[i] = list[i];
		}
		
	}
	
	public int findLongestItem()
	{
		int maxLength = 0;
		String longestWord = groceryList[0];
		for( int i = 1; i< groceryList.length ; i ++)
		{
			if(longestWord.length() < groceryList[i].length())
			{
				longestWord = groceryList[i];
				maxLength = longestWord.length();
			}
		}
		return maxLength;
	}
	
	public int findShortestItem()
	{
		int minLength = 0;
		String shortestWord = groceryList[0];
		for( int i = 1; i< groceryList.length ; i ++)
		{
			if(shortestWord.length() > groceryList[i].length())
			{
				shortestWord = groceryList[i];
				minLength = shortestWord.length();
			}
		}
		return minLength;
	}
	
	
}


