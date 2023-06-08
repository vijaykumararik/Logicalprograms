package com;

public class HELL {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6};int n=6;
	int a[]=new int[n];int x=0;int y=n-1;
	for(int i=0;i<n;i++) {
		a[i]=arr[y];
		y--;i++;
		a[i]=arr[x];
		x++;
		
	}
	for(int i=0;i<n;i++) {
		arr[i]=a[i];
		System.out.println(arr[i]);
	}
}
}
