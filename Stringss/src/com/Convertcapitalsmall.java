package com;
import java.util.Scanner;
//convertng cpas to small alph and small to capital
public class Convertcapitalsmall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter");
		String s = sc.nextLine();
		String ns = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				char a = (char) (ch - 32);
//				ch=ch-32;
				ns = ns + a;
			} else if (ch >= 'A' && ch <= 'Z') {

				char a = (char) (ch + 32);
				ns = ns + a;
			} else {

				ns = ns + ch;
			}

		}
		System.out.println(ns);
	}
}
