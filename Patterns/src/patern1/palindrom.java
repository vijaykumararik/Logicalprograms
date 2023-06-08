package patern1;

import java.util.Scanner;

public class palindrom {
public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
	  System.out.println("enter number");
	  int n=s.nextInt();
	 int rev=0,n1=n,rem=0;
	  while(n!=0)
	  {
		  rem=n%10;
		  rev=rev*10+rem;
		  n=n/10;
		  
	  }
	  if(rev==n1)
	  {
		  System.out.println("palindrome number");
	  }
	  else {
		  System.out.println("not palindrome number");
	  }
}
}
