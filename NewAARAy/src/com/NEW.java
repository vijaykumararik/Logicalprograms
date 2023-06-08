package com;

public class NEW {
public static void main(String[] args) {
	int[][]a= {{2,7,8},{11,14,18},{12,17,19}};
	int[][]b=new int[3][3];
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			if(a[i][j]%2==0) {
				b[i][j]=0;
			}else {
				b[i][j]=1;
			}
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
	}
}
}
