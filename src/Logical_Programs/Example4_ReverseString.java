package Logical_Programs;

public class Example4_ReverseString 

{
   public static void main(String[] args) 
   
   {
	  String org="abcd";
	  
	  String rev="";
	  
	  
	  for(int i=org.length()-1;i>=0;i--) //dcba  
	  {
		  
		  rev=rev+org.charAt(i);
	  }
	  
	  
	  System.out.println(rev);
	  
	  
}
   
}
