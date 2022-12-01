package collection;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class example4_Hashset2 

{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();     
		al.add("Rahul");
		al.add(101);
		al.add('A');
		al.add(65.5f);
		al.add("Rahul");
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		
		
		HashSet hs=new HashSet(al);
		System.out.println(hs);

	
	}

}
