//1. Calculate the average of given array. 
class  arrayAvg
{
	public static void main(String args[])
	{
		int arr[] ={1,3,8,4};
		int sum =0;
		
		for(int i =0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			
		}
		System.out.println(sum);
		System.out.println("average :- " + ( sum/arr.length));
		
	}
	
}