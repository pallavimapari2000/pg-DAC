// 2.How to Swap two Stringswithout using third (temporary) variable? 

class swapString
{
	public static void main(String args[])
	{
		String str = "pallavi";
		String str1 = "mapari";
		String temp;
		
		System.out.print("Before swapping str :- " + str + " & str1 :- " + str1);
		
		temp = str;
		str = str1;
		str1 = temp ;
		
		System.out.println("");
		
		System.out.print("after swapping str :- " + str + " & str1 :- " + str1);
		
		
	}
}