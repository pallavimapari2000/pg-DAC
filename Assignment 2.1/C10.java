class C10
{
	public static void main(String args[])
	{
		char d=69;
		for (int i= 1; i<=5;i++) 
		{
			for(int j =4 ; j >= i ; j--)
				{
				System.out.print(" ");
				}
			for(char j =1; j <= i ; j++) 
			{
				System.out.print(d+" ");
				d--;	
			}
			for(int j =1;j<=i;j++){
				d--;
			}
			d=69;
			System.out.println();	
		}
		
	}
}