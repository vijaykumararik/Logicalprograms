package patern1;

import java.util.Scanner;

public class aassfibinoci {
	public static boolean prime(int n)
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
		}
		else {
			return false;
		}
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter value");
	int  n=s.nextInt();
	int sum=0,a=0,b=1,c=0;
	while(true)
	{
//		System.out.print(sum+" ");
		c++;
		a=b;
		b=sum;
		sum=a+b;
		if(c==n)
		{
			if(prime(sum%10)==true)
			{
				System.out.println(sum+": the  last digit is prime number");
				break;
			}else {
				System.out.println(sum+": last digit is not prime");
				break;
			}
		}
		
		
	}
}
}
