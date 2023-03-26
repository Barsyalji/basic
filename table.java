import java.util.Scanner;
class Table{
				public static void main(String [] args){
					Scanner s = new Scanner(System.in);
					System.out.println("enter a numberr of table");
					int a = s.nextInt();
					
					for( int b = 1 ; b <= 10; b++)
					{
						
					int c = a*b;	
					System.out.println(a +"X"+ b +"=" + c);	
						
					}
					
						}
}