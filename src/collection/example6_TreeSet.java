package collection;


	import java.util.Iterator;
	import java.util.TreeSet;

	public class example6_TreeSet
	{
		public static void main(String[] args)
		{
			TreeSet tr=new TreeSet();
			tr.add(500);
			tr.add(600);
			tr.add(100);
			tr.add(200);
			tr.add(300);
			tr.add(700);
			tr.add(400);
			tr.add(100);
		//	tr.add(null);
			
			System.out.println(tr);
			
			System.out.println(tr.isEmpty());
			System.out.println(tr.size());
			System.out.println(tr.contains(201));
			
			tr.remove(400);
			System.out.println(tr);
			
			System.out.println(tr.first());   //100
			System.out.println(tr.last());    //700
			
			tr.pollFirst();     //remove 1st element from treeset
			System.out.println(tr);
			
			tr.pollLast();    //remove last element from treeset
			System.out.println(tr);
			
			System.out.println("-------print data using iterator cursor--------");
			Iterator itr = tr.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
			System.out.println("------print info in descending order--------");
			Iterator ditr = tr.descendingIterator();
			while(ditr.hasNext())
			{
				System.out.println(ditr.next());
			}
			
			System.out.println("----print all data using for each loop-----");
			
			for(Object s1:tr)
			{
				System.out.println(s1);
			}
			
			
			
		}

			

}

