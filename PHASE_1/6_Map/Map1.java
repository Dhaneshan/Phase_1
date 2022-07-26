package Map1;
import java.util.*;
public class Map1
{
 public static void main(String [] args)
 {
	 //Hash Map
	 HashMap<Integer,String> a=new HashMap<Integer,String>();
	 a.put(1, "Dhaneshan");
	 a.put(2, "Dhaneshan");
	 a.put(3, "Dhaneshan");
	 System.out.println("The Element of Hashmap are : ");
	 for(Map.Entry b:a.entrySet())
	 {
		 System.out.println(b.getKey()+" "+b.getValue());
		 
	 }
	 
	 //Hash Table
	 System.out.println("\n");
	 HashMap<Integer,String> a1=new HashMap<Integer,String>();
	 a1.put(4, "Dhaneshan");
	 a1.put(5, "Dhaneshan");
	 a1.put(6, "Dhaneshan");
	 System.out.println("The Element of Hash Table are : ");
	 for(Map.Entry b1:a1.entrySet())
	 {
		 System.out.println(b1.getKey()+" "+b1.getValue());
		 
	 }
	 
	 //Tree Map
	 System.out.println("\n");
	 TreeMap<Integer,String> a3=new TreeMap<Integer,String>();
	 a3.put(7, "Dhaneshan");
	 a3.put(8, "Dhaneshan");
	 a3.put(9, "Dhaneshan");
	 System.out.println("The Element of TreeMap are : ");
	 for(Map.Entry b3:a3.entrySet())
	 {
		 System.out.println(b3.getKey()+" "+b3.getValue());
		 
	 }
 }
}
