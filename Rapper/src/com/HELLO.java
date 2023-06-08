package com;
//make me big number
public class HELLO {
public static void main(String[] args) {
	int a=1185249;
	char b[]=String.valueOf(a).toCharArray();
//	System.out.println(b);
	char temp='0';
	for (int i = 0; i < b.length; i++) {
		for (int j = i+1; j < b.length; j++) {
			if(b[i]<b[j]) {
				temp=b[i];
				b[i]=b[j];
				b[j]=temp;
			}
		}
		System.out.print(b[i]);
	}
	
}
}
