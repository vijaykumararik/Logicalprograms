package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//replace lowest largest number to words its right
public class Arraylargeright {
public static void main(String[] args) {
	int a[]= {10,99,11,5,18,117,15,21};// 11 117 15 15 21 -1 21 -1
	
	for (int i = 0; i < a.length; i++) {
		List ar =new ArrayList();
		for (int j = i+1; j < a.length; j++) {
			if(a[i]<a[j]) {
				ar.add(a[j]);
			}
		}
		Collections.sort(ar);
		if(ar.size()==0) {
			a[i]=-1;
		}else {
			a[i]=(int) ar.get(0);
		}
	}
	for (int i : a) {
		System.out.println(i+" ");
	}
}
}
