import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("gaurav");
		a.add("kiran");
		a.add("parag");
		System.out.println(a.get(2));
		
		//array list used size not length
		
		for(int i = 0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
			
			//Inhance for loop 
			for ( String val  :a)
			{
				System.out.println(val);
				
				//check the any name or number present in the array list how to check 
				System.out.println(a.contains("gaurav"));
			}
			
		}

	}

}
