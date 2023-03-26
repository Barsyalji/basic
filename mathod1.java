import java.util.*;
	class mathod1
	{
	int abc(double p,int b)
	{
		double a  = p;
		int c = b;
		double d = a*(c*c);
		System.out.println("aera of circle "+d);
					    
	}
	int bcd(int a, int b)
	{
		int i = a;
		int j = b;
		int k = a+b;
		System.out.println("aera of square "+k);
						return 0;
	}
	int cde(double p,int r,int l)
	{
		double a = p;
		int b =r;
		int c = l;
		double d = (a*b*c);
		System.out.println("aera of cone " +d);
		return 0;
	}
		double efg(double p, double r,int h)
	{
		double a = p;
		double b = r;
		int c = h;
		double d = 2*(a*b*c);
		System.out.println("aera of cylinder "+d);
						return 0;
	}
		int fgh(int a)
	{
		int b = a;
		int c = 4*(b*b);
		System.out.println("aera of cube "+c);
						return 0;
	}
	int ghi(String name,int id)
	{
				System.out.println("name:- "+name + "id:- "+id);
				return 0;
	}
		int hij(int a,int b)
	{
				System.out.println("a+b whole square:- v "+((a*a)+(b*b)+2*(a*b)));
				return 0;
	}

	public static void main(String[] args) {
		
		System.out.println(" find aera of circle");
		 mathod1 ob = new  mathod1();
		ob. abc(3.14,7);
		ob. bcd(7,5);
		ob. cde(3.14,7,8);
		ob. efg(3.14,7.1,10);
		ob. fgh(7);
		ob. ghi("atul",01);
		ob. hij(10,10);
	}

}

	