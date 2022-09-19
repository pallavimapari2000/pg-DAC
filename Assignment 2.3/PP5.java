class PP5

{
	public static void main(String args[])
	{
	for(int i=10;i>1;i--)
			{	
			for(int j=2;j<i;j++)          
			{
			System.out.print("  ");
			}
			for(int j=i-1;j<=9;j++)          
			{
			System.out.print(j+" ");
			}
		
		
		for(int j=8;j>=i-1;j--)
		{
		System.out.print(j+" ");
		}
		
		System.out.println();
		}
			
			}
}