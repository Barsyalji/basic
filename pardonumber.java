import java.util.*;
class Table{
				public static void main(String [] args){
					Scanner s = new Scanner(System.in);
					System.out.println("number");
					int a = s.nextInt();
					int b = a % 10;
					int c = a / 10;   
					int d = c % 10;
					int e = c / 10;
					int f = (b*100)+(d*10)+(e);
					//for( int a != 0 ; b <= 10; b++)
					//{
				    //int c = a*b;	
					/*System.out.println(a);
					System.out.println(b);
					System.out.println(c);
					System.out.println(d);
					System.out.println(e);
					System.out.println(f);*/
					if(a == f)
						System.out.println("number is pardonumber");
					else
							System.out.println("number is not pardonumber");
					}
					
						}
