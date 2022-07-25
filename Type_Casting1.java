package Type_casting;
public class Type_Casting1 {
public static void main(String [] args)
{
   	//Implicit Conversion
	char a='D';
	System.out.println("Implicit Type Conversion");
	System.out.println("Value That store in a is  "+a);
	int b=a;
	System.out.println("Value That store in b is  "+b);
	float c=a;
	System.out.println("Value That store in c is  "+c);
	double d=a;
	System.out.println("Value That store in d is  "+d);
	long e=a;
	System.out.println("Value That store in e is  "+e + "\n");
	//Explicit Conversion
	//Double to integer
	double f=68.36;
	int g=(int)f;
	char h=(char)f;
	System.out.println("Explicit Type Conversion");
	System.out.println("Value That store in f is  "+f);
	System.out.println("Value That store in g is  "+g);
	System.out.println("Value That store in h is  "+h);
	

}
}
