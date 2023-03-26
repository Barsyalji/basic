class q1{
	public static void main(String [] args)
	{
		int i = 1;
		int j = 10;
		int k = 1;
		int a = 1;
		int b = 10;
		int c = 1;
		int d = 1;
		int e= 1;
		int f = 10;

		while(i <= 10)
		{
			
			while(j > i)
			{
				System.out.print(" ");
				j--;
			}
			while(k <=i)
			{
				System.out.print("*");
				k++;
				
			}
			System.out.println();
			i++;
			k = 1;
			j = 10;
		}System.out.println();
	while(a <= 10)
		{
			while(b > a)
			{
				System.out.print(" ");
				b--;
			}
			while(c <=a)
			{
				System.out.print("*");
				c++;
				
			}
			System.out.println();
			a++;
			c = 1;
			b = 10;
		}
		while(d <=10 )
		{
			while(e < d)
			{
				System.out.print(" ");
				e++;
			}
			while(f >=d)
			{
				System.out.print("*");
				f--;
				
			}
			System.out.println();
			d++;
			f = 10;
			e = 1;
		}
		
	}
}