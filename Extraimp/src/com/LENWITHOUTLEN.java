package com;
//length of charectors without length function 
public class LENWITHOUTLEN {
public static void main(String[] args) {
	 String s="hellomydear";int len=0;
  try {
	for (int i = 0;s.charAt(i)!='\0' ; i++) {
		len++;
	}
} catch (Exception e) {
 System.out.println(len);
}
}
}
