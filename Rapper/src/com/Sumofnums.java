package com;
//sum of numbers in string
public class Sumofnums {
public static void main(String[] args) {
	String s="hello 234 kik 454 43 .jkk";
	String a[]=s.split(" ");int sum=0;
	for (String st : a) {
		if(st.charAt(0)>='0'&&st.charAt(0)<='9') {
			sum=sum+Integer.parseInt(st);
		}
	}
	System.out.println(sum);
}
}
