package Logical_Programs;

import java.util.Scanner;

public class EXAMPLE4_P1 

{
   public static void main(String[] args) 
   
   {
	    String rev="";
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.print("Enter String=");
	    
	    String org=sc.next();
	    
	    for(int i=org.length()-1;i>=0;i--)
	    {
	    	
	    	rev=rev+org.charAt(i);
	    }
	    System.out.println("Original String is="+ org);
	    
	    System.out.println("Reverse String is="+ rev);
	    
	    if(org.equals(rev))
	    {
	    	
	    	System.out.println("Given String is Palindrome");
	    }
	    else
	    {
	    	
	    	System.out.println("Given String is not Palindrome");
	    }
	    
	    
	    
}
}
