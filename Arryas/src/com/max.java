package com;
//maximum of number prime or not 
public class max {
	static boolean prime(int n)
	{   int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		int a[]= {20,100,40,137,50};
		
		int max=a[0],min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
			
		}
	    if(prime(max)==true)
	    {
	    	System.out.println("maximum is prime number "+max);
	    }else {
	    	System.out.println(" maximum is not prime "+max);
	    }
		
	
	}
}
