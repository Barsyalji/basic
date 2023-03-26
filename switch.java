import java.util.*;
class switc{
	public static void main(String [] arg)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("submit,multiple,devision,Subtraction, moduus");
		String d = s.nextLine();
		System.out.println("enter a number");
			int a = s.nextInt();
			int b = s.nextInt();
			int c;
		
		switch(d){
		
			case "submit":{
							c = a + b;
							System.out.println("submit of two number is "+c);
							break;
							
						}
			case "multiple":{
							c = a * b;
							System.out.println("multiple of two number is "+c);
							break;
							
						}
			case "devision":{
							c = a / b;
							System.out.println("devision of two number is "+c);
							break;
						}
			case "Subtraction":{
							c = a - b;
							System.out.println("Subtraction of two number is "+c);
							break;
						}
			case " moduus":{
							c = a % b;
							System.out.println(" moduus of two number is "+c);
							break;
						}
			
						
	}
}
}