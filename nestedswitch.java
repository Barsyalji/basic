import java.util.*;
class nestedswitch{
	public static void main(String [] arg)
	{
		System.out.println("Find your Subjects");
		System.out.println("Enter a branch");
		Scanner a = new Scanner(System.in);
		String b = a.nextLine();
		
		System.out.println("Enter a year");
		int c = a.nextInt();
		
			switch(b)
			{
				case "cse":
					switch(c)
					{
						case 1:
						{
							System.out.println("artificial intelligence,aws,C++");
							break;
						}
						case 2:
						{
							System.out.println("deta science, oprating System,java");
							break;
						}
						case 3:
						{
							System.out.println("computer network,software engineering,python");
							break;
						}
						case 4:
						{
							System.out.println("RDBMS,it,cyber security,.net");
							break;
						}
						default:
						{
							System.out.println("Enter valid year");
							break;
							
						}
					}break;
			
			case "ce":
					switch(c)
					{
						case 1:
						{
							System.out.println("artificial intelligence,aws,C++");
							break;
						}
						case 2:
						{
							System.out.println("deta science, oprating System,java");
							break;
						}
						case 3:
						{
							System.out.println("computer network,software engineering,python");
							break;
						}
						case 4:
						{
							System.out.println("RDBMS,it,cyber security,.net");
							break;
						}
						default:
						{
							System.out.println("Enter valid year");
							break;
							
						}
					}break;
			
			case "ee":
					switch(c)
					{
						case 1:
						{
							System.out.println("artificial intelligence,aws,C++");
							break;
						}
						case 2:
						{
							System.out.println("deta science, oprating System,java");
							break;
						}
						case 3:
						{
							System.out.println("computer network,software engineering,python");
							break;
						}
						case 4:
						{
							System.out.println("RDBMS,it,cyber security,.net");
							break;
						}
						default:
						{
							System.out.println("Enter valid year");
							break;
							
						}
					}break;
			
			case "me":
					switch(c)
					{
						case 1:
						{
							System.out.println("artificial intelligence,aws,C++");
							break;
						}
						case 2:
						{
							System.out.println("deta science, oprating System,java");
							break;
						}
						case 3:
						{
							System.out.println("computer network,software engineering,python");
							break;
						}
						case 4:
						{
							System.out.println("RDBMS,it,cyber security,.net");
							break;
						}
						default:
						{
							System.out.println("Enter valid year");
							break;
							
						}
					}break;
			
			default:
			{
				System.out.println("Enter valid Branch");
				break;
			}
		
	}	
		
}	
}	
	
	