class palindrome_No
{
	public static void main (String args[])
	{
	  
		int tempp,sum=0,temp;    
		int num=121;
  
		temp=num;    
	
		while(n>0)
		{    
			tempp=num%10; 
			sum=(sum*10)+tempp;   
			num=num/10;   
		}    
		
		if(temp==sum)    
		System.out.println("palindrome number ");    
		else    
		System.out.println("not palindrome");    
	}  
}  
