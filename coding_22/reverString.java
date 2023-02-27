// 3.Write a java program to Reverse a Stringwithout using in-build function.
class reverString
{
	public static void main(String args[])
	{
		String str = "pallavi";
		
		int num= str.length();
		
		for(int i = num-1; i>=0; i--)
		{
			System.out.print(str.charAt(i));
		}
	}
}
//--------------------------------------------
