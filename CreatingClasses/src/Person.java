
public class Person {
// instance varibale 
	private static String name = "Micheal";
	private static int age = 22;
	private static String hairColor = "Black";
	private static double weight = 160;
	private static String height = "5'4";
	private static char gender = 'M';
	
	public static void main(String[] args)
	{ 
		Person myPerson = new Person();
		myPerson.hairColor = "Red";
		System.out.println(myPerson.hairColor);
		
		hairColor = "Blue";
		
		Person personTwo = new Person();
		
	    System.out.println(personTwo.hairColor);
	}
	
}
