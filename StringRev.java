package ds;

import java.io.*;
import java.util.Scanner;
  
class StringRev {
    public static void main (String[] args) {
        
        String str= "Geeks", nstr="";
        char ch;
        
      System.out.print("Original word: ");
      System.out.println("Geeks");          
      for (int i= str.length(); i>0; --i)
      {
           
      System.out.print( str.charAt(i-1));
      }
    }
}
  