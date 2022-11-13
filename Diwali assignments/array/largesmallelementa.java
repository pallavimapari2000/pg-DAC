class largesmallelement
{
	public static void main(String args[])
	{
	int large,small;
	int arr[] = new int[]{9, 2, 13, 4, 5};
	int n = arr.length;
	large=small=arr[0];
	
	for(int i=1;i<n;++i)
	{
		if(arr[i]>large)
		large=arr[i];

		if(arr[i]<small)
		small=arr[i];
	}

	System.out.println("The smallest element is " + small );
	System.out.print("The largest element is "+ large );
	}
}
