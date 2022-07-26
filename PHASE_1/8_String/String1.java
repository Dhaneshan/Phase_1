package String;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Strings Methods");
		String s1=new String("WELCOME TO JAVA");
		
		//Length of the string
		System.out.println("\n");
		System.out.println("Length : "+s1.length());
		
		//Substring of the string
		System.out.println("\n");
		System.out.println("Substring : "+s1.substring(2,5));
		
		//String Compare
		String a1="Welcome";
		String a2="Welcomde";
		System.out.println("\n");
		System.out.println("String Comparsion : "+a1.compareTo(a2));
		
		//IS empty
		String b1="";
		System.out.println("\n");
		System.out.println("IsEmpty : "+b1.isEmpty());
		
		//to Lower case
		String c1="dHANESHAN";
		System.out.println("\n");
		System.out.println("Convert To Lower case : "+c1.toLowerCase());
		
		//to Upper case
		String d1="dhaneshan";
		System.out.println("\n");
		System.out.println("Convert To Upper case : "+d1.toUpperCase());
		
		//Replace
		String e1="Welcode";
		String e2=e1.replace('d', 'm');
		System.out.println("\n");
		System.out.println("Before replace a Character :"+e1);
		System.out.println("After replace a Character :"+e2);
		
		//Equals
		String f1="WELCOME";
		String f2="Welcome";
		System.out.println("\n");
		System.out.println("Check whethet two string are equal :"+f1.equals(f2));
		
		//Creating StringBuffer
		//Appending Method
		System.out.println("\n");
		StringBuffer g1= new StringBuffer("Welcome to java ");
		g1.append("Enjoy Learning And Make fun with code");
		System.out.println("Creating the string buffer and append the string :"+g1);
		
		//Insert Method
		StringBuffer h1=new StringBuffer("haneshan");
		h1.insert(0,'D');
		System.out.println("\n");
		System.out.println("Insert Method :"+h1);
		
		//replace method
		StringBuffer j1=new StringBuffer("asdneshan");
		j1.replace(0, 3, "Dha");
		System.out.println("\n");
		System.out.println("Replace Method :" +j1);
		
		//Delete Method
		StringBuffer i1=new StringBuffer("asdhaneshan");
		i1.delete(0, 2);
		System.out.println("\n");
		System.out.println("Delete Method :" +i1);
		
		//String Builder
		System.out.println("Working with String Buffer ");
		StringBuffer k1=new StringBuffer("Happing");
		k1.append(" Learning");
		System.out.println("\n");
		System.out.println("Appending Method :"+k1);
		
		//String Buffer Delete Method
		System.out.println("\n");
		System.out.println("String buffer delete method : "+k1.delete(0, 1));
		
		//StringBuffer Insert method
		System.out.println("\n");
		System.out.println("String Buffer Insert method :" + k1.insert(0, "Welcome"));
		
		//String Buffer reverse Method
		System.out.println("\n");
		System.out.println("String Buffer Reverse method :" + k1.reverse());
		
		//Conversion From string object to string buffer
		String m1="Hello";
		System.out.println("\n");
		System.out.println("Conversion from string to string buffer");
		StringBuffer m2=new StringBuffer(m1);
		System.out.println(m2);
		System.out.println(m2.reverse());
		
		// conversion from string object to string buffer
		System.out.println("conversion from string object to string buffer");
		StringBuilder v1=new StringBuilder(m1);
		v1.append(" World");
		System.out.println(v1);
		
	}

}
