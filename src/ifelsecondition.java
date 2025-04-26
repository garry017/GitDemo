
public class ifelsecondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,4,5,7,8,9,10,12,14,15,13,16};
		
		for(int i=0; i<arr1.length; i++)
		{
			if (arr1[i] % 2 == 0)
			{
			System.out.println(arr1[i]);
		}
			else
			{
				System.out.println(arr1[i] + " is not a multiple of 2");

			}
			
		
		
		}	 
	}

}
