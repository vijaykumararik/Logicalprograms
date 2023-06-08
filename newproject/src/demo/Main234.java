package demo;

import java.util.Iterator;
import java.util.Scanner;

public class Main234 {
public static void main(String[] args) {
	//finding the power of the number ex--2^3
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter base of number");
//	int base=sc.nextInt();
//	System.out.println("enter exp of number");
//	int exp=sc.nextInt();
//	int val=1;
//	for (int i = 1; i <=exp; i++) {
//		val=val*base;
//	}
//	System.out.println(val);
	//cheack the given number is perfect square or not
	Scanner s=new Scanner(System.in);
	System.out.println("enter number to cheak");
	int n=s.nextInt();
	int c=0;
	for (int i = 1; i<=n; i++) {
		if(n==i*i)
		{
			System.out.println("perfect square");
			c=1;
			break;
		}
	}
	if(c==0)
	{
		System.out.println("not perfect");
	}
}
}
