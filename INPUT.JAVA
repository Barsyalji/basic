import java.util.Scanner;
class InputType{ 
		public static void main(String [] args)
		{
			Scanner myObj = new Scanner(System.in);
			System.out.println("enter your name");
			
			String uname = myObj.nextLine();
			System.out.println("enter your name"+" " +uname );
			}
	}
	