package com;

public class Test {
	public static boolean  prime(int n) {
		int c=0;for (int i = 1; i <= n; i++) {
			if(n%i==0) {
				c++;
			}
			
		}
		if(c==2) {
			return true;
		}
		
		return false;
	}
public static void main(String[] args) {
	int n=30;
	int a[]= {5,7,24,54,13,8,12,31,56,12,17};int c=0;int sum=0;
	for (int i = 0; i < a.length; i++) {
//		System.out.println(a[i]);
//		System.err.println(prime(a[i]));
		if(prime(a[i])==true) {
			
			sum=sum+a[i];
			c++;
		}
		if(sum>=n) {
			break;
		}
		System.out.println(c+"--");
	}
	System.out.println(c);
}
}
