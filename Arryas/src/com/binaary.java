package com;

public class binaary {
public static void main(String[] args) {
	int n=16;
	int rem=0;
	String s="";
	while(n!=0)
	{
		rem=n%2;
		s=rem+s;
//		System.out.print(rem);
		n=n/2;
	}
	System.out.println(s);
//	char []c=s.toCharArray();
//	for(int i=c.length-1;i>=0;i--)
//	{
//		System.out.print(c[i]);
//	}
//	for (int i = s.length()-1; i >=0 ; i--) {
//		System.out.print(s.charAt(i));
//	}
}
}