package com;

//ofter removing charechor allso it should be palindrome
import java.util.ArrayList;

public class Palindromenew {
	public static boolean palin(String s) {
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			s1 = s.charAt(i) + s1;
		}
		if (s.equals(s1)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String s = "lev5101vel";
		String s1 = "";
		int a = 0;
		ArrayList a1 = new ArrayList<>();
		if (palin(s)) {
			System.out.println("-1");
		} else {
			for (int i = 0; i < s.length(); i++) {
				String s2 = "";
				for (int j = 0; j < s.length(); j++) {
					if (j != i) {
						s2 = s2 + s.charAt(j);
					}
				}
				if (palin(s2)) {
					a1.add(i);
				}
			}
			if (a1.size() == 0) {
				System.out.println("-2");
			} else {
				System.out.println(a1);
			}
		}

	}
}
