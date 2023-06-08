package demo;

import java.util.Scanner;

public class Assign1 {
public static void main(String[] args) {
	System.out.println("=======Welcome to simple calci======");
	Scanner s=new Scanner(System.in);
	System.out.println("enter the 2 numbers");
	int a=s.nextInt();
	int b=s.nextInt();
	System.out.println("===menu===");
	System.out.println("1:add\n2:sub\n3:mul\n4:div\n5:mod\n6:exit");
	 int c=s.nextInt();
	 if(c==1)
	 {
		 System.out.println("add: "+(a+b));
	 }
	 else if(c==2)
	 {
		 System.out.println("sub: "+(a-b));
	 }
	 else if(c==3)
	 {
		 System.out.println("mul: "+(a*b));
	 }
	 else if(c==4)
	 {
		 System.out.println("div "+(a/b));
	 }
	 else if(c==5)
	 {
		 System.out.println("mod "+(a%b));
	 }
	 else if(c==6)
	 {
		 System.out.println("thank you");
	 }
	 else 
	 {
		 System.out.println("invalid");
	 }
	 
	
}
}
