//1. Write a java program to check Given String is Palindrome or NOT. 

//---------------------------------------------------------------------------

class paliString
{
	public static void main(String args[])
	{
		String str = "pipipp";
		String str1 ="";
		
		int num= str.length();
		
		for(int i = num-1; i>=0; i--)
		{
			str1= str1 + str.charAt(i);
		}
		
		if(str.equals(str1))
		{
			System.out.print("palindrome");
		}
		else
		{
			System.out.print("not palindrome");
		}
	}
}