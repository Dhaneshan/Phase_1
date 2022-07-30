package Thread_And_Interface;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=52,b=0,result = 0;
		try
		{
			result=a/b;
		}
		catch(Exception e)
		{
			System.out.println("\n Error : "+e.getMessage());
		}
		finally
		{
			System.out.println("The result are :"+ result);
		}

	}

}
