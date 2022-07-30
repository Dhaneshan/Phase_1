package Thread_And_Interface;
class MyException1 extends Exception{
   String str1;
   MyException1(String str2) {
	str1=str2;
   }
   public String toString()
   { 
	return ("MyException1 Occurred: "+str1) ;
   }
}
public class ExceptionHandlers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new MyException1("This is My error Message");
		}
		catch(MyException1 exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	}
}
