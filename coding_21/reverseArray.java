//12. Write a Java Program to Reverse the given array without using additional Array.

public class reverseArray
 {
   public static void main(String args[]) 
   {
      int a[] = { 11,10,4, 15, 16, 13, 2 };
      
	  for(int i=a.length-1;i>=0;i--)
	  {
		  System.out.println(a[i]);
	  }
   }
}