public class P1{

	public static void main (String [] args)
	{
				
		for(int i = 10 ; i > 0; i--){
		for(int j = 10 ; j > i; j--){
			System.out.print(" ");
		}
		
		for(int j = 1 ; j <= (2*i)-1; j++){
		System.out.print("*");
		
	}
		System.out.println();
	}
	}
}  
