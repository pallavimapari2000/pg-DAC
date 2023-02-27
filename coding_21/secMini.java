//3. Find the second minimum number in the given array. 

import java.util.Arrays;
class  secMini
{
	public static void main(String args[])
	{
      int array[] = {10, 20, 25, 63, 96, 57};
      int size = array.length;
      Arrays.sort(array);
      System.out.println("sorted Array ::"+Arrays.toString(array));
      int res = array[1];
      System.out.println("2nd minimum element is ::"+res);
   }
}
//--------------------------------------------------------------------------

/*public class secMini
 {
   public static int getSecondMini(int[] a) {
      int temp;
      //sort the array
      for (int i = 0; i < a.length; i++) {
         for (int j = i + 1; j < a.length; j++) {
            if (a[i] > a[j]) {
               temp = a[i];
               a[i] = a[j];
               a[j] = temp;
            }
         }
      }
      //return second minimum element
      return a[1];
   }
   public static void main(String args[]) 
   {
      int a[] = { 11,10,4, 15, 16, 13, 2 };
      System.out.println("Second Largest: " +getSecondMini(a));
   }
}*/
//==============================================================================================
