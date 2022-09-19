class C2
{
	public static void main(String args[])
	{
		char a = 65;
		for (int i= 1; i<=5;i++)
			{
			for(char j =1; j <= i ; j++)
				{
				System.out.print(a+" ");
				a++;	
			}
			a=65;
			System.out.println();	
		}
	}
}