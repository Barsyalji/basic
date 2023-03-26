import java.util.*;
class switc{
	public static void main(String [] arg)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter a date");
			int a = s.nextInt();
		
		switch(a){
		
			case 5,12,19,26:{
						System.out.println("monday");
						break;
					}
			case 6,13,20,27:{
						System.out.println("tuesday");
						break;
					}
			case 7,14,21,28:{
						System.out.println("wednesday");
						break;
					}
			case 1,8,15,22,29:{b
						System.out.println("thursday");
						break;
					}
			case 2,9,16,23,30:{
						System.out.println("friday");
						break;
					}
			case 3,10,17,24:{
						System.out.println("suturday");
						break;
					}
			case 4,11,18,25:{
						System.out.println("sunday");
						break;
					}
			default:
			{
				System.out.println("Enter valid date");
				break;
			}
			
						
	}
}
} 