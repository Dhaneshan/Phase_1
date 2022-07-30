package Thread_And_Interface;

public class Throw
{
	public static void main(String [] args)
	{
		int a=45,b=0,result;
		try
		{
			if(b==0)
				 throw(new ArithmeticException("Can't divide a number by zero"));
			else
			{
				result=a/b;
				System.out.println("Division :"+result);
			}
		}
		catch(ArithmeticException e)
		{
            System.out.print("\n\tError : " + e.getMessage());
		}
		System.out.print("\n\tEnd of program.");
	}

}
