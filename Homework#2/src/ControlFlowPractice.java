
public class ControlFlowPractice {

	public double calculateCost(double distance)
	{
		if(distance >= 50)
		{
			return 100.0;
		}
		else if ( distance < 50 && distance >= 25)
		{
			return 50.0;
		}
		else 
		{
			return 10.0;
		}
	}
	
	public void rollDice(int value)
	{
		switch(value)
		{
		case(1):
		{
			System.out.println("The value is: " + value);
			break;
		}
		case(2):
		{
			System.out.println("The value is: " + value);
            break;
		}
		case(3):
		{
			System.out.println("The value is: " + value);
            break;
		}
		case(4):
		{
			System.out.println("The value is: " + value);
           break;
		}
		case(5):
			
		{
			System.out.println("The value is: " + value);
            break;
		}
		case(6):
		{
			System.out.println("The value is: " + value);
            break;
		}
	    }
		
		
	}
	public int findLetterAt(String letter, String word)
	{   int count = 0;
		for(int i = 0; i < word.length() ; i++)
		{
			if(letter.equals(word.substring(i, i + 1)))
			{
				if(count == 1)
				{
					return i;
				}
				else
				{
					count++;
				}
			}
					
		}
		
		return 0;
	}
}
