package regaxexpreationcom;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class start {
public static void main(String[] args) {
	String s="xyzAbc";
	Pattern p=Pattern.compile(".*[abc,ABC].*");
	Matcher m=p.matcher(s);
	boolean ans=m.matches();
	System.out.println(ans);
////	String z=""+'.';
//	String[] a=s.split(z);
//	for (int i = 0; i < a.length; i++) {
//		System.out.println(a[i]);
//	}
}
}
