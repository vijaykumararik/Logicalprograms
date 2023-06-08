package com;

import java.util.Scanner;


public class newr3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter");
	String s1 = sc.nextLine();
	String s2=new String("hgfdd");
	char[] c=s2.toCharArray();
	char a[]=new char[s1.length()];
	for (int i = 0; i < s1.length(); i++) {
		a[i]=s1.charAt(i);
		System.out.print(a[i]+" ");
	}System.out.println();
	for (int i = 0; i < s2.length(); i++) {
		System.out.print(c[i]+" ");
	}
	            
}
}
