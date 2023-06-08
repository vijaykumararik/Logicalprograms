package com;

import java.util.Scanner;

public class number {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter string");
	String s1=s.nextLine();
	char x[]=s1.toCharArray();
	System.out.println("array is");
	for(int i=0;i<x.length;i++)
	{
		System.out.print(x[i]+" ");
	}
	System.out.println();
	int c=0,d=0,e=0;
	for(int i=0;i<s1.length();i++)
	{
		if(s1.charAt(i)>='a'&&s1.charAt(i)<='z')
		{
			c++;
		}else if(s1.charAt(i)>='0'&&s1.charAt(i)<='9'){
			d++;
		}else {
			e++;
		}
	}
	System.out.println(" alphabets: "+c+" numericals: "+d+" special charectors: "+e);
}
}
