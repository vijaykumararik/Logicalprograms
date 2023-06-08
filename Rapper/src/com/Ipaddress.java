package com;

public class Ipaddress {
public static void main(String[] args) {
	String s="123.45.162";
	String a[]=s.split("[.]");boolean x=true;
	for (int i = 0; i < a.length; i++) {
//		System.out.println(a[i]);
		if(Integer.parseInt(a[i])>250) {
			x=false;
			break;
		}
	}
	if(x==false) {
		System.out.println("invalid");
	}else {
		System.out.println("valid");
	}
}
}
