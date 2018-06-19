
public class SubSandwich {
	
	private int type;
	private int size;
	private boolean extraMeat;
	
	public static final int CHICKEN = 0;
	public static final int PASTRAMI = 1;
	public static final double COST_FOR_EXTRA_MEAT = 1.50;
	
	public SubSandwich(int theType, int theSize, boolean extraMeat)
	{  
		if(theType == 0 || theType == 1)
		{
			type = theType;
		}
		else
		{
			type = 1;
		}
		if(theSize == 6)
		{
		size = theSize;
		}
		else
		{
			size = 12;
		}
		this.extraMeat = extraMeat; 
	}
	
	public int getSize()
	{
		return size;
	}
	
	public void setSize(int newSize)
	{
		if(newSize == 6)
		{
		size = newSize;
		}
		else
		{
			size = 12;
		}	}
	
	public boolean isExtraMeat()
	{
		return this.extraMeat;
	}
	
	public String getType()
	{
		if(type == 0)
		{
			return "chicken";
		}
		
		else if(type == 1)
		{
			return "pastrami";
		}
		
		else
		{
			return "pastrami";
		}
	}
	
	public double getCost()
	{
		if(type == 0)
		{
			if(size == 6 )
			{   
				if(extraMeat)
				{
					return 5.50 + 1.50;
				}
				else
				{
					return 5.50;
				}
			}
			else
			{
				
				if(extraMeat)
				{
					return 8.95 + 1.50;
				}
				else
				{
					return 8.95;
				}	
				
			}
		}
		else
		{
			if(size == 6 )
			{   
				if(extraMeat)
				{
					return 6.95 + 1.50;
				}
				else
				{
					return 6.95;
				}
			}
			else
			{
				
				if(extraMeat)
				{
					return 9.50 + 1.50;
				}
				else
				{
					return 9.50;
				}	
				
			}
			
				 
		}
	}
	
}
