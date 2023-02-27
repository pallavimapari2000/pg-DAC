/*class prime_No
{
public static void main(String args[])
	{
		int num= 17;
		int count=0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				++count;
			}		
			
		}
		String temp = (count==2)? "prime": "not";
			System.out.println(temp);
		
	}
}*/
//---------------------------------------------------

class prime_No
{
public static void main(String args[])
	{
		int numl= 1;
		int numu = 10;
		int count=0;
		
		for(int i=numl;i<=numu;i++)
		{
			for(int j=numl;j<=numu;j++)
			{
				if(numl%j==0)
				{
					++count;
				}
			}
		}
		int temp = (count==2)? numl: 000;
			System.out.println(temp);
		
	}
}