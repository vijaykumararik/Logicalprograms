package demo;
import java.util.Scanner;
public class Primenmbers {
	public static boolean prime(int n) {
		int c=0;
		for (int i = 1; i <=n; i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {
			return true;
		}
		return false;
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter number");
	int n=s.nextInt(); int c=0;
	for (int i = 1;; i++) {
		if(prime(i)==true) {
			c++;
			if(c==n) {
			System.out.print(i);
			break;
			}
		}
	}
}
}
