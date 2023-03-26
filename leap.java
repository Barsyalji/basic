import java.util.Scanner;
class Grater{
		public static void main(String [] args){
			
			 Scanner n = new Scanner(System.in);
					System.out.println("Enter A year");
					int a = n.nextInt();
					if((a % 400 == 0 ) || ((a % 4 == 0 ) && (a %100 != 0))){
					
						System.out.println(a + "  is leap year");
					}
					else{
						System.out.println(a + "is c'not leap year");
					}
					
					

			
			}  
	}