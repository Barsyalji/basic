import java.util.Scanner;
class Greater{
		public static void main(String [] args){
			
			 Scanner n = new Scanner(System.in);
					System.out.println("Enter A Number1");
					int a = n.nextInt();
					System.out.println("Enter A Number2");
					int b = n.nextInt();
					
					if(a > b){
						System.out.println(a + " is greater then  "+b);
						}
					else{
						System.out.println(b + "  is greater then "+a);
						}
					
					

			
			}
	}