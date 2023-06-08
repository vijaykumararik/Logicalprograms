package com;

import java.util.Scanner;

public class Numbersum {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enetr number");
	int a=s.nextInt();String c="";
	String b=String.valueOf(a);
	for (int i = 0; i < b.length(); i+=2) {
		if(i+1<b.length()) {
//			String x="";
//			x=x+b.charAt(i)+b.charAt(i+1);
			if(b.charAt(i)>b.charAt(i+1)) {
				c=c+b.charAt(i);
			}else {
				c=c+b.charAt(i+1);
			}
			
		}else {
			c=c+b.charAt(i);
		}
	}
	System.out.println(c);
}
}
