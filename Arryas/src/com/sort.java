package com;

public class sort {
public static void main(String[] args) {
	int[]a= {20,45,67,10,34,79};
	int []b=new int[a.length];
	int k=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=1;j<a.length;j++)
		{
			if(a[i]>a[j]) {
				b[k]=a[i];
				System.out.println(b[k]);
				k++;
			}
		}
	}
}
}
