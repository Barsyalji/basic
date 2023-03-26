public class P1{

	public static void main (String [] args)
	{
		int k = 10;
		
		for(int i = 1 ; i < 10; i++){
		for(int j = 10 ; j > i; j--){
			System.out.print(" ");
		}
		k = (2*i)-1;
		for(int j = 1 ; j <= k; j++){
		System.out.print("*");
		
	}
		System.out.println();
	}
	}
}  
