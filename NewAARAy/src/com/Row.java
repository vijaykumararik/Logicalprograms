package com;

public class Row {
public static void main(String[] args) {
	int[][]a= {{2,7,8},{11,14,18},{12,17,19}};int row=0;
//	int[][]b=new int[3][3];
	int sum,max=a[0][0];
	for (int i = 0; i < a.length; i++) {
		sum=0;
		for (int j = 0; j < a.length; j++) {
			sum=sum+a[i][j];
			
		}
		if(sum>max) {
		max=sum;
		row=i;
		}
	}
	System.out.println(row);
}
}
