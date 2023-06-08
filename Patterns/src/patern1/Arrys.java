package patern1;

public class Arrys {
public static void main(String[] args) {
	int []a= {2,3,4,5,6,7,8,9};
	int k=0;
	for(int i=a.length-1;i>=0;i--)
	{
		if(k<=a.length-1) {
		a[k]=a[i];
		System.out.println(a[k]);
		k++;
		}
	}
	
}
}
