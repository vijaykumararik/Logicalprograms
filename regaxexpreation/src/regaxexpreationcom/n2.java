package regaxexpreationcom;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class n2 {
public static void main(String[] args) {
	String s="xyzAbc";
	Pattern p=Pattern.compile("[a-z,A-Z]{2,6}");
	Matcher m=p.matcher(s);
	boolean ans=m.matches();
	System.out.println(ans);
}
}
