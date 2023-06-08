package patern1;

public class new2 {

	public static void main(String[] args) {
		int b=10;
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"  "+b+" "+(i+10)+" "+(b+10));
			b--;
		}
		for(int i=1,j=10;i<=10;i++,j--)
		{
			System.out.println(i+" "+j);
		}

	}

}
