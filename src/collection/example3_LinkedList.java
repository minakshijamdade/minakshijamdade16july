package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class example3_LinkedList 

{
	public static void main(String[] args)
		
	{	
             LinkedList LL=new LinkedList();
  
    LL.add("Mahesh");
    LL.add(101);
	LL.add('A');
	LL.add(75.5f);
	LL.add(101);
	LL.add(null);
	LL.add(null);
	
	
	System.out.println(LL);
	System.out.println(LL.size());
	System.out.println(LL.isEmpty());
	System.out.println(LL.contains(101));   //true
	System.out.println(LL.get(2));
	
	System.out.println(LL);
	//add info in between linkedList
	LL.add(4, 500);
	System.out.println(LL);
	
	//remove/delete info in between LinkedList
			LL.remove(4);
			System.out.println(LL);
			
			
			//modify/update info
			LL.set(0, "Ramesh");
			System.out.println(LL);
			
			System.out.println("-----print all data using Iterator cursor ------");
		    Iterator itr=LL.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
	
			System.out.println("-----print all data using ListIterator cursor ------");
			ListIterator litr=LL.listIterator();
			while(litr.hasNext()) 
			{
				System.out.println(litr.next());
			}
	
			System.out.println("-----print all data using for loop ------");
		      for(int i=0; i<=LL.size()-1; i++)
		     {
			     System.out.println(LL.get(i));
		      }
		
		     System.out.println("-----print all data using foreach loop ------");
		    for(Object s1: LL)
		    {  
			     System.out.println(s1);
		     }
		
		
		
		
	}

  
}
