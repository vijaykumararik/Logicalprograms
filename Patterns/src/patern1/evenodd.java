package patern1;

public class evenodd {
public static void main(String[] args) {
	 int n=6;
	 switch (n%2) {
	case 0:
		System.out.println("even");
		break;

	default:System.out.println("odd");
		break;
	}
	 int res=n%2==0?1:0;
	 System.out.println(res);
}
}
