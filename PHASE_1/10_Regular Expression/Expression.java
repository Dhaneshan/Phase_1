package experssion;
import java.util.regex.*;
public class Expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Var1="[A-Z]+";
		String Var2="DHANESHAN IS A GOOD  or bad or poor BOY";
		Pattern p=Pattern.compile(Var1);
		Matcher c=p.matcher(Var2);
		while(c.find())
		{
			System.out.println(Var2.substring(c.start(),c.end()));
		}
	}

}
