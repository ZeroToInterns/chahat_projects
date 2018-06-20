
public class tester {

	public static void main(String[] args) {

		String[] list = new String[] {"Banana", "apple", "chicken", "brocilli"};
		
		GroceryList obj  = new GroceryList(list);
		System.out.println(obj.findLongestItem());
		System.out.println(obj.findShortestItem());
		
	}

}
