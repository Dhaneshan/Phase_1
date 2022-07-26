package Constructors;
class Std
{
	int id;
	String name;
	Std(int id1, String name1)
	{
		id=id1;
		name=name1;
	}
	void display()
	{
		System.out.println(id +" "+name);
	}
}
public class Parameterized_Constructor 
{
	 public static void main(String[] args)
	 {
			// TODO Auto-generated method stub
			Std ans1=new Std(1,"Dhaneshan");
			Std ans2=new Std(2,"Suresh");
			ans1.display();
			ans2.display();
}
}
