package Thread_And_Interface;
interface First1
{
	default void show()
	{
		System.out.println("This Statement Excuted First");
		
	}
}
interface Second1
{
	default void show()
	{
		System.out.println("This Statement Excuted  Second ");
		
	}
}
public class Diamond implements First1,Second1
{
    public void show()
    {
    	First1.super.show();
    	Second1.super.show();
    }
    public static void main(String args[]) 
    { 
    	Diamond ob = new Diamond(); 
        ob.show(); 
    } 

}
