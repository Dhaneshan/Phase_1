package Thread_And_Interface;
class Myexception extends Exception
{


	public Myexception(String a)
	{
		super(a);
	}
}
public class CustomException {

	public static void main(String[] args) {
		
		try
		{
			throw new Myexception("Dhaneshan");
		}
		catch(Myexception e)
		{
			System.out.println("Found");
			System.out.println(e.getMessage()); 
		}

	}

}
