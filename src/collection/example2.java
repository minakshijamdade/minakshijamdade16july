package collection;

import java.util.ArrayList;

public class example2 
{
	
		public static void main(String[] args) 
		{
			ArrayList al=new ArrayList();          //initial capacity=10
			al.add("Rahul");
			al.add(101);
			al.add('A');
			al.add(65.5f);
			al.add("Rahul");
			al.add(null);
			al.add(null);
			
			System.out.println(al);
			System.out.println(al.size());
			System.out.println(al.isEmpty());   //false
			System.out.println(al.contains(101));    //true
			System.out.println(al.get(3));      //65.5
				
		}

}
