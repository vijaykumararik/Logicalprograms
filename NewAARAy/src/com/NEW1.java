package com;

import java.util.Scanner;
//input 2d array using scanner class
public class NEW1 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter row size");
	int x=s.nextInt();
	System.out.println("enetr col size");
	int y=s.nextInt();
	int a[][]=new int[x][y];
	System.out.println("enetr "+(x*y)+" elements");
	for (int i = 0; i < x; i++) {
		for (int j = 0; j < y; j++) {
			a[i][j]=s.nextInt();
		}
	}
	for (int i = 0; i < x; i++) {
		for (int j = 0; j < y; j++) {
		System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	
}
}
