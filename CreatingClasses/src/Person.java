
public class Person {
// instance varibale 
	private String name = "Micheal";
	private static int age = 22;
	private static String hairColor = "Black";
	private static double weight = 160;
	private static String height = "5'4";
	private static char gender = 'M';
	
	//constructor
	public Person( String name, int age ,String hairColor)
	{
		this.name = name;
	}
	
	// main method 
	public static void main(String[] args)
	{ 
		Person myPerson = new Person ("Max", 26, "Red");
		System.out.println(myPerson.name);
	}
	
	
}
