package demo;

import java.util.Scanner;

public class class1 {
	public static void main(String[] args) {
		//find given char is special or not
//		char c='@';
//		 if(c>='a'&&c<='z'||c>='A'&&c<='Z'||c>='0'&&c<='9')
//		 {
//			 System.out.println("given char  not is special charector");
//		 }
//		 else
//		 {
//			 System.out.println("given char  is special charector");
//		 }
/*	    for only alpha checking
		char c='a';
		if(c>='a'&&c<='z'||c>='A'&&c<='Z')
		{
			System.out.println("given is alphabet");
		}
		else
		{
			System.out.println("not alphabet");
		}
		//checking the numerical value
		*/ 
//		char c='2';
//		if/*(c>=48&&c<=57)  or */(c>='0'&&c<='9')
//		{
//			System.out.println("given is numeric value");
//		}
//		else 
//		{
//			System.out.println("not numeric");
//		}
		//if else if statement 
		/*int n=56;
		if(n>=90)
		{
			System.out.println("A");
		}
		else if(n>=75)
		{
			System.out.println("B");
		}
		else if(n>=65)
		{
			System.out.println("c");
		}
		else if(n>=50)
		{
			System.out.println("D");
		}
		else if(n>=35)
		{
			System.out.println("E");
		} else
		{
			System.out.println("fail");
		}
		*/
//		int age=25;
//		if(age<=5)
//		{
//			System.out.println("drinking milk");
//		}
//		else if(age<=10)
//		{
		
		
//			System.out.println("drinking boost");
//		}
//		else if(age<=15)
//		{
//			System.out.println("drinking fruit juice");
//		}
//		else if(age<=20)
//		{
//			System.out.println("drinking cool drinks");
//		}
//		else if(age<30)
//		{
//			System.out.println("drinking OMR");
//		}
//		else if(age<=45)
//		{
//			System.out.println("drinking JD");
//		}
//		else
//		{
//			System.out.println("drinking ORS");
//		
		Scanner s=new Scanner(System.in);
		while(true)
		{
			System.out.println("enter charector");
			char c=s.next().charAt(0);
					if(c>='a'&&c<='z'||c>='A'&&c<='Z')
					{
						System.out.println("given is alphabet");
					}
					else if(c>='0'&&c<='9')
					{
						System.out.println("given is numeric");
					}
					else
					{
						System.out.println("given is special charector");
					}
					if(c=='e')
					{
						System.exit(0);
					}
		}
	}
}
		//}
		//gratest of 3 numbers
//		int a=20,b=40,c=20;
//		if(a>b&&a>c)
//		{
//			System.out.println(a+" a is grater");
//		}
//		else if(b>c)
//			{
//				System.out.println(b+"b is garter");
//			}
//			else 
//			{
//				System.out.println(c+"c is grater");
//			}
		
//}
		
//	 char c='a';
//	 if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
//	 {
//		 System.out.println("given char is vowel");
//	 }
//	 else 
//	 {
//		 System.out.println("not vowel");
//	 }
 
	


