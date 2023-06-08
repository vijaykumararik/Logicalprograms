package demo;

import java.util.Scanner;

public class scannerclass {
  public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	Scanner s1=new Scanner(System.in);
	System.out.println("enter your id ");
	int n1=s.nextInt();
	System.out.println("enetrd id is "+n1);
	System.out.println("enter your name");
	String n2=s1.next();
	System.out.println("your name "+n2);
	
  }
}
