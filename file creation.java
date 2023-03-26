 import java.io.file;
 import java.io.IOException
 public class CreateFile{
	 public static void main(String[] args){
	 try{
		 FIle my obj = new file("filename");
		 if (my.createnewFile()){
			 System.out.println("file created:" +  myObj.getname());
		 }else{
			 System.out.println("file already exists.");
			 
		 }
	 }catch (IOException e){
		 System.out.println("an error occurred.");
		 e.printStackTrace();
	 }
 }
 }