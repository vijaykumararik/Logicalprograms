package com;

import java.util.Scanner;

public class new11 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.next();
	String s2="";
	for (int i = s1.length()/2; i < s1.length(); i++) {
		s2=s2+s1.charAt(i);
	}
}
}
