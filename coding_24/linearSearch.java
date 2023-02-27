class linearSearch
{
    
 public static int search(int arr[],int x)
	{
		for(int i=0;i<arr.length;i++)
		{
			if (x==arr[i])
			{
				return i;
			}
		}
			return -1;
		
	}
   
    public static void main(String args[])
    {
       int arr[] ={2,4,6,3,9};
	   int x =16;
	   
	   int result= search(arr,x);
	   
	   if (result == -1)
	   {
		   System.out.println("not found");
	   }
	   else
	   {
		   System.out.println("found");
	   }
    }
}