 import java.io.File;
 import java.io.IOException;
 public class Filecreation{
	 public static void main(String[] args){
	 try{
		 FIle myObj = new file("filename");
		 if (my.createnewFile()){
			 System.out.println("file created:" +  myObj.getname());
		 }else{
			 System.out.println("file already exists.");
			 
		 }
	 }
	 catch (IOException e){
		 System.out.println("an error occurred.");
		 e.printStackTrace();
	 }
 }
 }