package com;

import java.util.Scanner;


public class newOwell {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter string");
	String s1=s.nextLine().toLowerCase();
	int c1=0,c2=0,c3=0,c4=0,c5=0;
	for(int i=0;i<s1.length();i++)
	{
		char ch=s1.charAt(i);
		if(ch=='a') {c1++;
	}else if(ch=='e') {c2++;
	}else if(ch=='i') {c3++;
	}else if(ch=='o') {c4++;	
	}else if(ch=='u') {c5++;	
	}
		
	}
	if(c1==0) {
		System.out.println(" a");
	}
	if(c2==0) {
		System.out.println("e");
	}
	if(c3==0) {
		System.out.println("i");
	}
	if(c4==0) {
		System.out.println("o");
	}
	if(c5==0) {
		System.out.println("u");
	}
	if(c1>0&&c2>0&&c3>0&&c4>0&&c5>0) {
		System.out.println("present");
	}
		
	
}
}


