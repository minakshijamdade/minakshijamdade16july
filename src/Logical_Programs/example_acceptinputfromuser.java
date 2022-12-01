package Logical_Programs;

import java.util.Scanner;

public class example_acceptinputfromuser 

{
public static void main(String[] args) 
{
   Scanner s1=new Scanner(System.in);
   
   System.out.print("Enter student name:");
   
   String s2=s1.next();    //use to accept String input from user
   
   System.out.println(s2.length());
   System.out.println(s2);
  
  
}
}
