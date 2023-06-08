package com;

public class sumofdublicate {
public static void main(String[] args) {
	int a[]= {30,30,20,5,10,30};int sum=0;int b[]=a;
	for (int i = 0; i < a.length; i++) {
		int c=0;int t=0;
		for (int j = 0; j < b.length; j++) {
			if(a[i]==b[j])
			{ 
				c++;
//				t=b[j];
//				b[j]='\0';
			}
		}
		if(c>1) { 
			sum=sum+a[i];
		
		}
	}
	System.out.println(sum);
}
}
