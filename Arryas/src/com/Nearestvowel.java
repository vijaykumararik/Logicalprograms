package com;
//nearest vowel and print it 
import java.util.Scanner;

public class Nearestvowel {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the charector to check");
	char c=s.next().charAt(0);
	int a=0,f=0;
	char d='0',e='0';
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
	{
		System.out.println("nearest vowel is "+c+" in 0");
	}else {
		for(char i=c;i<='z'&&i>='a';i++)
		{ a++;
			if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u')
			{
				d=i;
				break;
			}
		}
		for(char j=c;j>='a'&&j<='z';j--)
		{ f++;
			if(j=='a'||j=='e'||j=='i'||j=='o'||j=='u')
			{
				e=j;
				break;
			}
		}
		if(a>f)
		{
			System.out.println("nearest vowel is "+d+" in  "+(a-1));
		}else {
			System.out.println("nearest vowel is "+e+" in "+(f-1));
		}
	}
}
}
