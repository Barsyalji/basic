public class P1{

	public static void main (String [] args)
	{
		int p = 10;
		
		for(int i = 1 ; i < 10; i++){
		for(int j = 10 ; j > i; j--){
			System.out.print(" ");
		}
		p = (2*i)-1;
		for(int j = 1 ; j <= p; j++){
		System.out.print("*");
		
	}
		System.out.println();
	}
	for(int k = 10 ; k > 0; k--){
		for(int l = 10 ; l > k; l--){
			System.out.print(" ");
		}
		
		for(int l = 0 ; l <= (2*k)-1; l++){
		System.out.print("*");
		
	}
		System.out.println();
	}
	}
}
	
