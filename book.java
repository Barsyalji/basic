import java.util.*;
 class book{
	
 }
class test {
	 void book(String title,int year)
	 {
		 System.out.println("this is book");
		 System.out.println ("Year of publish"+ year);
		System.out.println("tilte:"+ title);
						 
	 }
	 
public static void main(String [] args)
int year = 1960;

String title = "Mistress of Pride";

book b1 = new book(title, year);

System.out.println (b1);

b1. setRead (true);

System.out.println(b1);

title = "Spirit Citadel of Vermoriel";

book b2 = new (book,title);

System.out.println (b2);

b2.setRead (true);

System.out.println("The book has now been read: " + b2.isRead());
 
}

