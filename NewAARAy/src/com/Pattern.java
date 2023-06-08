package com;

public class Pattern {
public static void main(String[] args) {int a=1;
	for (int i = 1; i <= 9; i++) { 
		for (int j = 1; j <= 9; j++) { 
			if(i==j||i+j==10) {
//				if(i<5) {
				System.out.print(a+" ");
			
			}else {
				System.out.print("  ");
			}
		}
		if(i<5) {
			a++;
		}else {a--;}
	      System.out.println();
	}
}
}
