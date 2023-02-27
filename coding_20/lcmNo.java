class lcmNo
{
public static void main(String args[])
	{
		int a = 22, b = 88, gcd = 1;  

	for(int i = 1; i <= a && i <= b; i++)  
	{  
  
		if(a%i==0 && b%i==0)  

		gcd = i;  
	}  
	
	int lcm=(a*b)/gcd;

	System.out.printf("GCD of " + a +" & " +b +" is " + lcm); 
		
	}
}