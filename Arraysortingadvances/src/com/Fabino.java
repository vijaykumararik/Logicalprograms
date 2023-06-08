package com;
import java.util.Scanner;
public class Fabino {
	public static boolean test(int n) {
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
	Scanner s1=new Scanner(System.in);
	System.out.println("enetr size");
	int size=s1.nextInt();
	System.out.println("enetr "+size+" elements");
	int a[]=new int[size];
	for (int i = 0; i < a.length; i++) {
		a[i]=s1.nextInt();
	}
	int sum=0;
	for (int i = 0; i < a.length; i++) {
		if(test(a[i])==true) {
			sum=sum+a[i];
		}
	}
	System.out.println("sum :"+sum);
	
}
}
