package com;

import java.util.Scanner;

public class special {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enetr char");
	char c=s.next().charAt(2);
	if(c>='A'&&c<='Z'||c>='a'&&c<='z')
	{
		System.out.println("alphabet");
	}else if(c>='0'&&c<='9')
	{
		System.out.println("numeric");
	}else {
		System.out.println("special charector");
	}
}
}
