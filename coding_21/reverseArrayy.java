//. Write a Java Program to Reverse the given array without using additional Array.

class reverseArrayy
{
	public static void main(String args[])
	{
	
		int arr[] = {2,5,9,4,1,4};
		int num = arr.length;
		
		for( int i=num-1;i>=0 ;i--)
		{
			int reverse[]=new int [i];
			
			System.out.print(reverse[i]);
		}
		
	}
}