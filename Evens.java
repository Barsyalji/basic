import java.util.Scanner;
class Evens{
		public static void main(String [] args){
			
			 Scanner n = new Scanner(System.in);
					System.out.println("Enter A Number");
					int a = n.nextInt();
					int b = a%2;
					if(b == 1){
						System.out.println(a + " Number is odd");
						}
					else{
						System.out.println(a + " Number is Even");
						}
					
					

			
			}
	}