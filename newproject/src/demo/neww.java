package demo;

public class neww {
public static void main(String[] args) {
	
	int  n=7; int c=0;
	for (int i = 1; i <=n; i++) {
	if(n%i==0)
	{
		c++;
	}
	}
	if(c==2)
	{
		System.out.println("prime");
	}
	else 
	{
		System.out.println("not prime");
	}
}
}
