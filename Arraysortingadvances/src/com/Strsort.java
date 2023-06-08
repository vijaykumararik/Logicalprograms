package com;
//sort the String
public class Strsort {
public static void main(String[] args) {
	String s="hello";
	char a[]=s.toCharArray();char temp='o';
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if(a[i]>a[j]) {//swap the elements
				 temp=a[j];
				 a[j]=a[i];
				a[i]=temp;	
			}
		}
		System.out.println(a[i]);
	}
}
}
