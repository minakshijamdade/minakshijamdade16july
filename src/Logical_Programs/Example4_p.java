
package Logical_Programs;

public class Example4_p

{
   public static void main(String[] args)
   
   {
      String org="aba";
      String rev="";
		  
		  for(int i=org.length()-1;i>=0;i--)
		  {
			  
			  rev=rev+org.charAt(i);
		  }  
			
		    System.out.println(rev);
   	   	 
		  
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


