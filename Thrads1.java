package ds;

class Thrads1 extends Thread{
	 public void run(){
		 try {
			 Thread.sleep(1000);
	   System.out.println("running...");
	   }
		 catch(Exception e)
		 {
			 System.out.print("Error msege");
		 }
	 }
	 public static void main(String args[]){
		  
		 Thrads1 t1=new Thrads1();
		 t1.start();    
		 Thrads1 ta =new Thrads1();
		 t1.start();    

	 
	}

}