class equalityofarray
{
	public static void main(String args[])
	{
		int a[] = { 11, 30, 12 ,74,43};
      
        int b[] = { 10, 39, 12,9 };
  
		boolean result = true;
  
        if (a.length == b.length) 
		{
            for (int i = 0; i < a.length; i = i + 1) 
			{
                
                if (a[i]!= b[i]) 
				{
                   result = false;
                }
            }
        }
        else
		{
          result = false;
        }
        
        
        if (result == true)
		{
            System.out.println("Arrays are equal");
        }
        else 
		{
            System.out.println("Arrays are not equal");
        }
    }
}