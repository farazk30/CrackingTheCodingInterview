import java.util.*;
public class HashTablePractice {

	public Hashtable<Integer,String> h=new Hashtable<>();
	public static void main(String[] args)
	{
		HashTablePractice obj=new HashTablePractice();
		obj.addValue(1, "Faraz khan");
		obj.display();
		
		
	}
	void addValue(int i,String s)
	{
		h.put(i,s);
	}
	void display()
	{
		System.out.println(h);
		System.out.println(h.get(1));
	}
}
