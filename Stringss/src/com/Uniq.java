package com;

import java.util.Scanner;

public class Uniq {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter");
		String s1 = sc.nextLine();
		String s2 = "";
		int y = 0;
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			int x = 0;
			for (int j = 0; j < s1.length(); j++) {
				if (c == s1.charAt(j)) {
					x++;
				}
			}
			
			if (x != 1) {
				if(y==0) {
			  System.out.print(c);
			  y++;
			}
				

		}
	}
}
}
