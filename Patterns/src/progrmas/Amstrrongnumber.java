package progrmas;

import java.util.Scanner;

public class Amstrrongnumber {
//sum of power of count of each digit equal to same number
	// exmp 143=1^3+4^3+3^3;
	public static int pow(int exp,int base)
	{
		int val=1;
		for(int i=1;i<=exp;i++)
		{
			val=val*base;
		}
		return val; 
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		int sum=0,rem=0,n1=n,n2=n,c=0;
		while(n!=0)
		{
			c++;
			n=n/10;
		}
		while(n1!=0)
		{
			rem=n1%10;
			sum=sum+pow(c,rem);
			n1=n1/10;
		}
		if(sum==n2)
		{
			System.out.println("amstrong number");
		}
		else 
			{
				System.out.println(" not amstrong number");
			}
		
	}
}
