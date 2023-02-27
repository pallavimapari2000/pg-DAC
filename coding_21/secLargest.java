//2. Find the second largest number in the given array. 
 

/*import java.util.Arrays;
class  secLargest
{
	public static void main(String args[])
	{
      int array[] = {10, 20, 25, 63, 96, 57};
      int size = array.length;
      Arrays.sort(array);
      System.out.println("sorted Array ::"+Arrays.toString(array));
      int res = array[size-2];
      System.out.println("2nd largest element is ::"+res);
   }
}*/
//--------------------------------------------------------------------------

public class secLargest
 {
   public static int getSecondLargest(int[] a) {
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
      //return second largest element
      return a[a.length - 2];
   }
   public static void main(String args[]) 
   {
      int a[] = { 11,10,4, 15, 16, 13, 2 };
      System.out.println("Second Largest: " +getSecondLargest(a));
   }
}
