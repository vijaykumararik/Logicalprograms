package com;

import java.util.Scanner;

public class qa1 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter ");
	String s1=s.nextLine();
	char c1[]= s1.toCharArray();
	char c2[]=s1.toCharArray(); 
	
	for (int i = 0; i < c1.length; i++) {
		int c=0,d=0;
		for (int j = 0; j < c2.length; j++) {
			if(c1[i]==c2[j]) {
				c++;
				c2[j]='\0';
			}
			}
					
		if(c>0) {
		System.out.println(s1.charAt(i)+" "+c);}
	}
	char c='\1';
	System.out.println((int)c);
}
}
