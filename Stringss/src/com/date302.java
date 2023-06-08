package com;

import java.util.Scanner;

public class date302 {
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter size");
	int size=s.nextInt();
	
	char a[]=new char[size];
	String s1="";
//	s.nextLine();
	for (int i = 0; i <=size; i++) {
		a[i]=s.next().charAt(0);
		
	}
	for (int i = 0; i < a.length; i++) {
		s1=s1+a[i];
	}
	System.out.println(s1);
	
}
}
