package com;

import java.util.Scanner;

public class SuminString {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enetr the String");
	String s1=s.nextLine();
	String s2="";
	for (int i = 0; i < s1.length(); i++) {
		
		if(s1.charAt(i)>='0'&&s1.charAt(i)<='9'||s1.charAt(i)==' ') {
			s2=s2+s1.charAt(i);
		}
	}s2=s2+" ";
	
	int sum=0;String s3="";
	System.out.println(s2);
	for (int i = 0; i < s2.length(); i++) {
		if(s2.charAt(i)==' ') { 
			
			
			int num=0,a1=1;
			   for (int j = s3.length()-1; j >= 0; j--) {
				num=num+a1*(int)(s3.charAt(j)-48);
				
				a1*=10;
//				System.out.println(num);
			}
//			   System.out.println(num);
			   sum=sum+num;
			   s3="";
		 
		}else {
			
			s3=s3+s2.charAt(i);
//			System.out.println(s3);
		}
	}
	System.out.println("sum is"+sum);
//	1}
}
