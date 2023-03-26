import java.util.Scanner;
class Greater{
		public static void main(String [] args){
			
			 Scanner n = new Scanner(System.in);
					System.out.println("Enter A Number1");
					int a = n.nextInt();
					System.out.println("Enter A Number2");
					int b = n.nextInt();
					System.out.println("Enter A Number2");
					int c = n.nextInt();
					
					if((a > b) && (b > c) )
					{
						 System.out.println(a + " is grater ");
					}
						else  if (b > a && (b > c))
						{
							System.out.println(b + "is grater");
							
						}
						
					else{
							System.out.println(c + " is grater ");
						}
					
					

			
			}
	}