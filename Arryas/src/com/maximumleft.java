package com;

public class maximumleft {
 
	public static void main(String[] args) {
		int[]a= {122,5,48,32,124,74,52,632};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(i==0)
			{
				a[i]=-1;
			}
			else if(a[i]>=max)
			{
				a[i]=-1;
			}
			else {
				
				a[i]=max;
			}
			System.out.println(a[i]);

		}
		System.out.println();
	}
}
