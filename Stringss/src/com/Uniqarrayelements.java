package com;

import java.util.Scanner;
//uniqe elements in array print
public class Uniqarrayelements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("enetr "+size+" elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			int c=0;
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j]) {
					c++;
				}
			}
			if(c==1) {
				System.out.print(a[i]+" ");
			}
		}
}
}
