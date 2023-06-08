  package com;
//comparing the sum of elements of arrays to maximum of the array
public class AAss {
public static void main(String[] args) {
	int a[] ={12,1,2,4,5,12,36};
	int max=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	} 
	int val=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]!=max)
		{
			val=val+a[i];
		}
		
	}
	if(val==max)
	{
		System.out.println("equal");
	}else {
		System.out.println(" not equal");
	}
}
}
