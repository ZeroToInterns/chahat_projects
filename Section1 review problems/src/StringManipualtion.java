import java.util.Scanner;


public class StringManipualtion {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your full name: ");
		String fullName = in.nextLine();
		
		System.out.println(fullName.substring(0,1));
		
		System.out.println(fullName.substring(0,fullName.indexOf(" ")));
		
		System.out.println(fullName.replaceAll(" ",""));
		
		System.out.println(fullName.substring(4,7));
		
		
		
		
	}

}
