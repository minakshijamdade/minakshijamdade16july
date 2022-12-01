
package Logical_Programs;

import java.util.Scanner;

public class Example6_Fact_of_no 
{
   public static void main(String[] args) 
   {
	System.out.print("Enter no=");
	Scanner src=new Scanner(System.in);
	
	int num=src.nextInt();
	
	int fact=1;
	
	for(int i=num;i>=1;i--)
	{
		
		fact=fact*i;
	}
	
	System.out.println(fact);
}
}
