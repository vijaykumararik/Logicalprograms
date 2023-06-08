package patern1;

import java.util.Scanner;

public class assmentprime {
	static int prime(int n)
	   {int c=0;
		   for(int i=1;i<=n;i++)
		   {
			   if(n%i==0)
			   {
				   c++;
			   }
		   }
		   if(c==2)
		   {
			   return 1;
		   }
		   else {
			   {
				   return 0;
			   }
		}
	   }
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("enter value");
			int key=s.nextInt();
			System.out.println("enter value");
			int key2=s.nextInt();
			
			int n=1,c=0;
			while(true)
			{
				int ans=prime(n);
				if(ans==1)
				{
					if(n>key) {
					c++;}
					
				}
				if(c==key2)
				{
					System.out.println(n);
					break;
				}
				n++;
			}
			
		}
}
