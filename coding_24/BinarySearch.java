
class BinarySearch
{
	
	int Search(int arr[], int l, int t , int x)	
	{
		if (t>=l)
		{
			int mid = l + (t - l) / 2;
			
			if (arr[mid]==x)
				return mid;
			
			if (arr[mid] >x)
				return Search(arr,l,mid-1,x);
			
			else
				return Search(arr,mid+1,t,x);
		}
		return -1;
	}
	
	
	public static void main(String args[])
	{
		
		BinarySearch bs =  new BinarySearch();
		int arr[] = {2,8,4,9,10};
		int num = 10;
		
		int n = arr.length;
		int result = bs.Search(arr,0,n-1,num);
		
		if(result==-1)
		{
			System.out.println("element not found");
		}
		else
		{
			System.out.println("element found at position :- "+ result);
		}
		
		
	}
}