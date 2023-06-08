package com;

import java.util.Scanner;

//
public class new2 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.next();
	String s2="";
	int a=s1.length();
	for (int i = 0; i < s1.length(); i++) {
		
		for (int j = 0; j <a ; j++) {
			System.out.print(s1.charAt(j));
		}
		System.out.println();
		if(a>0) {
			a--;
		}
	}
}
}
