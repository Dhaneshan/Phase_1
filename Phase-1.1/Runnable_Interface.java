package Thread_And_Interface;
public class Runnable_Interface 
{
	public static int myCount = 0;
	public static void main(String a[])
    {
        System.out.println("Starting Main Thread...");
        Thread t = new Thread(()->
          {
        	while(Runnable_Interface.myCount <= 10){
            try
            {
                System.out.println("Expl Thread: "+(++Runnable_Interface.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) 
            {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
          });
        t.start();
        while(Runnable_Interface.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++Runnable_Interface.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}
