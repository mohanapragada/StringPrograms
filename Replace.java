package com.css.replace;

public class Replace {
	
	    public static void main(String[] args) {
	       String str = "It is a beautiful house...";
	       System.out.println("String: "+str);
	       int position = 8;
	       char replace = 'p';
	       String res = str.substring(0, position) + replace + str.substring(position + 1);
	       System.out.println("String after replacing a character: "+res);
	    }
}
