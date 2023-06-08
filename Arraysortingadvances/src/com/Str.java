package com;

public class Str {
public static void main(String[] args) {
	String s="hello";
	char a[]=s.toCharArray();
	String s1="olehl";
	char b[]=s1.toCharArray();
	char temp='0',temp1='0';
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if(a[i]>a[j]) {
			  temp=a[i];
			  a[i]=a[j];
			  a[j]=temp;
			}
		}
	}
	String a1=new String(a);
	System.out.println(a);
	for (int i = 0; i < b.length; i++) {
		for (int j = i+1; j < b.length; j++) {
			if(b[i]>b[j]) {
			  temp1=b[i];
			  b[i]=b[j];
			  b[j]=temp1;
			}
		}
	}
	String b1=new String(b);
	System.out.println(b);
	if(a1.equalsIgnoreCase(b1)) {
		System.out.println("correct");
	}else {
		System.out.println("not correct");
	}
}
}
