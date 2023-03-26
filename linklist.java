package ds;

import java.util.*;

public class linklist {

	public static void main(String[] args) {
		 LinkedList<String> ls = new LinkedList<String>();
		 ls.add("atul kumar");
		 ls.add("abhay singh");
		 System.out.println(ls);
		 //second list in likedlist
		 LinkedList<String> ls2 = new LinkedList<String>();
		 ls2.add("atul kumar");
		 ls2.add("abhay singh");
		 // add all element in 2ed list
		 ls.addAll(ls2);
		 System.out.println(ls);
		 // add first element in linked list
		 ls.addFirst("name");
		 System.out.println(ls);
		 // all last element in liked list
		 ls.addLast("sur name");
		 System.out.println(ls);
		 // remove element in a list
		 ls.remove(1);
		 ls.add(3,"barsyal");
		 System.out.println(ls);
				 }
		 
	}


