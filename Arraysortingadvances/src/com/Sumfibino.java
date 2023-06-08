package com;

import java.util.Scanner;

public class Sumfibino {
	public static boolean prime(int n) {
		int c=0;
		for (int i = 1; i <=n; i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {
			return true;
		}
		return false;
	}
	public static boolean fibino(int n) {
		int a=0,b=1,sum=0;
		while(sum<n) {
			a=b;
			b=sum;
			sum=a+b;
		}
		if(sum==n) {
			return true;
		}
		return false;
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enetr size");
	int size=s.nextInt();
	System.out.println("enter"+size+" elements");
	int a[]=new int[size];
	for (int i = 0; i <a.length; i++) {
		a[i]=s.nextInt();
	}
	int sum=0;
	for (int i = 0; i < a.length; i++) {
		sum=sum+a[i];
	}
	if(prime(sum)==true&&fibino(sum)==true) {
		System.out.println("prime fibinocci");
	}else {
		System.out.println("not prime fibnocci");
	}
}
}
