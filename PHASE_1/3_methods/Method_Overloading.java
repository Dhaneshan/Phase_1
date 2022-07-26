package methods_imple;

public class Method_Overloading 
{
   public void area(int r)
   {
	   System.out.println("Area of Circle : "+(3.14*r*r));
   }
   public void area(int a,int b)
   {
	   System.out.println("Area of Triangle : "+(0.5*a*b));
   }
   public static void main(String[] args)
   {
	   Method_Overloading ans=new Method_Overloading();
	   ans.area(56);
	   ans.area(40, 45);
   }
}
