package Thread_And_Interface;

public class Try_Catch 
{
	public static void main(String [] args)
	{
		int arr[]=new int[3];
		try
		{
			arr[10]=5;
		}
        catch (ArrayIndexOutOfBoundsException e) 
        {
               System.out.println("The Array Index Out Of Bounds Please enter the correct position");
       	}
		finally
		{
			System.out.println("The array length is " +arr.length);
		}

}
}
