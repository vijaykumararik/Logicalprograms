package com;

import java.util.Scanner;

public class PlindromeString {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter string");
	String s1=s.nextLine();
	String s2="";
	for(int i=s1.length()-1;i>=0;i--)
	{
		s2=s2+s1.charAt(i);
		
	}
	if(s1.equals(s2))
	{
		System.out.println("palindrome");
	}else {
		System.out.println("not palindrome");
	}
}
}
