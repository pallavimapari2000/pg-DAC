//5.Write a java program to Count the Number of Vowelsin the given string. 

class countVowels
{
	public static void main(String args[])
	{
		String str = "pallavi";
		int c=0;
		
		for(int i = 0; i<str.length() ;i++)
		{
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'
			 ||str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') 
				++c;
		}
		System.out.print(c);
		
	}
}