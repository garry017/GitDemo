package JavaStramExample;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class test1 {
    @Test
	public  void regular() 
	{
		//count the number of name  starting with a in list
		ArrayList<String> names= new ArrayList<String>();
		names.add("Gaurav");
		names.add("Garry");
		names.add("ravi");
		names.add("virat");
		names.add("rohit");
		int count=0;
		
		for (int i =0; i<names.size(); i++)
		{
			String actual = names.get(i);
			if(actual.startsWith("G"))
			{
				count++;
			}
		}
		
		System.out.println(count);
	}

}
