package com;
//to find out the longest palindrome in the givn string 
public class Longpalindrome {
	public static boolean  palindrome(String s) {
		String s1="";
		for (int i = 0; i < s.length(); i++) {
			s1=s.charAt(i)+s1;
		}
		return s.equalsIgnoreCase(s1);
	}
public static void main(String[] args) {
	String s="abacdeaa12bbb21aac";
	String ans=s.charAt(0)+"";
	for (int i = 0; i < s.length(); i++) {
		String temp="";
		for (int j = i; j < s.length(); j++) {
			temp+=s.charAt(j);
			if(palindrome(temp)) {
				if(ans.length()<temp.length()) {
					ans=temp;
				}
			}
		}	
	}
	System.out.println(ans);
}
}
