 package com;
//replacing array elements by sumof factors
public class Arry {
  static int sum(int a)
 {
	 int sum=0;
	 for(int i=1;i<=a;i++)
	 {
		if(a%i==0)
		{
			sum=sum+i;
		}
	 }
	 return sum;
 }
  public static void main(String[] args) {
	int []a= {1,2,3,4,5,6};
	for(int i=0;i<a.length;i++)
	{
		a[i]=sum(a[i]);
		System.out.println(a[i]);
	}
	
}
}
