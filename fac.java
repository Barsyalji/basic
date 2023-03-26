import java.util.Scanner;
class factorial{
				public static void main(String [] args){
					Scanner s = new Scanner(System.in);
					System.out.println("enter factorial number");
					int a = s.nextInt();
					int c = 1;
					for( int b = 1 ; b <= a; b++)
					{
						 c = c * b;
						
						
					}
					System.out.println("factorial  of number" + c);
						}
}