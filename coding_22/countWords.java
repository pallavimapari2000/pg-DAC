//4.  Write a java program to Count the Number of Wordsin a given String.

/*class countWords
{
	public static void main(String args[])
	{
		String str = "pallavi";
		
		System.out.print(str.length());
		
	}
}*/
//------------------------------------------------------------------------------
class countWords
{
 public static void main(String[] args)
	{
        String str = " a  vb c";
 
        int count = 1;
 
        for (int i = 0; i < str.length() - 1; i++)
        {
            if ((str.charAt(i) != ' '))
            {
                count++;
            }
        }
        System.out.println("Number of words in a string : " + count);
    }
}