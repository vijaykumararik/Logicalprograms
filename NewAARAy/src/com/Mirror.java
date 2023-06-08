package com;

public class Mirror {
public static void main(String[] args) { 
	String s="abcddcba";
	String s1=s.substring(0,s.length()/2);
	String s2=s.substring(s.length()/2,s.length());
	String s3="";
	for (int i = 0; i < s2.length(); i++) {
		s3=s2.charAt(i)+s3;
	}
	if(s1.equals(s3)) {
		System.out.println("mirror");
	}else {
		System.out.println("not");
	}
}
}
