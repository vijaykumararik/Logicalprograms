package com;
//at last b should be more then or equals to array a
public class Two {
public static void main(String[] args) {
    int []a= {5,7,10,5,15};
    int []b= {2,2,1,3,5};int k=1;
	for (int j = 0; j < k; j++) {int c=0;
		for (int i = 0; i < a.length; i++) {
			if(b[i]<a[i]) {
				a[i]=(a[i]-b[i]);
				
			} else {
				a[i]=a[i];
				c++;
			}
//			System.out.print(a[i]+" "+"("+c+")");	
		}
		if(c==5) {
			System.out.println(k-1);
			break;
		}
		k++;
//		System.out.println();
	}
}
}
