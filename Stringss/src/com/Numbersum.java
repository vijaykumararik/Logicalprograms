package com;
import java.util.Scanner;
//sum of elements in number
public class Numbersum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enetr");
		String s1 = s.nextLine();
		int sum = 0;
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (ch >= '0' && ch <= '9') {
				sum = sum + ch - 48;
			}
		}
		System.out.println(sum);
	}

}
