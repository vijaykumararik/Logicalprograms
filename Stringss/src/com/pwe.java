package com;

import java.util.Scanner;

public class pwe {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter");
	String s1 = sc.nextLine();
	String s2 = "";
	for (int i = 0; i < s1.length(); i++) {
		char c1=s1.charAt(i);
		for (int j = 0; j < s1.length(); j++) {
			char c2=s1.charAt(j);
			System.out.print(s1.charAt(i)+""+s1.charAt(j)+" ");
		}
		System.out.println();
	}
}
}
