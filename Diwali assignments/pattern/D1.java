class D1
{
	public static void main(String args[])
	{
		int i;
		for( i=1;i<5;i++)
		{
			for(int j=6;j>i;j--)
				
			System.out.print(" ");
		
		for(int j=1;j<=i;j++)
		{
			if(j==1 || j==i)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print( "  " );
			}
		}
		System.out.println(" ");
		}
		System.out.print("  *********");
	}
}
