class star1
{
	public static void main(String [] args)
	{
		for(int i = 1; i < 10; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
				
			for(int k = 10; k > i; k--)
			{
				System.out.print(" ");
			}
			System.out.println();
				
		}
		System.out.println();
		
			
		// 2 loop in program
		for(int a = 1; a < 10; a++)
		{
			for(int b = 1; b <= a; b++)
			{
				System.out.print(" ");
			}
				
			for(int c = 10; c > a; c--)
			{
				System.out.print("*");
			}
			System.out.println();
			
			
		}
	
	}
}