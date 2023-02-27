import java.io.*;
import java.util.*;

public class reverseString
{
    
  public static void main(String args[])
  
  {
      
      String str="I Love India";
      String[] words=str.split(" ");
      String reversestring="";
      
      for(String w:words)
      {
          
          String reverseword="";
          
         for(int i=w.length()-1;i>=0;i--)
         {
           reverseword=reverseword+w.charAt(i);
         }
         reversestring=reversestring+reverseword+" ";
         
      }
      
      
      System.out.println(reversestring);    
     
  }
  }
 // ==================================================================
 /* import java.io.*;
import java.util.*;

public class Main
{
    
  public static void main(String args[])
  
  {
      
      String str="I Love India";           //original string
      String[] words=str.split(" ");      //splitting string into words
      String reverseword="";
      
      for(String w:words)       //Love           
      {
          
         StringBuffer sb=new StringBuffer(w);
         sb.reverse();
         
         reverseword=reverseword+sb.toString()+" ";
         
      }
      
      
      System.out.println(reverseword);

     
     
      
  }*/