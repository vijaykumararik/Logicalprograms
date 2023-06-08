package com;

import java.util.Scanner;

//cheak fiven string is week or strong if String contains same sequences of number its week
//string if string contains same charector addgestentaly it allso week string 
//other wise strong
public class Toweekorstrong {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enetr");
	String s1=s.nextLine(); boolean flag=true;
	for (int i = 0; i < s1.length()-1; i++) {
		char c=s1.charAt(i);
		if(c>='0'&&c<='9') {
			if(c+1==s1.charAt(i+1)||c==s1.charAt(i+1)) {
				flag=false;
				break;
			}
		}else if(c==s1.charAt(i+1)) {
			flag=false;
			break;
		}
			
		}
	
	if(flag==true) {
		System.out.println("strong");
	}else {
		System.out.println("week");
	}
}
}
