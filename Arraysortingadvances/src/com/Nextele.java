package com;
//sorting of an array
public class Nextele {
public static void main(String[] args) {
	int a[]= {5,3,2,4,1};int temp=0;
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if(a[i]>a[j]) {//swap the elements
				 temp=a[j];
				 a[j]=a[i];
				a[i]=temp;	
			}
		}
		System.out.println(a[i]);
	}
	
}
}
