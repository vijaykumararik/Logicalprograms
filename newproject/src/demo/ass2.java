package demo;

public class ass2 {
public static void main(String[] args) {
	  int n=2021;
	if(n%4==0)
	{
		System.out.println("given year is leap year1");
	}
	else if(n%400==0)
	{
		System.out.println("given is leap year2");
	}
	else {
		System.out.println("not leap year");
	}
	 int a=45,b=55,c=55;
	 if(a>b)
	 {
		 if(a>c)
		 {
			 System.out.println(a+" is grater");
		 }
		 else
		 {
			 System.out.println(c+" is grater");
		 }
	 }
	 else if(b>c)
	 {
		 System.out.println(b+" is grater");
	 }
	 else
	 {
		 System.out.println(c+" is grater");
	 }
}
}
