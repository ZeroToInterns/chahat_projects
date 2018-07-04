public class EveryOtherCharacter
{
	private static String everyOther(String str)
	{
       if(str.equals(""))
       {
    	   return "";
       }
       else if(str.length()==1)
       {
    	   return str;
       }
       else
       {
    	   return str.subSequence(0,1) + everyOther(str.substring(2,str.length()));
       }
	}
	
	public static void main (String args[])
	{
		String strings[] = {"hello, world", "ab","x","",	"The quick red fox jumped over the lazy brown dogs."};
        for(String str : strings){
        	System.out.println(str + " => " + everyOther(str));
        }
	}
}