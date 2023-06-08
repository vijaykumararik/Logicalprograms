package com;

import java.util.Scanner;

public class BraketswitString {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enetr the String");
	String s1=s.nextLine();
	int x=0,y=0,t=0;
	for (int i = 0; i < s1.length(); i++) {
		char c=s1.charAt(i);
		if(s1.charAt(0)==')') {
			 t=1;
			break;
			
		}else if(c=='(') {
			y++;
		}else if(c==')') {
			x++;
		}
		
	}if(t==1) {
		System.out.println("not balenced");
	}else {
	if(x==y) {
		System.out.println("balenced "+ x);
	}else  {
		System.out.println("not balenced");
	}}
	
}
}
