package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class example_practice 

{
public static void main(String[] args) 

{
	ArrayList al=new ArrayList();
	
	al.add("Rahul");
	
	al.add(101);
	
    al.add('A');
	
	al.add("Rahul");
	
	al.add(79.5f);
	
	al.add(null);
	
	al.add(null);
	
	System.out.println(al);
	
	al.add(4,"Mahesh");
	System.out.println(al);
	
	al.remove(4);
	System.out.println(al);
	
	al.set(1,102);
	System.out.println(al);
	System.out.println("===========================");
	Iterator itr=al.iterator();
	while(itr.hasNext())
	{
		
		System.out.println(itr.next());
	}
	
	System.out.println("===========================");
	
	ListIterator litr=al.listIterator();
	
	while(litr.hasNext())
	{
		
		System.out.println(litr.next());
	}
	
	System.out.println("===========================");
	for(int i=0;i<=al.size()-1;i++)
	{
		
		System.out.println(al.get(i));
	}
	
	System.out.println("===========================");
	for(Object s1 :al)
	{
		System.out.println(s1);
	}
	
	
	
	
}
}
