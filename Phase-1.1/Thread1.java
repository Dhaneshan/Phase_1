package Thread_And_Interface;

public class Thread1 
{
 	public static void main( String args[] )
 	{
 		Thread  mt = new  Thread (
 				()->
 		{
 		System.out.println("concurrent thread started running.");
		try {Thread.sleep(2000);}
		catch(Exception e) {}
		}
 		);
 		
  		mt.start();
 	}
}
