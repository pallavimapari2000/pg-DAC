public class perfect_Bet  
{  
	static boolean isPerfectNo(int num)  
	{  
		int sum = 1;  
  
	for (int i = 1; i * i <= num; i++)  
	{  
		if (num % i==0)  
		{  
			if(i * i != num)  
			sum = sum + i + num / i;  
			else  
			sum = sum + i;  
		}  
}  
	if (sum == num && num != 1)   
	return true;   
	return false;  
}  
		public static void main (String args[])  
	{  
		System.out.println("Perfect Numbers between 1 to 1000 are: ");  

		for (int n = 1; n < 1000; n++)  
 
		if (isPerfectNo(n))  
		System.out.println(n +" is a perfect number");  
	}  
}  
