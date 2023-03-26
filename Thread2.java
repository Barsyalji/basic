package ds;

public class Thread2 extends Thread  {
	
       public void run() {
    	   for(int i=1;i<5;i++)    
           {    
               try 
               {  
            	   System.out.println(Thread.currentThread().getName());
                   Thread.sleep(100);
                 //  System.out.println("is run() method isAlive "+Thread.currentThread().isAlive());  

               }
               catch(InterruptedException e)
               {
            	   System.out.println(e);
            	   }    
               System.out.println(i);    
           } 
       }
    
	
public static void main(String[] asd) {
	Thread2 ob =new Thread2();
	Thread2 obj =new Thread2();
	       
      
      System.out.println("Name of Thread: "+ ob.getName());    
	ob.start();
		try {
		ob.join();
	}
	catch(Exception e) {
		System.out.println(e);
	}
	obj.start();
	obj.suspend(); 
	  obj.resume(); 

//	obj.setPriority(Thread.MAX_PRIORITY);
//	 System.out.println("t1 thread priority : " + ob.getPriority());   
//     System.out.println("t2 thread priority : " + obj.getPriority());
}
}