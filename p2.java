public class P1{

	public static void main (String [] args)
	{
		
		
		for(int i = 1 ; i < 10; i++)
			{
				for(int j = 10 ; j > i; j--)
					{
						System.out.print(" ");
					}
				
				for(int k = 1 ; k <= i; k++)
					{
						System.out.print("*");
		
					}
		
			System.out.println();
		} 
		for(int l = 0; l < 10; l++)
		{
			for(int a = 0; a < l; a++)
			{
				System.out.print(" ");
		
			}
			for(int b = 10; b > l; b--)
					{
						System.out.print("*");
					}
			
		System.out.println();
	}  
}
}