package demo;

import java.util.Scanner;

public class LOVEfaliure {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter heart rating ");
	int heartrate=s.nextInt();
	System.out.println("enetr lever rating");
	int leverrate=s.nextInt();
	if(heartrate>5&&leverrate>6)
	{
		System.out.println("love failiure");
	}
	else
	{
		System.out.println("no love  failure");
	}
	
	
}
}
