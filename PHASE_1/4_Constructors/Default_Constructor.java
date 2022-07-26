package Constructors;
class Empinfo
{
	 // Employee Information
		int id;
		String name;
		void display()
		{
			System.out.println(id +" "+name);
		}
}
public class Default_Constructor
{
   public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empinfo ans1=new Empinfo();
		Empinfo ans2=new Empinfo();
		ans1.display();
		ans2.display();
		

	}

}
