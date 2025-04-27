
public class createmethod1 {

	public static void main(String[] args) {
		
		// how to create method in java and how to access method from class  
		//why method 
		// so basically if you have any set of line of code which you want to reuse 
		// every time so what you can do is you can wrap all that line in one block and that block you can give any name
		//so whenever you want  to use that set of line code if you can call that block name 
		createmethod1  d = new createmethod1();
		String name = d.getData();
		System.out.println(name);
		
		createmethod2 d2 = new createmethod2 ();
		d2.getuserdata();
		getData2();

    
	}
	public String getData()
	{
		System.out.println("hello guys how are you ");
		return "game play";
		
	}
		public static String getData2()
		{
			System.out.println("hello guys how are you ");
			return "game play";
	}

}
