import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) 
	{
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> listsOfLists = new ArrayList<ArrayList<Integer>>();// 2D Arraylist
																				 

		while (sc.hasNext())
		{   																			 

			String in = sc.nextLine();// line of string input from the user
			ArrayList<Integer> secondList = new ArrayList<Integer>();// second Arraylist 
			Scanner input = new Scanner(in);
			while (input.hasNext()) 
			{
				int integer = input.nextInt();// getting the integer from the line the user have entered 
				secondList.add(integer);

			}
			listsOfLists.add(secondList);

		}

		int n = (listsOfLists.get(0)).get(0);
		int q = ((listsOfLists.get(n + 1)).get(0));

		for (int i = n + 2; i <= n + q + 1; i++) {
			try {
				int y = ((listsOfLists.get(i)).get(0));
				int x = ((listsOfLists.get(i)).get(1));
				System.out.println((listsOfLists.get(y)).get(x));
			} catch (Exception e) {
				System.out.println("ERROR!");
			}

		}

	}

}