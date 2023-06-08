package patern1;

public class p1 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(j==5||i==1||j==1||i==5)
			{
			System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}	
		}
		System.out.println();
	}
	System.out.println("1=============");
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(j==i)
			{
			System.out.print("*");
			}
			else {
				System.out.print("  ");
			}	
		}
		System.out.println();
	}
	System.out.println("2=============");
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i+j==6)
			{
			System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}	
		}
		System.out.println();
	}
	System.out.println("3=============");
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(j==i||i+j==6)
			{
			System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}	
		}
		System.out.println();
	}
	System.out.println("4=============");
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(j==5||i==1||j==1||i==5)
			{
			System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}	
		}
		System.out.println();
	}
	System.out.println("5=============");
	int n=5;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i==j||i+j==n+1)
			{
			System.out.print("  ");
			}
			else {
				System.out.print("*  ");
			}	
		}
		System.out.println();
	}
	System.out.println("6=============");
	
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	System.out.println("7=============");
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i==j||i==1||j==1)
			{
			System.out.print("*  ");
			}
			else {
				System.out.print("  ");
			}	
		}
		System.out.println();
	}
	System.out.println("8=========");
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i+j==6||i==5||j==1)
			{
			System.out.print("*  ");
			}
			else {
				System.out.print("  ");
			}	
		}
		System.out.println();
	}
	System.out.println("9=========");
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(j>=i)
			{
			System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}	
		}
		System.out.println();
	}
	System.out.println("10=========");
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i+j<=6)
			{
			System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}	
		}
		System.out.println();
	}
	System.out.println("11=========");
	for(int i=1;i<=5;i++)
	{  char k='A';
		for(int j=1;j<=5;j++)
		{    
			if(i+j<=6)
			{
			System.out.print(k+" ");
			k++;
			}
			else {
				System.out.print("  ");
			}	
		}
		System.out.println();
	}
	System.out.println("12=========");
	for(int i=1;i<=5;i++)
	{  char k='A';
		for(int j=1;j<=5;j++)
		{    
			if(i>=j)
			{
			System.out.print(k+" ");
			k++;
			}
			else {
				System.out.print("  ");
			}	
		}
		System.out.println();
	}
	System.out.println("13=========");
	for(int i=1;i<=5;i++)
	{  char k='A';
		for(int j=1;j<=5;j++)
		{    
			if(i>=j)
			{
			if(i==1||i==3||i==5){
				System.out.print(k+" ");
				k++;
			}
			else {
				System.out.print(j+" ");
			}
			}
			else {
				System.out.print("  ");
			}	
		}
		System.out.println();
	}
	System.out.println("14+++++++++++===");
	for(int i=1;i<=5;i++)
	{  char k='A';
		for(int j=1;j<=5;j++)
		{    
			if(i>=j)
			{
			if(i==1||i==3||i==5){
				System.out.print(j+" ");
				
			}
			else {
				System.out.print(k+" ");
				k++;
			}
			}
			else {
				System.out.print("  ");
			}	
		}
		System.out.println();
	}
	System.out.println("15=============");
	char k='A';
	for(int i=1;i<=5;i++)
	{  
		for(int j=1;j<=5;j++)
		{    
			if(i>=j)
			{
			if(i==1||i==3||i==5){
				System.out.print(k+" ");
			}
			else {
				System.out.print(i+" ");	
			}
			}
			else {
				System.out.print("  ");
			}
		}
		k++;
		System.out.println();
	}
	System.out.println("16===========");
	char h='A';
	for(int i=1;i<=5;i++)
	{  
		for(int j=1;j<=5;j++)
		{    
			if(i>=j)
			{
			if(i==1||i==3||i==5){
				System.out.print(h+" ");
			}
			else {
				System.out.print(j+" ");	
				
			}
			}
			else {
				System.out.print("  ");
			}
		}
		if(i==1||i==3||i==5) {
			h++;
		}
		
		System.out.println();
	}
	System.out.println("17===========");

	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i==j||i==1||j==5)
			{
			System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}	
		}
		System.out.println();
	}
	System.out.println("18===========");
	
	
	
}
}
