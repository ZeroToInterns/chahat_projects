import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
public class mergingLists{
	
	private static LinkedList<Integer>merge(LinkedList<Integer>first, LinkedList<Integer>second){
		LinkedList<Integer>list = new LinkedList<Integer>();
		ListIterator<Integer> it = first.listIterator();
		ListIterator<Integer>it2 = second.listIterator();
		
		while(it.hasNext() && it2.hasNext())
		{
			if(it.next() < it2.next())
			{
				list.add(it.previous());
				it.next();
				it2.previous();
			}
			else
			{
				list.add(it2.previous());
				it2.next();
				it.previous();
			}
		}
		while(it.hasNext())
		{
			list.add(it.next());
		}
		while(it2.hasNext())
		{
			list.add(it2.next());
		}
		return list;
		
	}
public static void main(String args[])
{
	Integer values1[] = { 4, 16, 26, 29, 32, 47,50, 79, 83, 86, 97};
	Integer values2[] = {14, 16, 18, 54, 61, 63, 64, 88, 92};

	LinkedList<Integer> first  = new LinkedList<Integer>(Arrays.asList(values1));
	LinkedList<Integer> second = new LinkedList<Integer>(Arrays.asList(values2));


	System.out.println("First  " + first);
	System.out.println("Second " + second);
	System.out.println("Merged " + merge(first, second));

}

}
