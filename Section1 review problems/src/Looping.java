import java.util.EmptyStackException;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;


public class Looping {

	public static void main(String[] args)
	{
		Looping l = new Looping();
		System.out.println(l.removeDuplicates("chahatpreetsinghgrewal"));
	}
	public String removeDuplicates(String word)
	{   String newWord = word.toLowerCase();
		String secondString = "";
		if(word.length()==0)
		{
			 throw new EmptyStackException();
		}
		else
		{
			String duplicate[] = new String [26];
			for(int i = 0; i < word.length(); i++)
			{
				int l = (int)newWord.charAt(i)- 97;
				if(duplicate[l] ==  null)
				{
					secondString = secondString + (word.substring(i,i+1));
					duplicate[l] = word.substring(i,i+1);
				}
			}
			
		}
		return secondString;
	}
}
