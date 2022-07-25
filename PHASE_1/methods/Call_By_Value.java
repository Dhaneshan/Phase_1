package methods_imple;

public class Call_By_Value 
{
    int val=500;
    int operation(int val)
    {
    	val=val*10/100;
    	return (val);
    }
    public static void main(String [] args)
    {
    	Call_By_Value ans=new Call_By_Value();
    	System.out.println("The value of data before calling the Method :"+ans.val);
    	ans.operation(96);
    	System.out.println("The value of data After calling the Method :"+ans.val);
    }
}
