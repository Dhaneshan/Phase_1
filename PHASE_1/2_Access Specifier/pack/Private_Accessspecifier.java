package pack;
class privateaccessspecifier
{
	private void display()
	{
		System.out.println("You are working in the Private Aceess Specifier");
	}
}
public class Private_Accessspecifier 
{
	 public static void main(String [] args)
     {
	 System.out.println("Private Aceess Specifier");
	 privateaccessspecifier a=new privateaccessspecifier();
	 a.display();
     }
}
