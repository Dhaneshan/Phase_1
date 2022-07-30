package Thread_And_Interface;

public class Throws
{
	void Div() throws ArithmeticException
	{
		int a=405,b=0,rs;
		rs = a / b;
	 System.out.print("\n\tThe result is : " + rs);

	}
	
   public static void main(String [] args)
   {
	   Throws T = new Throws();
       try
      {
          T.Div();
      }
      catch(ArithmeticException Ex)
      {
          System.out.print("\n\tError : " + Ex.getMessage());
      }
      System.out.print("\n\tEnd of program.");
  }
   }
