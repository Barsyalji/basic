package ds;
import java.util.*;
public class arrayList {

	public static void main(String[] args) {
		// create array list in java 
		 ArrayList<String> ls = new ArrayList<String>();
		 // add() used to add a data in array list
		 ls.add("atul kumar");
		 ls.add("abhay singh");
		 ls.add("ravi");
		 ls.add(" ");
		 ls.add("kumar");
		 ls.add("akashay");
		 ls.add("akash");
		// print array list simple format
		 System.out.println(ls);
		 // get() is used in array list to get array address to gat data
		 System.out.println(ls.get(1));
		 // set()is used to set data or change data in array list
		 ls.set(0, "apple");
		 System.out.print(ls);
		 		//print array list in java
		 for(String fruit:ls)    
			    System.out.println(fruit);    
		     // size of array use to size() function
		 System.out.println(ls.size());    
		 	// isEmpty() function is used to check array is empty or not
		 System.out.println("Is ArrayList Empty: "+ls.isEmpty()); 
		 // sort list in array
		 Collections.sort(ls);  
		 for(String fruit:ls)  
			    System.out.println(fruit);   
	}

}
