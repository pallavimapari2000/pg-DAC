//11. Write a Java Program to Move all Zeros to Start of the Array. 
import java.io.*;
  
class PushZeroStart
{
    
    static void pushZerosToStart(int arr[], int n)
    {
        int count = n-1;  // Count of non-zero elements
  
        
        for (int i = n-1; i>=0; i--)
            if (arr[i] != 0)
                arr[count--] = arr[i]; 
  
        
        while (count >= 0)
            arr[count--] = 0;
    }
  
    
    public static void main (String[] args) 
    {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
       
	   int n = arr.length;
        pushZerosToStart(arr, n);
        System.out.println("Array after pushing zeros to the back: ");
        
		for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
}
