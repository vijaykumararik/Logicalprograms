package com;

import java.util.Scanner;

//reverse only charector and other numerical or special charectors
public class STRCLL {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter");
		String s1 = sc.nextLine();
		String s2 = "";
		String s3="";
		for (int i = s1.length()-1; i>=0; i--) {
			char c=s1.charAt(i);
			if(c>='a'&&c<='z'||c>='A'&&c<='Z')
			{
				s2=s2+c;
			}
		}
		int k=-1;
		for (int i = 0; i<s1.length(); i++) {
			char c=s1.charAt(i);
			if(!(c>='a'&&c<='z'||c>='A'&&c<='Z'))
			{
				s3=s3+c;
			}else {
				k++;
				s3=s3+s2.charAt(k);
			}
		}
		System.out.println(s3);
	}
	
}
