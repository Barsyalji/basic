
public class cons {
	void cons(double p,int b)
	{
		double a  = p;
		int c = b;
		double d = a*(c*c);
		System.out.println("aera of circle "+d);
	}
	void cons(int a, int b)
	{
		int i = a;
		int j = b;
		int k = a+b;
		System.out.println("aera of square "+k);
	}
	void cons(double p,int r,int l)
	{
		double a = p;
		int b =r;
		int c = l;
		double d = (a*b*c);
		System.out.println("aera of cone " +d);
	}
	void cons(double p, double r,int h)
	{
		double a = p;
		double b = r;
		int c = h;
		double d = 2*(a*b*c);
		System.out.println("aera of cylinder "+d);
	}
	void cons(int a)
	{
		int b = a;
		int c = 4*(b*b);
		System.out.println("aera of cube "+c);
	}

	public static void main(String[] args) {
		
		System.out.println(" find aera of circle");
		cons ob = new cons();
		ob.cons(3.14,7);
		ob.cons(7,5);
		ob.cons(3.14,7,8);
		ob.cons(3.14,7.1,10);
		ob.cons(7);

	}

}
