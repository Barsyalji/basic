package ds;
import java.util.*;  
 
public class map{  
 public static void main(String args[]){  
   HashMap<String,String> map=new HashMap<String,String>();//Creating HashMap    
   map.put("1","Mango");  //Put elements in Map  
   map.put("2","Apple");    
   map.put("3","Banana");   
   map.put("4","Grapes");   
   System.out.println(map);
   System.out.println("Iterating Hashmap...");  
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());  
      
   }  
}  
}  
