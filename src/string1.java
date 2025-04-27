
public class string1 {

	public static void main(String[] args) {
		// how to declare string and how to import string method
		
		// string is object that a represent a sequence of characters in java this are two way created a string in java 
		// ex.    string abc = "game developer";
		      // String abc = "game developer";   -----this format is string litrals 
		
		//String abc2 = new String("game developer");  --- new memory allocator operator decleare the string
		// 

		String s = ("gaurav cricket practice sessio");
		String []  splittedString = s.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		
		System.out.println(splittedString[3].trim());
		
//		for (int i = 0; i<s.length(); i++)
		for (int i = s.length()-1; i>=0; i--)

		{
			System.out.println(s.charAt(i));
		}

	}

}

//interview quetion print the reverse string in reverse order
//for (int i = s.length-1; i<s.length(); i--)
