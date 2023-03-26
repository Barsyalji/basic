import java.util.Scanner;
class SumOfTwoNumber{
	public static void main(String [] args){
					Scanner n = new Scanner(System.in);
					System.out.println("Enter A Number");
					int a = n.nextInt();
					
					System.out.println("Enter A Number");
					int   b = n.nextInt();
					
					int c = a + b;
					System.out.println("Sum Of Two Number Is" +c);
					}
}