public class ab1{
	public static void main(String [] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9};
		int a = 12;
		
		for(int i = 0; i<= arr.length;i++)
		{
			if(a == arr[i]){
				System.out.println("number is search"+a);
				break;
			}
			else
			{
				System.out.println("number is not search");
				break;
			}

		}
			
				
}}
