package Thread_And_Interface;

public class Polymorphism 
	{
	    public int Mul(int x, int y) 
	    { 
	        return (x * y); 
	    } 
	    public int Mul(int x, int y, int z) 
	    { 
	        return (x * y * z); 
	    } 
	    public double Mul(double x, double y) 
	    { 
	        return (x * y); 
	    } 
	   
	    public static void main(String args[]) 
	    { 
	    	Polymorphism s = new Polymorphism(); 
	        System.out.println(s.Mul(10, 20)); 
	        System.out.println(s.Mul(10, 20, 30)); 
	        System.out.println(s.Mul(10.5, 20.5)); 
	    } 
	}

	
