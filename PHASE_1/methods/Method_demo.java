package methods_imple;
public class Method_demo
{
    public int Multiplynumbers(int a,int b)
    {
    	int z=a*b;
    	return z;
    }
   public static void main(String [] args)
 {
      Method_demo ans=new Method_demo();
      int value=ans.Multiplynumbers(25, 4);
      System.out.println("Multiplication of two number is : "+value);
 }
}
