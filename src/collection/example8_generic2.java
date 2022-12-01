package collection;

import java.util.TreeSet;

public class example8_generic2 
{
public static void main(String[] args) 
{ 
	TreeSet<Integer> tr=new TreeSet<Integer>();
	tr.add(200);
	tr.add(300);
	tr.add(400);
	tr.add(700);
	tr.add(400);
	tr.add(100);

	System.out.println("======Print all data======");
	
	for(Integer s1:tr)
	{
		System.out.println(s1);
	}
	
}


}
